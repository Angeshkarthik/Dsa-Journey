import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static String countPalindromes(int length, String text) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < length; i++) {
            freq[text.charAt(i) - 'a']++;
        }

        // Count distinct characters
        int distinct = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                distinct++;
            }
        }

        // answer = (distinct + 1) * 2^(n - distinct)
        BigInteger ans = BigInteger.valueOf(distinct + 1)
                .multiply(BigInteger.TWO.pow(length - distinct));

        return ans.toString();
    }

    public static void main(String[] args) throws Exception {

        FastScanner scanner = new FastScanner();

        int testCount = scanner.nextInt();

        StringBuilder output = new StringBuilder();

        for (int test = 0; test < testCount; test++) {

            int length = scanner.nextInt();
            String text = scanner.next();

            output.append(countPalindromes(length, text)).append('\n');
        }

        System.out.print(output);
    }

    static class FastScanner {

        private final BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        private StringTokenizer tokens = new StringTokenizer("");

        String next() throws Exception {

            while (!tokens.hasMoreTokens()) {
                tokens = new StringTokenizer(reader.readLine());
            }

            return tokens.nextToken();
        }

        int nextInt() throws Exception {
            return Integer.parseInt(next());
        }
    }
}

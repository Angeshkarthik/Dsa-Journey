import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();
            String str = s + s;
            int ans = 0;
            int nextG = -1;
            for (int i = 2 * n - 1; i >= 0; i--) {
                if (str.charAt(i) == 'g')
                    nextG = i;
                if (str.charAt(i) == c && nextG != -1)
                    ans = Math.max(ans, nextG - i);
            }
            System.out.println(ans);
        }
    }
}

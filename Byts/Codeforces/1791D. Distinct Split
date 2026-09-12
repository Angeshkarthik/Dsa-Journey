import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int left[] = new int[n + 1];
            int right[] = new int[n + 1];

            HashSet<Character> st = new HashSet<>();

            for (int i = 0; i < n; i++) {
                st.add(s.charAt(i));
                left[i + 1] = st.size();
            }

            st.clear();

            for (int i = n - 1; i >= 0; i--) {
                st.add(s.charAt(i));
                right[i] = st.size();
            }

            int ans = 0;

            for (int i = 1; i < n; i++) {
                ans = Math.max(ans, left[i] + right[i]);
            }

            System.out.println(ans);
        }
    }
}

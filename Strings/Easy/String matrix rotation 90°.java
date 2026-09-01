import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] a = new String[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.next();
        for (int j = 0; j < n; j++) {
            for (int i = n - 1; i >= 0; i--)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}

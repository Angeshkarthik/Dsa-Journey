import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 has appeared once
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            int req = sum - k;

            if (map.containsKey(req)) {
                count += map.get(req);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);

        sc.close();
    }
}

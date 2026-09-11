import java.util.*;
public class Main{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[][]= new int[n][2];
            for(int i=0;i<n;i++){
                int a = sc.nextInt();
                arr[i][0] = a % k;
                if (arr[i][0] == 0) {
                    arr[i][0] = k;
                }
                arr[i][1]=i;
            }
            Arrays.sort(arr, (x, y) -> {
                if (x[0] != y[0])
                    return (y[0]-x[0]);
                return (x[1]-y[1]);
            });
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}

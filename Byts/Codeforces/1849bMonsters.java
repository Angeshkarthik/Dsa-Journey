//# Sorting with Original Indices
//## 📌 Concept
//This approach is useful when we need to **sort values while keeping track of their original indices**.
//Instead of storing only the value, we store:

import java.util.*;
public class Main{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr[i]=arr[i]%k;
                if(arr[i]%k==0){
                    arr[i] = k;
                }
            }
            int ans[][] = new int[n][2];
            int a=0;
            for(int i=0;i<n;i++){
                ans[i][0]=arr[i];
                ans[i][1]=i;
            }
            Arrays.sort(ans, (x, y) -> {
                if (x[0] != y[0])
                    return (y[0]-x[0]);
                return (x[1]-y[1]);
            });
            for(int i=0;i<n;i++){
                System.out.print(ans[i][1]+1+" ");
            }
            System.out.println();
        }
    }
}

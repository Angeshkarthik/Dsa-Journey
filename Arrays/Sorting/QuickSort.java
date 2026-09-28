import java.util.*;

public class Main {
    public static void quicksort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int pivot = arr[high];
        int left = low;
        int right = high;
        while(left<right){
            while(arr[left]<=pivot && left<right){
                left++;
            }
            while(arr[right]>=pivot && left<right){
                right--;
            }
            swap(arr,left,right);
        }
        swap(arr,left,high);
        quicksort(arr,low,left-1);
        quicksort(arr,left+1,high);
    }
    public static void swap(int arr[],int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void quicksort(int arr[]){
        quicksort(arr,0,arr.length-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quicksort(arr);
        System.out.print(Arrays.toString(arr));
        sc.close();
    }
}

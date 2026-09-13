class Solution {
    public void merge(int[] arr, int n, int[] arr1, int m) {
        for(int i=0;i<m;i++){
            arr[n+i]=arr1[i];
        }
        for(int i=1;i<n+m;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
}
}
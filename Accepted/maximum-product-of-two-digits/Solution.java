class Solution {
    public int maxProduct(int n) {
        int m=n,r=0,q=0,d=0;
        while(m>0){
            r++;
            d=m%10;
            q=q*10+d;
            m/=10;
        }
        int arr[] = new int[r];
        int i=0;
        while(q>0){
            arr[i]=q%10;
            q/=10;
            i++;
        }
        Arrays.sort(arr);
        int k=arr.length-1;
        return arr[k]*arr[k-1];
    }
}
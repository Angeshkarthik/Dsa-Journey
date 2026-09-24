class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int min = nums[i];
            int ans = 0;
            while(min>0){
                int r = min%10;
                ans+=r;
                min/=10;
            }
            if(ans==i)
            return i;
        }
        return -1;
    }
}
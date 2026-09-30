class Solution {
    public int compareBitonicSums(int[] nums) {
        long sumAsc = 0;
        int i = 0;
        while (nums[i] < nums[i+1]) {
            sumAsc += nums[i++];
        }
        sumAsc += nums[i];
        long sumDesc = nums[i++];
        while (i < nums.length) {
            sumDesc += nums[i++];
        }
        long res = sumAsc - sumDesc;
        if (res == 0) {
            return -1;
        } else if (res < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
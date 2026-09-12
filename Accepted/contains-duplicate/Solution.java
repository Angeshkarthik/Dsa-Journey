class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(n==set.size())return false;
        else return true;
    }
}
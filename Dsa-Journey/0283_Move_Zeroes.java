/*
 * Problem: 0283 - Move Zeroes
 * Difficulty: Easy
 * URL: https://leetcode.com/problems/move-zeroes/
 * 
 * Description:
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 *  
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 * Input: nums = [0]
 * Output: [0]
 * 
 *  
 * Constraints:
 * 
 * 
 * 	1 <= nums.length <= 104
 * 	-231 <= nums[i] <= 231 - 1
 * 
 * 
 *  
 * Follow up: Could you minimize the total number of operations done?
 * 
 * Sample Test Case:
 *   [0,1,0,3,12]
 */

class Solution {
    public void moveZeroes(int[] nums) {

        int left = 0;

        for(int right = 0; right < nums.length; right++) {
            if(nums[right]!=0){
                int t = nums[left];
                nums[left] = nums[right];
                nums[right] = t;
                left++;
            }
        }
    }
}
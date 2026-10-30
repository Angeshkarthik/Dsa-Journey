/*
 * Problem: 0169 - Majority Element
 * Difficulty: Easy
 * URL: https://leetcode.com/problems/majority-element/
 * 
 * Description:
 * Given an array nums of size n, return the majority element.
 * 
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * 
 *  
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 * 
 *  
 * Constraints:
 * 
 * 
 * 	n == nums.length
 * 	1 <= n <= 5 * 104
 * 	-109 <= nums[i] <= 109
 * 	The input is generated such that a majority element will exist in the array.
 * 
 * 
 *  
 * Follow-up: Could you solve the problem in linear time and in O(1) space?
 * 
 * Sample Test Case:
 *   [3,2,3]
 */

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int ans = -1;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>nums.length/2){
                ans=key;
            }
        }
        return ans;
    }
}
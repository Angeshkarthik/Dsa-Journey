/*
 * Problem: 0229 - Majority Element II
 * Difficulty: Medium
 * URL: https://leetcode.com/problems/majority-element-ii/
 * 
 * Description:
 * Given an integer array of size n, find all elements that appear more than ⌊n / 3⌋ times.
 * 
 *  
 * Example 1:
 * 
 * Input: nums = [3,2,3]
 * Output: [3]
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [1]
 * Output: [1]
 * 
 * 
 * Example 3:
 * 
 * Input: nums = [1,2]
 * Output: [1,2]
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	1 <= nums.length <= 5 * 104
 * 	-109 <= nums[i] <= 109
 * 
 * 
 *  
 * Follow up: Could you solve the problem in linear time and in O(1) space?
 * 
 * Sample Test Case:
 *   [3,2,3]
 */

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>nums.length/3){
                list.add(key);
            }
        }
        return list;
    }
}
/*
 * Problem: 0119 - Pascal's Triangle II
 * Difficulty: Easy
 * URL: https://leetcode.com/problems/pascal's-triangle-ii/
 * 
 * Description:
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * 
 *  
 * Example 1:
 * Input: rowIndex = 3
 * Output: [1,3,3,1]
 * Example 2:
 * Input: rowIndex = 0
 * Output: [1]
 * Example 3:
 * Input: rowIndex = 1
 * Output: [1,1]
 * 
 *  
 * Constraints:
 * 
 * 
 * 	0 <= rowIndex <= 33
 * 
 * 
 *  
 * Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
 * 
 * Sample Test Case:
 *   3
 */

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long current = 1; 
        row.add((int) current);
        for (int k = 1; k <= rowIndex; k++) {
            current = current * (rowIndex - k + 1) / k;
            row.add((int) current);
        }
        return row;
    }
}
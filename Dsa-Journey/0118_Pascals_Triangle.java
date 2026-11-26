/*
 * Problem: 0118 - Pascal's Triangle
 * Difficulty: Easy
 * URL: https://leetcode.com/problems/pascal's-triangle/
 * 
 * Description:
 * You are given an integer numRows.
 * 
 * Return the first numRows of Pascal's triangle.
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly above it and the first and last number on each row must be equal to 1, as shown below:
 * 
 *  
 * Example 1:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * Example 2:
 * Input: numRows = 1
 * Output: [[1]]
 * 
 *  
 * Constraints:
 * 
 * 
 * 	1 <= numRows <= 30
 * 
 * Sample Test Case:
 *   5
 */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } 
                else {
                    int leftAbove = triangle.get(i - 1).get(j - 1);
                    int rightAbove = triangle.get(i - 1).get(j);
                    row.add(leftAbove + rightAbove);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}
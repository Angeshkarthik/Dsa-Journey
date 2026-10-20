/*
 * Problem: 0054 - Spiral Matrix
 * Difficulty: Medium
 * URL: https://leetcode.com/problems/spiral-matrix/
 * 
 * Description:
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 * 
 *  
 * Example 1:
 * 
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 * 
 * 
 * Example 2:
 * 
 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	m == matrix.length
 * 	n == matrix[i].length
 * 	1 <= m, n <= 10
 * 	-100 <= matrix[i][j] <= 100
 * 
 * Sample Test Case:
 *   [[1,2,3],[4,5,6],[7,8,9]]
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>res = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
                res.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int j=bottom;j>=top;j--){
                    res.add(matrix[j][left]);
                }
                left++;
            }
        }
        return res;
    }
}
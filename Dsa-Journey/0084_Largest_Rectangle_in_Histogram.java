/*
 * Problem: 0084 - Largest Rectangle in Histogram
 * Difficulty: Hard
 * URL: https://leetcode.com/problems/largest-rectangle-in-histogram/
 * 
 * Description:
 * Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.
 * 
 *  
 * Example 1:
 * 
 * Input: heights = [2,1,5,6,2,3]
 * Output: 10
 * Explanation: The above is a histogram where width of each bar is 1.
 * The largest rectangle is shown in the red area, which has an area = 10 units.
 * 
 * 
 * Example 2:
 * 
 * Input: heights = [2,4]
 * Output: 4
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	1 <= heights.length <= 105
 * 	0 <= heights[i] <= 104
 * 
 * Sample Test Case:
 *   [2,1,5,6,2,3]
 */

class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans=0;
        Stack<Integer> s=new Stack<>();
        int n=heights.length;
        int lfs[]=new int[n];
        int rfs[]=new int[n];
        Arrays.fill(lfs,0);
        Arrays.fill(rfs,n-1);
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
                s.pop();
            if(!s.isEmpty())
                lfs[i]=s.peek()+1;
            s.push(i);
        }
        while(!s.isEmpty()) s.pop();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
                s.pop();
            if(!s.isEmpty())
                rfs[i]=s.peek()-1;
            s.push(i);
        }
        for(int i=0;i<n;i++){
            ans = Math.max(ans,heights[i]*(rfs[i]-lfs[i]+1));
        }
        return ans;
    }
}
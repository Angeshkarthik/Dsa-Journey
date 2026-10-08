/*
 * Problem: 0070 - Climbing Stairs
 * Difficulty: Easy
 * URL: https://leetcode.com/problems/climbing-stairs/
 * 
 * Description:
 * You are climbing a staircase. It takes n steps to reach the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 *  
 * Example 1:
 * 
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * 
 * 
 * Example 2:
 * 
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	1 <= n <= 45
 * 
 * Sample Test Case:
 *   2
 */

class Solution {
    static int cs[]=new int[46];
    static{
        cs[0]=0;
        cs[1]=1;
        cs[2]=2;
    }
    public int climbStairs(int n) {
        if(n==0||n==1)return n;
        if(cs[n]!=0)return cs[n];
        return cs[n]=climbStairs(n-1)+climbStairs(n-2);
    }
}
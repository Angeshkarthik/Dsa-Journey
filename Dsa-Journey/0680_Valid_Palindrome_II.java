/*
 * Problem: 0680 - Valid Palindrome II
 * Difficulty: Easy
 * URL: https://leetcode.com/problems/valid-palindrome-ii/
 * 
 * Description:
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 * 
 *  
 * Example 1:
 * 
 * Input: s = "aba"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * Input: s = "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.
 * 
 * 
 * Example 3:
 * 
 * Input: s = "abc"
 * Output: false
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	1 <= s.length <= 105
 * 	s consists of lowercase English letters.
 * 
 * Sample Test Case:
 *   "aba"
 */

class Solution {
    public boolean ispalindrome(char ch[],int left,int right){
        while(left<right){
            if(ch[left]!=ch[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        char ch[] = s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right){
            if(ch[left]==ch[right]){
                left++;
                right--;
            }
            else{
                if(ispalindrome(ch,left+1,right)){
                    return true;
                }
                else if(ispalindrome(ch,left,right-1)){
                    return true;
                }
                return false;
            }
        }
        return true;

    }
}
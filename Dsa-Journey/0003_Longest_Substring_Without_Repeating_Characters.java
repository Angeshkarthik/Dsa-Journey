/*
 * Problem: 0003 - Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * URL: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * 
 * Description:
 * Given a string s, find the length of the longest substring without duplicate characters.
 * 
 *  
 * Example 1:
 * 
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
 * 
 * 
 * Example 2:
 * 
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * 
 * 
 * Example 3:
 * 
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	0 <= s.length <= 105
 * 	s consists of English letters, digits, symbols and spaces.
 * 
 * Sample Test Case:
 *   "abcabcbb"
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int j=0, ans=0;
        for(int i=0;i<s.length();i++)
        {
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            ans=Math.max(ans, i-j+1);
        }
        return ans;
    }
}
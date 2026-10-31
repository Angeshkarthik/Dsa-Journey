/*
 * Problem: 0387 - First Unique Character in a String
 * Difficulty: Easy
 * URL: https://leetcode.com/problems/first-unique-character-in-a-string/
 * 
 * Description:
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * 
 *  
 * Example 1:
 * 
 * 
 * Input: s = "leetcode"
 * 
 * Output: 0
 * 
 * Explanation:
 * 
 * The character 'l' at index 0 is the first character that does not occur at any other index.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "loveleetcode"
 * 
 * Output: 2
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "aabb"
 * 
 * Output: -1
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	1 <= s.length <= 105
 * 	s consists of only lowercase English letters.
 * 
 * Sample Test Case:
 *   "leetcode"
 */

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int ans=-1;
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
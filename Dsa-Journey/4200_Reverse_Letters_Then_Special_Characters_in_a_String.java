/*
 * Problem: 4200 - Reverse Letters Then Special Characters in a String
 * Difficulty: Easy
 * URL: https://leetcode.com/problems/reverse-letters-then-special-characters-in-a-string/
 * 
 * Description:
 * You are given a string s consisting of lowercase English letters and special characters.
 * 
 * Your task is to perform these in order:
 * 
 * 
 * 	Reverse the lowercase letters and place them back into the positions originally occupied by letters.
 * 	Reverse the special characters and place them back into the positions originally occupied by special characters.
 * 
 * 
 * Return the resulting string after performing the reversals.
 * 
 *  
 * Example 1:
 * 
 * 
 * Input: s = ")ebc#da@f("
 * 
 * Output: "(fad@cb#e)"
 * 
 * Explanation:
 * 
 * 
 * 	The letters in the string are ['e', 'b', 'c', 'd', 'a', 'f']:
 * 
 * 	
 * 		Reversing them gives ['f', 'a', 'd', 'c', 'b', 'e']
 * 		s becomes ")fad#cb@e("
 * 	
 * 	
 * 	​​​​​​​The special characters in the string are [')', '#', '@', '(']:
 * 	
 * 		Reversing them gives ['(', '@', '#', ')']
 * 		s becomes "(fad@cb#e)"
 * 	
 * 	
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "z"
 * 
 * Output: "z"
 * 
 * Explanation:
 * 
 * The string contains only one letter, and reversing it does not change the string. There are no special characters.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "!@#$%^&*()"
 * 
 * Output: ")(*&^%$#@!"
 * 
 * Explanation:
 * 
 * The string contains no letters. The string contains all special characters, so reversing the special characters reverses the whole string.
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	1 <= s.length <= 100
 * 	s consists only of lowercase English letters and the special characters in "!@#$%^&*()".
 * 
 * Sample Test Case:
 *   ")ebc#da@f("
 */

class Solution {
    public String reverseByType(String s) {
        char ch[] = s.toCharArray();
        int left = 0;
        int right=ch.length-1;
        while(left<right){
            if(!Character.isLetter(ch[left])){
                left++;
            }
            else if(!Character.isLetter(ch[right])){
                right--;
            }
            else{
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        left = 0;
        right=ch.length-1;
        while(left<right){
            if(Character.isLetter(ch[left]) 
                 || Character.isDigit(ch[left]) 
                 || Character.isWhitespace(ch[left])){
                left++;
            }
            else if(Character.isLetter(ch[right]) 
                 || Character.isDigit(ch[right]) 
                 || Character.isWhitespace(ch[right])){
                right--;
            }
            else{
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        return new String(ch);

    }
}
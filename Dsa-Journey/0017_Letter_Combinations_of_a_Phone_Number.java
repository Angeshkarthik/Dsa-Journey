/*
 * Problem: 0017 - Letter Combinations of a Phone Number
 * Difficulty: Medium
 * URL: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * 
 * Description:
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 * 
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * 
 *  
 * Example 1:
 * 
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 
 * 
 * Example 2:
 * 
 * Input: digits = "2"
 * Output: ["a","b","c"]
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	1 <= digits.length <= 4
 * 	digits[i] is a digit in the range ['2', '9'].
 * 
 * Sample Test Case:
 *   "23"
 */

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        String[] mapping = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, new StringBuilder(), result, mapping);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder current, List<String> result, String[] mapping) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            backtrack(digits, index + 1, current, result, mapping);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
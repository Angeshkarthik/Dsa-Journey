class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder rev = new StringBuilder(sb);
        rev.reverse();
        String s1 = sb.toString();
        String s2 = rev.toString();
       if(s2.equals(s1))
            return true;
        else return false;
    }
}
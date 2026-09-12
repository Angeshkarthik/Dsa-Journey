class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String answer = "";
        for(String word : dictionary) {
            int i=0;
            int j=0;
            while(i<word.length() && j<s.length()){
            if(word.charAt(i)==s.charAt(j)){
                i++;
            }
            j++;
        if(i==word.length()){
            if(word.length()>answer.length()){
                answer=word;
            }
            else if(word.length()==answer.length() && word.compareTo(answer)<0){
                answer=word;
            }
        }
        }
    }
    return answer;   
}
}
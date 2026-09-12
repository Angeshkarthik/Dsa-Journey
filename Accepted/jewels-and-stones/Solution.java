class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set1 = new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            set1.add(jewels.charAt(i));
        }
        int count=0;
        for(int i=0;i<stones.length();i++){
            if(set1.contains(stones.charAt(i)))
                count++;
        }
        return count;
    }
}
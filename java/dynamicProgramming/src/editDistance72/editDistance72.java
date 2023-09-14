package editDistance72;

public class editDistance72 {
}


class Solution {
    public int minDistance(String word1, String word2) {
        if(word1.length() == 0 || word2.length() == 0){
            return  Math.max(word1.length(),word2.length());
        }
        if(word1.charAt(word1.length() - 1) == word2.charAt(word2.length() - 1)){
            return  minDistance(word1.substring(0,word1.length() - 1),word2.substring(0,word2.length() - 1));
        }
        return  1 +Math.min( Math.min(minDistance(word1,word2.substring(0,word2.length() - 1)),
                                      minDistance(word1.substring(0,word1.length() - 1),word2)),
                                      minDistance(word1.substring(0,word1.length() - 1),word2.substring(0,word2.length() - 1)));


    }
}
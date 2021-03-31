package LongestSubstringWithoutRepeatingCharacters3;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters3 {
}



class Solution {
    public void delete(HashMap<String,Integer> map,String s, int i, int j){
        while(i <= j){
            map.remove(s.charAt(i) + "");
            i++;
        }

    }
    public int lengthOfLongestSubstring(String s) {
        HashMap<String,Integer> map = new HashMap();
        if(s.length() == 0) return 0;
        int i = 0, j = 1;
        map.put(s.charAt(0)+"",0);
        int max = 1;
        while(j < s.length()){
            if(map.containsKey(s.charAt(j)+"")){
                max = Math.max(max,j - i);
                int deleted = map.get(s.charAt(j)+"");
                delete(map,s,i,deleted);
                i = map.get(s.charAt(j)+"") + 1;
                map.put(s.charAt(j)+"",j);
            }
            else{
                map.put(s.charAt(j)+"",j);
            }

            j++;
        }


        return max;

    }
}
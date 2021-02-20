package RomantoInteger13;

import java.util.HashMap;

public class RomantoInteger13 {
}
class Solution {
    HashMap<String,Integer>  data;
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public void creatHash(){
        data = new HashMap<>();
        for(int i = 0; i < values.length; i++){
            data.put(symbols[i], values[i]);
        }
    }
    public int romanToInt(String s) {
        creatHash();
        int i = 0, result = 0;
        while (i < s.length()){
            if(i + 2 <= s.length()){
                if(data.containsKey(s.substring(i,i+2))){
                    result += data.get(s.substring(i,i+2));
                    i += 2;
                }
                else{
                    result += data.get(s.substring(i,i+1));
                    i++;
                }
            }
            else{
                result += data.get(s.substring(i,i+1));
                i++;
            }
        }
        return result;

    }
}
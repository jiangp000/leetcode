package IntegertoRoman12;

public class IntegertoRoman12 {
}


class Solution {
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num) {
//        我们可以表示的数字
//        1000  900 500 400 100 90 50 40 10 9 4 1


        StringBuilder result = new StringBuilder();
        for(int i = 0; i < values.length && num > 0; ){
            if(num / values[i] > 0){
                result.append(symbols[i]);
                num -= values[i];
            }
            else{
                i ++;
            }
        }
        return result.toString();

    }
}
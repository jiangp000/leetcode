package LetterCombinationsofaPhoneNumber17;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber17 {
    public static void main(String[] args) {
        System.out.println(new Solution().letterCombinations("23"));
    }
}



// 就是2 -9 做一个对应，每次选取一个，就好了

class Solution {

    public String numToChar(int i ){
        switch (i) {
            case 2:
                return "abc";
            case 3:
                return "def";
            case 4:
                return "ghi";
            case 5:
                return "jkl";
            case 6:
                return "mno";
            case 7:
                return "pqrs";
            case 8:
                return "tuv";
            case 9:
                return "wxyz";
        }
        return "";
    }

    public void helper(int i, List<String> str, List<String> res, String temp){
        if(temp.length() == str.size()){
            res.add(temp);
            return ;
        }
        for(int j = 0; j < str.get(i).length(); j++){
            helper(i + 1,str,res,temp + str.get(i).charAt(j));
        }

    }

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return  new ArrayList<>();
        List<String> str = new ArrayList<>();
        for(int i = 0; i < digits.length(); i++){
            str.add(numToChar(digits.charAt(i) - '0'));
        }

        // 然后就是标准的动态规划的过程，我可以选第一个，也可以选第二个，也可以选第三个

        List<String> res = new ArrayList<>();
        helper(0,str,res,"");
        return res;


    }
}
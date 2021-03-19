package ReverseVowelsofaString345;

public class ReverseVowelsofaString345 {
    public static void main(String[] args) {
        Solution test = new Solution();
    }
}


class Solution {
    public boolean isAEIOU(char s){
        s = ("" + s).toLowerCase().charAt(0);
        if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s =='e') return true;
        return false;
    }
    public String reverseVowels(String s) {
        StringBuilder spec = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(isAEIOU(s.charAt(i))){
                spec.append(s.charAt(i));
            }
        }
        //  spec进行反转就可以了

        spec = spec.reverse();
        int index = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(isAEIOU(s.charAt(i))){
                res.append(spec.charAt(index));
                index++;
            }
            else{
                res.append(s.charAt(i));
            }
        }
        return  res.toString();
    }
}

//Input: "leetcode"
//        Output: "leotcede"

//eeoe
//eoee
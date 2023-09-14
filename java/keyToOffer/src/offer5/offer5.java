package offer5;

public class offer5 {
}


class Solution {
    public String replaceSpace(String s) {
        if(s == null || s.length() == 0) return "";
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == ' '){
                result.append("%20");
            }
            else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
package tihuanshuzi5370;

public class MAIN {
}


class Solution {
    public char getNextChar(char s, int i){
        return (char)(s + i);
    }
    public String replaceDigits(String s) {
        // 长度是 1，则为0
        // 长度为 2的时候，偶数的时候，这个是可以的
        // 奇数的时候，把最后一个加上
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length() / 2; i++){
            res.append(s.charAt(2 * i));
            res.append(getNextChar(s.charAt(i * 2),s.charAt(i * 2 + 1) - '0'));
        }
        if(s.length() % 2 == 1) res.append(s.charAt(s.length() - 1));
//        System.out.println(res.toString());
        return res.toString();

    }
}
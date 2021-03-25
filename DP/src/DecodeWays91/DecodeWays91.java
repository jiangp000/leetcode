package DecodeWays91;

public class DecodeWays91 {
    public static void main(String[] args) {
        System.out.println( new Solution().numDecodings("10011"));

    }
}



// 开头为0 肯定不行
// 20 30 40 50
class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0) == '0') return 0;
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for(int i = 1; i < s.length(); i++){
             // 20 30 4 0 这些是肯定不行的 ，10,或者是20 的
            if(s.charAt(i) == '0') {
                if (s.charAt(i - 1) > '2' || s.charAt(i - 1) == '0') return 0;
                dp[i] = i == 1 ? 1 : dp[i - 2];
            }
//            1 6
//            2 4
            else if(s.charAt(i - 1) == '1' || s.charAt(i - 1)  == '2' && s.charAt(i) >= '0' && s.charAt(i) < '7'){
                dp[i] = i == 1 ? dp[i - 1] + 1 : dp[i - 1] + dp[i - 2];
            }
            else{
                dp[i] = dp[i - 1];
            }
        }
        return  dp[s.length() - 1];
    }
}
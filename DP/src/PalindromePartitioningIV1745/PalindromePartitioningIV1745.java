package PalindromePartitioningIV1745;

public class PalindromePartitioningIV1745 {
    public static void main(String[] args) {
        System.out.println(new Solution().checkPartitioning("bbab"));
    }
}



// 我们使用动态规划来做
// dp[i][j] 表示下标从 i 到 j 是不是回文字符串
// 如果是1，那么就是回文字符串，如果是 0，那就不是
class Solution {
    static int[][] dp;
    public void helper(String s){
        // 首先对于每一个字符都是回文字符串，
        for(int i = 0; i < s.length(); i++){
            dp[i][i] = 1;
        }
        for(int i = 0; i < s.length() - 1; i++){
            // 然后 ABA 都是回文字符串

            int l = i - 1, r = i + 1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                dp[l][r] = 1;
                l--;
                r++;
            }
            // ABBA 的情况

            l = i - 1; r = i + 2;
            if(s.charAt(i) == s.charAt(i + 1)) dp[i][i + 1] = 1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r) && s.charAt(i) == s.charAt(i + 1) ){
                dp[i][i + 1] = 1;
                dp[l][r] = 1;
                l--;
                r++;
            }
        }
    }
//    bbab
//    1100
//    0101
//    0010
//    0001
    public boolean checkPartitioning(String s) {
        dp = new int[s.length() + 10][s.length() +  10];
        helper(s);
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j < s.length(); j++){
                if(dp[0][i] == 1 && dp[i + 1][j] == 1 && dp[j + 1][s.length() - 1] == 1 ) return  true;
            }
        }
        return  false;

    }
}
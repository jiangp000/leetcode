package PalindromePartitioningII132;

public class PalindromePartitioningII132 {
}


// 这个字符串怎么才能变得更少呢
class Solution {
    int[][] dp;


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
    public int minCut(String s) {
        dp = new int[s.length() + 10][s.length() + 10];
        helper(s);
        int[] count = new int[20000];
        count[0] = 0;
//        每次都新加入一个回文字符串，如果可以加入，那么就计算下最小的切割数字
        for(int i = 1; i < s.length(); i++){
            count[i] = count[i - 1] + 1;
            for(int j = i - 1; j >= 0; j--){
                if(dp[j][i] == 1 && j != 0){
                    count[i] = Math.min(count[i], count[j - 1] + 1);
                }
                else if(dp[j][i] == 1 && j == 0){
                    count[i] = 0;
                }
            }
        }
        return count[s.length() - 1];
        // 假设我们已经做完了上面的初始化了，就是求dp[i[[j] 的那一套，然后


    }
}
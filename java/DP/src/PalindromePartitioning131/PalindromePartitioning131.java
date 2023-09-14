package PalindromePartitioning131;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning131 {
    public static void main(String[] args) {
        System.out.println(new Solution().partition("aab"));
    }
}


class Solution {
    static  int[][] dp;
    List<List<String>> res;

    public void helper(String s){
        for(int i = 0; i < s.length(); i++){
            dp[i][i] = 1;
        }

        for(int i = 0; i < s.length() - 1; i++){
            int l = i - 1, r = i + 1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                dp[l][r] = 1;
                l--;
                r++;
            }
            l = i - 1; r = i + 2;
            if(s.charAt(i) == s.charAt(i + 1)) dp[i][i + 1] = 1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r) && s.charAt(i + 1) == s.charAt(i)){
                dp[l][r] = 1;
                dp[i][i + 1] = 1;
                l--;
                r++;
            }
        }
    }
    public void addRes(String s){
        String[] result = s.split(" ");
        List<String> Q = new ArrayList();
        for(int i = 1; i < result.length; i++){
            Q.add(result[i]);
        }
        res.add(Q);
    }

    public void dfs(int i, String s, String result){
        if(i >= s.length()){
            addRes(result);
            return;
        }
        for(int len = 0; len + i < s.length(); len++){
            if(dp[i][len + i] == 1){
                dfs(len + i + 1,s,result + " " + s.substring(i,len + i + 1));
            }
        }
    }
    public List<List<String>> partition(String s) {
        res = new ArrayList<>();
        dp = new int[s.length() + 10][s.length() + 10];
        helper(s);
        // 现在看看哪些能够拼凑成 0 —— s.length - 1
        dfs(0,s,"");
        return  res;
    }
}

// 0 1 1 2  2 3 0 2 3 3
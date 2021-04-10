package EditDistance72;

import java.util.*;
//  发现了一位宝藏Up 主
//  alchemist_dong
//  非常非常的详细，容易懂
//  编辑距离，我是看了他的视频，有点懂了，现在这个是他的实现代码，自己跟着敲一敲

public class EditDistance72 {
    public static void main(String[] args) {
        String s = "b";
        String b = "";
    }
}

class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];


        // 第一行
        for(int i = 0; i < dp.length; i++){
            dp[i][0] = i;
        }

        // 第一列
        for(int j = 0; j < dp[0].length; j++){
            dp[0][j] = j;
        }
        // 然后就是中间的

        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                // AA 是相等的，我们就取左上角的数值
                if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // 如果不相等，我们就取邻近三个数字的最小值 + 1
                else{
                    dp[i][j] = Math.min(
                            Math.min(dp[i - 1][j - 1],dp[i - 1][j]),dp[i][j - 1]) + 1;
                }
            }
        }
        return  dp[dp.length - 1][dp[0].length - 1];
    }
}

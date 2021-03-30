package ReSpaceLCCI1713;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ReSpaceLCCI1713 {
}


// 动态规划 String 字符串一般都是用动态规划，但是 动态规划····· 是我一辈子都学不会的知识
// dp[i] 表示字符串（0，i）的这一段字串中有多少个没有匹配上的
// 我们使用hashSet
// 所以记忆化搜素到底是什么？？？

class Solution {
    public int respace(String[] dictionary, String sentence) {
        Set<String> set = new HashSet<>(Arrays.asList(dictionary));
        int[] dp = new int[sentence.length() + 1];
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++){
            dp[i] = dp[i - 1] + 1;
            // 然后再进行循环的遍历 如果说(index,i) 比 dp[i] 小，那么就更新 dp[i]
            for(int index = 0; index < i; index++){
                if(set.contains(sentence.substring(index,i))) dp[i] = Math.min(dp[i],dp[index]);
            }
            System.out.println(dp[i]);
        }
        return dp[dp.length - 1];

    }
}

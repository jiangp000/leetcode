package WordBreak139;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak139 {
}


class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        // 状态：dp[i] 表示长度为i 能否用wordDict的表示
        // dp[0] 表示为空，此时可以被表示
        // 状态转移：dp[j] = dp[i] && set.contains(s.substring(i,j))
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for(int i = 0; i < s.length() + 1; i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[dp.length - 1];

    }
}
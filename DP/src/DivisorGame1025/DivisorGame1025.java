package src.DivisorGame1025;

public class DivisorGame1025 {
}



// 爱丽丝和鲍勃一起玩游戏，爱丽丝先动手
// 选出一个 X ，X 是 N的因素， 让N - X 替换掉 N
// 如果玩家没法执行操作，就输了
//
// 最后如果是 素数，那么肯定就没法操作了 ~
// 2 只能选择 1，那么就
class Solution {
    public boolean divisorGame(int n) {
        int[] dp = new int[n + 1];
        if(n == 1) return false;
        if(n == 2) return true;
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        for(int i = 3; i < dp.length; i++){
            // 选择一个因数，然后再取反
            for(int j = 1; j < i; j++){
                if(i % j == 0 && dp[i - j] == 0){
                    dp[i] = 1;
                }
            }
        }

        return  dp[n] == 1;

    }
}
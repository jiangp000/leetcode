package MaximumPointsYouCanObtainfromCards1423;

import java.util.Arrays;

public class MaximumPointsYouCanObtainfromCards1423 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] s1 = {9,7,7,9,7,7,9};
        int k = 7;
        test.maxScore(s1,k);
    }
}


// 这个题目的意思是，你可以从两边开始，向中间遍历，找到和最大的那一段
// 这个题目也可以理解为 中间一段的数字最小
// 我们使用滑动窗口
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        // 中间一段的数字要达到最小，
        // 如果是
        int m =cardPoints.length - k,realSum = 0;
        for(int i :cardPoints){
            realSum += i;
        }
        if(k == cardPoints.length) return  realSum;
        int i = 0, j = 0, res = Integer.MAX_VALUE, index = 0, sum =0;
        while(j < cardPoints.length + 1){
            if(index == m){
                res = Math.min(res,sum);
                sum -= cardPoints[i];
                i++;
                index --;
            }
            else{
                if(j == cardPoints.length) break;
                sum += cardPoints[j];
                index ++;
                j++;
            }
        }
        return realSum - res;

    }
}

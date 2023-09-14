package BestTimetoBuyandSellStock121;

public class beibei {
}

class QQQolution {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int minNum = Integer.MAX_VALUE,maxNum=0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minNum) {
                minNum = prices[i];
            }
            else{
                maxNum=Math.max(maxNum,prices[i]-minNum);
            }
        }

        return maxNum;
    }
}
package BestTimetoBuyandSellStockIII123;

public class BestTimetoBuyandSellStockIII123 {
}


//输入：prices = [3,3,5,0,0,3,1,4]
//        输出：6
//        解释：在第 4 天（股票价格 = 0）的时候买入，在第 6 天（股票价格 = 3）的时候卖出，这笔交易所能获得利润 = 3-0 = 3 。
//             随后，在第 7 天（股票价格 = 1）的时候买入，在第 8 天 （股票价格 = 4）的时候卖出，这笔交易所能获得利润 = 4-1 = 3 。
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iii
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

// 最多买入两次和 卖出两次
//[3,3,5,0,0,3,1,4]
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        // -3 0 -3 0
        int buy1 = - prices[0],sell1 = 0;
        int buy2 =  -prices[0],sell2 = 0;
        for(int i = 1; i < n; i++){
            buy1 = Math.max(buy1, - prices[i]);
            sell1 = Math.max(sell1,buy1 + prices[i]);
            buy2 = Math.max(buy2,sell1 - prices[i]);
            sell2 = Math.max(sell2,buy2 + prices[i]);
            // 当 N = 1的时候， buy1 = -3 sell1 = 3 -3 = 0 buy2 = -3 sell2 = 0
        }
        return sell2;

    }
}
// 动态转义方程：
// 没有进行过任何的操作  利润显然为0

// 只进行过一次的买操作
// 进行了一次买和买操作
// 完成了一笔操作，进行了第二次的买操作
// 完成了全部的两次操作
// 剩下的四个状态，我们把他们记作buy1，sell2,buy2,sell2

// 我只能说是极好的
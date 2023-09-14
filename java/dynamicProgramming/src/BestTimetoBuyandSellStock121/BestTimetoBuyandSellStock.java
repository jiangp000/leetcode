package BestTimetoBuyandSellStock121;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args){
        Solution test=new Solution();
        int[] s1={7,5,3,1,0};
        int[] s2={7,1,5,3,6,4};
        System.out.println(test.maxProfit(s1));
    }
}

class Solution {
    public int getMax(int[] nums,int i){
        int result=0;
        for(i=i+1;i<nums.length;i++){
            if(nums[i]>result){
                result=nums[i];
            }
        }

        return result;
    }
    public int maxProfit(int[] prices) {
        int result=0;
        for(int i=0;i<prices.length-1;i++){
            int q=getMax(prices,i);
            if(q-prices[i]>result){
                result=q-prices[i];
            }
        }
        return result;

    }
}
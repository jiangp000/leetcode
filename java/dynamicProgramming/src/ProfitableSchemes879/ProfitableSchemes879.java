package ProfitableSchemes879;

public class ProfitableSchemes879 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int n = 100, minProfit = 10;
        int[] group  = {66,24,53,49,86,37,4,70,99,68,14,91,70,71,70,98,48,26,13,86,4,82,1,7,51,37,27,87,2,65,93,66,99,28,17,93,83,91,45,3,59,87,92,62,77,21,9,37,11,4,69,46,70,47,28,40,74,47,12,3,85,16,91,100,39,24,52,50,40,23,64,22,2,15,18,62,26,76,3,60,64,34,45,40,49,11,5,8,40,71,12,60,3,51,31,5,42,52,15,36};
        int[] minProfile = {8,4,8,8,9,3,1,6,7,10,1,10,4,9,7,11,5,1,7,4,11,1,5,9,9,5,1,10,0,10,4,1,1,1,6,9,3,6,2,5,4,7,8,5,2,3,0,6,4,5,9,9,10,7,1,8,9,6,0,2,9,2,2,8,6,10,3,4,6,1,10,7,5,4,8,1,8,5,5,4,1,1,10,0,8,0,1,11,5,4,7,9,1,11,1,0,1,6,8,3};
        System.out.println(test.profitableSchemes(n,minProfit,group,minProfile));
    }
}




class Solution {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        return process(0,n,minProfit,group,profit);
    }

    public int process(int i,int n,int minProfit,int[] group,int[] profit){
//

//        Input: n = 10, minProfit = 5, group = [2,3,5], profit = [6,7,8]
        if(n < 0) return 0;
        if(minProfit <= 0){
//
            for(int j = i; i < group.length; i++){
                int k = ( process(j + 1,n - group[j],minProfit - profit[j],group,profit)) % (1000000000 + 7);
                int u = ( process(j + 1 ,n ,minProfit ,group,profit)) % (1000000000 + 7);
                return k + u;
            }
            return 1;
        }
        else{
            for(int j = i; i < group.length; i++){
                int k = ( process(j + 1,n - group[j],minProfit - profit[j],group,profit)) % (1000000000 + 7);
                int u = ( process(j + 1 ,n ,minProfit ,group,profit)) % (1000000000 + 7);
                return  k + u;
            }
            return 0;
        }
    }
}
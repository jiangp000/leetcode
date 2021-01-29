package GasStation134;

import java.util.ArrayList;

public class GasStation {
    public static void main(String[]  args){
        Solution test=new Solution();
        int[] gas1={2,3,4};
        int[] cost1={3,4,3};

        int[] gas2={1,2,3,4,5};
        int[] cost2={3,4,5,1,2};
        System.out.println(test.canCompleteCircuit(gas2,cost2));
    }
}


class Solution {
    public boolean canShag(int[] gas,int[] cost,int i){
        int n=0,total=0,LEN=gas.length;
        while( n < LEN+2){
            if(total < 0) return false;
            total+=gas[i];
            total-=cost[i];
            i=(i+1)%LEN;
            n++;
        }
        return true;
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        ArrayList<Integer> result=new ArrayList<>();
        // result是可能的出发地点
        for(int i=0;i < gas.length;i++){
            if(gas[i] >= cost[i]){
                result.add(i);
            }
        }
        int total=0;
        for(int i = 0; i < result.size(); i++){
            if(canShag(gas,cost,result.get(i))) return result.get(i);
        }
        return -1;

    }
}
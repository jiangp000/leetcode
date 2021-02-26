package LastStoneWeight1046;

import java.util.ArrayList;
import java.util.List;

public class LastStoneWeight1046 {
    public static void main(String[] args) {
        Solution test = new Solution();
//        System.out.println(test.lastStoneWeight(new int[] {2,7,4,1,8,1}));
        System.out.println(test.lastStoneWeight(new int[] {3,7,8}));

    }
}


class Solution {
    public void getMax(List<Integer> data){
        int first = 0, second = 0, firstIndex = 0, secondIndex = 0;
        if(data.get(0) > data.get(1)) {
            first = data.get(0);
            second = data.get(1);
            firstIndex = 0;
            secondIndex = 1;
        }
        else{
            first = data.get(1);
            second = data.get(0);
            firstIndex = 1;
            secondIndex = 0;
        }
        //
        for(int i = 2; i < data.size(); i++){
            if(data.get(i) > first){
                second = first;
                first = data.get(i);
                secondIndex = firstIndex;
                firstIndex = i;
            }
            else if(data.get(i) > second){
                second = data.get(i);
                secondIndex = i;
            }
        }
        //
        if(firstIndex > secondIndex){
            data.remove(firstIndex);
            data.remove(secondIndex);
            data.add(first - second);
        }
        else{
            data.remove(secondIndex);
            data.remove(firstIndex);
            data.add(first - second);
        }
    }
    public int lastStoneWeight(int[] stones) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < stones.length; i ++){
            result.add(stones[i]);
        }
        // 一个数字一个数字的查询
        while(result.size() > 1){
            getMax(result);
        }
        return result.get(0);
    }
}
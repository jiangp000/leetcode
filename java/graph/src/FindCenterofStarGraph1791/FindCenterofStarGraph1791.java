package FindCenterofStarGraph1791;

import java.util.HashSet;

public class FindCenterofStarGraph1791 {
}


class Solution {
    // 如果是中间的话，那么出现的次数是最多的
    int[] times ;
    public int findCenter(int[][] edges) {
        times = new int[100000];
        for(int[] link :edges){
            times[link[0]]++;
            times[link[1]]++;
        }
        int index = 1, res = times[1];
        for(int i = 2; i < times.length; i++){
            if(times[i] > res){
                index = i;
                res = times[i];
            }
        }
        return index;

    }
}
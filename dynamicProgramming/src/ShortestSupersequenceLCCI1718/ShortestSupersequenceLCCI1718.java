package ShortestSupersequenceLCCI1718;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShortestSupersequenceLCCI1718 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] big = {7,5,9,0,2,1,3,5,7,9,1,1,5,8,8,9,7};
        int[] small = {1,5,9};
        test.shortestSeq(big,small);
    }
}
class Solution {
    public int[] shortestSeq(int[] big, int[] small) {
        HashMap<Integer,Integer> smallNum = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i :small){
            smallNum.put(i,1);
        }
        int i = 0, j = 0, nums = 0;
        while(j < big.length + 1){
            if(nums ==  smallNum.size()){
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(j - 1);
                result.add(temp);
                if(smallNum.containsKey(big[i])){
                    nums --;
                    smallNum.put(big[i],1);
                }
                i++ ;

            }
            //
            if(j == big.length) break;
            if(smallNum.containsKey(big[j])){
                if(smallNum.get(big[j]) != 0){
                    nums ++;
                    smallNum.put(big[j],0);
                }
            }
            j++;
        }
        for(List<Integer> Q : result){
            System.out.println(Q);
        }
        return null;
    }
}

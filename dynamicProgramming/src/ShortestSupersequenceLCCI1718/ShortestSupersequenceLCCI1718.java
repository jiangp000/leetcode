package ShortestSupersequenceLCCI1718;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

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
                    nums = 0;
                    j = i + 1;
//                    int[] mykey = smallNum.keySet().;
                    List<Integer> mykey =new ArrayList<>(smallNum.keySet());
                    for(int k = 0; k < mykey.size(); k++){
                        smallNum.put(mykey.get(k),1);
                    }
                }
                i++ ;
                continue;

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
        if(result.size() == 0) return new int[0];
        int minLen = Integer.MAX_VALUE,index = 0;

        for(int p = 0; p < result.size(); p++){
            index = minLen > (result.get(p).get(1) - result.get(p).get(0) ) ? p : index;
            minLen = Math.min(minLen,result.get(p).get(1) - result.get(p).get(0) );
        }
        return new int[]{result.get(index).get(0),result.get(index).get(1)};
    }
}

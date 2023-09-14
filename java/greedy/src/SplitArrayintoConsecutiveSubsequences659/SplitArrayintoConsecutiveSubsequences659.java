package SplitArrayintoConsecutiveSubsequences659;

import java.util.HashMap;
import java.util.Map;

public class SplitArrayintoConsecutiveSubsequences659 {
}


class Solution {
    public boolean isPossible(int[] nums) {
        Map<Integer,Integer>  res= new HashMap();
        for(int num : nums){
            res.put(num,res.getOrDefault(num,0) + 1);
        }
        Map<Integer,Integer> tail =new HashMap();
        for(int num : nums){
            int count = res.getOrDefault(num,0);
            if(count <= 0){
                continue;
            }
//            前面还有数字，可以构成
            else if(tail.getOrDefault(num - 1,0) > 0){
                res.put(num,count - 1);
                tail.put(num - 1, tail.get(num - 1) - 1);
                tail.put(num,tail.getOrDefault(num,0) + 1);
            }
            else if(res.getOrDefault(num + 1,0) > 0 && res.getOrDefault(num + 2,0) > 0){
                res.put(num,count + 1);
                res.put(num + 1,res.get(num + 1) - 1);
                res.put(num + 2,res.get(num + 2) - 1);
                tail.put(num + 2,tail.getOrDefault(num + 2,0) + 1);
            }
            else return false;
        }
        return true;
    }
}
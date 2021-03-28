package CombinationSum39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum39 {
    public static void main(String[] args) {
        int[] arr = {2,2,3};
        int target = 7;
        new Solution().combinationSum(arr,target);
    }
}


class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int[] res = new int[31];
        Arrays.fill(res,-1);
        backTracking(0,0,0,target,candidates,res,result);
        return null;

    }
    public void helper(int[] res, List<List<Integer>> result){
        System.out.println(Arrays.toString(res));

    }
    public void backTracking(int start, int real, int num, int target, int[] cand, int[] res,List<List<Integer>> result){
        if(num == target){
            helper(res,result);
            return ;
        }
        else if(num > target) return;
        else{
            for(int i = start; i < cand.length; i++){
                res[real] = cand[i];
                backTracking(i ,real + 1,num + cand[i],target,cand,res,result);
                backTracking(i + 1,real + 1,num + cand[i],target,cand,res,result);
            }
        }
    }
}
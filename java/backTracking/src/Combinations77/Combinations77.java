package Combinations77;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations77 {
    public static void main(String[] args) {
        new Solution().combine(4,2);
    }
}


class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int[] res = new int[k];
        backTracking(0,1,n,res,result);
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
        return  result;

    }

    public void helper(int[] res, List<List<Integer>> temp){
        List<Integer> result = new ArrayList();
        for(int i = 0; i < res.length; i++){
            result.add(res[i]);
        }
        temp.add(result);

    }

    // 可以选，是吗？？
    public void backTracking(int start,int num, int n, int[] res, List<List<Integer>> temp){
        if(start == res.length){
            helper(res,temp);
            return ;
        }
        for(int i = num; i <= n; i++){
            res[start] = i;
            backTracking(start + 1,i + 1,n,res,temp);
        }


    }
}
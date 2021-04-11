package Subsets79;

import java.util.ArrayList;
import java.util.List;

public class Subsets79 {
}






class Solution {
    static List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        process(0,temp,nums);
        return res;
    }
    public void process(int i,List<Integer> temp, int[] nums){
        if(i == nums.length) {
            List<Integer> ADD = new ArrayList<>(temp);
            res.add(ADD);
            return ;
        }

        List<Integer> q = new ArrayList<>(temp);
        process(i + 1,q,nums);
        temp.add(nums[i]);
        process(i+ 1,temp,nums);
    }
}
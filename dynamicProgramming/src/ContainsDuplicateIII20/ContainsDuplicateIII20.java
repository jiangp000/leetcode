package ContainsDuplicateIII20;

import java.util.TreeSet;

public class ContainsDuplicateIII20 {
}


class Solution {
//    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
//        for(int i = 0; i < nums.length - 1; i++){
//            for(int j = i - k; j < nums.length && j <= i + k; j++){
//                if(j < 0 || j == i) continue;
//                long temp1 = nums[j];
//                long temp2 = nums[i];
//                if(Math.abs(temp1 - temp2) <= t) return true;
//            }
//        }
//        return false;
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> myset = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            Integer temp = myset.ceiling(nums[i]);
            long Q1 =nums[i];
            long longtemp = temp.longValue();
            if(temp != null && (long)temp <= (long)nums[i] + t) return true;
            Integer temp2 = myset.floor(nums[i]);
            longtemp = temp2;
            if(temp != null && nums[i] <= temp2 + t) return  true;

            myset.add(nums[i]);
            if(myset.size() > k){
                myset.remove(nums[i - k]);
            }
        }
        return false;
    }
}
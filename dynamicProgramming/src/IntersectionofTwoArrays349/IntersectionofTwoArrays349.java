package IntersectionofTwoArrays349;

import java.util.*;

public class IntersectionofTwoArrays349 {
}


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0) return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        Set<Integer> result = new HashSet<>();
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        int[] result999 = result.stream().mapToInt(Integer::intValue).toArray();
        return  result999;
    }
}
package AdvantageShuffle870;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class AdvantageShuffle870 {
}


// A的大的数值 > B的大的数值
// 如果失败，那就用 A的 最小的数值，抵消 B的大的数值
//class Solution {
//    public int[] advantageCount(int[] nums1, int[] nums2) {
//        int[] data1 = nums1.clone();
//        int[] data2 = nums2.clone();
//        Arrays.sort(data1);
//        Arrays.sort(data2);
//        int len = nums1.length - 1;
//        int i = len, j = len;
//        int iMin = 0, jMin = 0;
//        HashMap<Integer,Integer> integerPair = new HashMap<>();
//        while(i >= iMin && j >= jMin){
//            if(data1[i] > data2[j]){
//                integerPair.put(data2[j--],data1[i--]);
//            }
//            else {
//                integerPair.put(data2[j--],data1[iMin++]);
//            }
//        }
//        // 最后得到的结果呢？
//        for(int k = 0; k < len + 1; k++){
//            nums1[k] = integerPair.get(nums2[k]);
//            System.out.println(nums1[k]);
//
//        }
//        return nums1;
//
//    }
//}

class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Queue<int[]> q = new PriorityQueue<>((a1,a2) -> a2[0] - a1[0]);
        for(int i = 0; i < nums2.length; i++){
            q.add(new int[]{nums2[i],i});
        }
        int[] res = new int[nums1.length];
        int lo = 0, high = nums1.length - 1;
        while(q.size() > 0){
            int num = q.peek()[0];
            int i = q.poll()[1];
            if(nums1[high] > num){
                res[i] = nums1[high--];
            }
            else{
                res[i] = nums1[lo++];
            }
        }
        return res;
    }
}
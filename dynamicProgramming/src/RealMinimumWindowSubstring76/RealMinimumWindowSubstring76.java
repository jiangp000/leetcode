package RealMinimumWindowSubstring76;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class RealMinimumWindowSubstring76 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(test.maxSlidingWindow(nums, k));
    }
}

//Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
//        Output: [3,3,5,5,6,7]
//        Explanation:
//        Window position                Max
//        ---------------               -----
//        [1  3  -1] -3  5  3  6  7       3
//        1 [3  -1  -3] 5  3  6  7       3
//        1  3 [-1  -3  5] 3  6  7       5
//        1  3  -1 [-3  5  3] 6  7       5
//        1  3  -1  -3 [5  3  6] 7       6
//        1  3  -1  -3  5 [3  6  7]      7

// 我们现在每次维持一个窗口
// 使用一个单调队列，队列中的数值就是有可能成为最大值的，

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue
        Deque<Integer> myqueue = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            // 如果 myqueue中含有很多的元素，那么就要将他弹出来，多余的弹出来
            // 如果当前的位置 和你超过 K个距离了，那么你就应该离开了
            while((!myqueue.isEmpty()) && i - myqueue.getFirst() >= k){
                myqueue.pollFirst();
            }
            // 如果队列里面的比他小的，那么就应该删除掉了
            while((!myqueue.isEmpty()) && nums[myqueue.getLast()] <= nums[i]){
                myqueue.pollLast();
            }
            myqueue.addLast(i);
            if(i >= k - 1){
                result[index ++] = nums[myqueue.getFirst()];
            }
        }
        for(int g : result){
            System.out.println(g);
        }
        return result ;

    }
}
package FindtheDuplicateNumber287;

public class FindtheDuplicateNumber287 {
}


// 之前我们都是说 一堆数字里面，全是出现二次的，只有一个出现一次，我们可以使用异或
// 现在是一群数字里面，全都是出现一次的，只有一个出现两次
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        slow = nums[slow];
        fast = nums[nums[fast]];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        // slow == fast的时候，说明


        // 上面的表示  ，如果我们出现两次的，肯定有两个数字，同时都指向了这个节点
        //
        int pre1 = 0;
        int pre2 = slow;

        while(pre1 != pre2){
            pre1 = nums[pre1];
            pre2 = nums[pre2];
        }
        return  pre1;

    }
}
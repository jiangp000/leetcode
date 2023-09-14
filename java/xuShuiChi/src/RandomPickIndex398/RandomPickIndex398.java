package RandomPickIndex398;

import java.util.Random;


class thread1 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println(new Random().nextInt(100));
        }
    }
}
public class RandomPickIndex398 {
    public static void main(String[] args) {
        Random r = new Random();
        thread1 s1 = new thread1();
        Thread t1 = new Thread(s1);
        t1.start();

    }
}


class Solution {
    int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        Random r = new Random();
        int count = 0, res = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                count++;
                if(r.nextInt(count) == 0) res = i;
            }
        }
        return res;

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
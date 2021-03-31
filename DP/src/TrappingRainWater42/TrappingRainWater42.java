package TrappingRainWater42;

import java.util.Deque;
import java.util.LinkedList;

public class TrappingRainWater42 {
}


// 将0 入栈，将 1 入栈
// 如果能够有雨水，肯定就是凹字形的，
class Solution {
    public int trap(int[] height) {
        int ans = 0, current = 0;
        Deque<Integer> stack = new LinkedList<>();
        while (current < height.length) {
            while(! stack.isEmpty() && height[current] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) break;
                int distance = current - stack.peek() - 1;
                int boundHeight = Math.min(height[current], height[stack.peek()])  - height[top];
                ans += distance * boundHeight;
            }
            stack.push(current++);
        }
        return ans;
    }
}

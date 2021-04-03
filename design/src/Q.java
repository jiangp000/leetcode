import java.util.Deque;
import java.util.LinkedList;

public class Q {
    public int trap(int[] height){
        int ans = 0, current = 0;
        Deque<Integer> stack = new LinkedList<>();
        while(current < height.length){
            while(!stack.isEmpty() && height[current] > stack.peek()){
                int top = stack.pop();
                if(stack.isEmpty()) break;
                int distance = current - stack.peek() - 1;
                int boundHeight = Math.min(height[current],height[stack.peek()]) - height[top];
                ans += distance * boundHeight;
            }
            stack.push(current++);
        }
        return  ans;
    }
}

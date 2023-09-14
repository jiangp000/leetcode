package MinStack155;


import java.util.PriorityQueue;
import java.util.Stack;

public class MinStack155 {
    public static void main(String[] args) {

    }
}
class MinStack {
    private Stack<Integer> stack;
    private PriorityQueue<Integer> queue;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
        queue = new PriorityQueue<>();
    }

    public void push(int val) {
        stack.push(val);
        queue.add(val);

    }

    public void pop() {
        queue.remove(stack.pop());
    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
        if(queue.size() == 0) return -1;
        return  queue.peek();

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
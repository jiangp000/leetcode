package ImplementQueueusingStacks232;

import java.util.LinkedList;
import java.util.Stack;

public class ImplementQueueusingStacks232 {
}

// 先开始是 1
// 21
// 123
// 321
class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack();
        stack2 = new Stack();

    }

//    123
//
    /** Push element x to the back of queue. */
    public void push(int x) {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack2.push(x);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!stack1.isEmpty()) return stack1.pop();
        return  -1;
    }

    /** Get the front element. */
    public int peek() {
        if(!stack1.isEmpty()) return stack1.peek();
        return  -1;

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty();

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
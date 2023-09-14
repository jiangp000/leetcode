package ImplementStackusingQueues225;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues225 {
    public static void main(String[] args) {
        MyStack test = new MyStack();

    }
}


class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);
    }
    // 当他进行pop的时候，就比较麻烦

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(queue1.size() > 1) {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }

            int temp = queue1.poll();
            while(!queue2.isEmpty()){
                queue1.add(queue2.poll());
            }
            return  temp;
        }
        return  -1;


    }

    /** Get the top element. */
    public int top() {
        if(queue1.size() > 1) {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }

            int temp = queue1.poll();
            queue2.add(temp);
            while(!queue2.isEmpty()){
                queue1.add(queue2.poll());
            }
            return  temp;
        }
        return  -1;

    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return  queue1.isEmpty();

    }
}


// 一个维持正序的，一个维持倒序的
//  1
//  有pop操作的时候，再进行操作
// pop的时候，就
// 12345
// 1234  5
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
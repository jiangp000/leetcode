package offer9;

import java.util.Stack;

public class offer9 {
}

class CQueue {
    Stack<Integer> tail ;
    Stack<Integer> front;

    public CQueue() {
        this.tail = new Stack<>();
        this.front = new Stack<>();
    }

    public void appendTail(int value) {
        tail.push(value);
    }

    public int deleteHead() {
        if(front.isEmpty()){
            while (!tail.isEmpty()) {
                front.push(tail.pop());
            }
        }
        if(front.isEmpty()) return -1;
        else{
            return front.pop();
        }
    }
}

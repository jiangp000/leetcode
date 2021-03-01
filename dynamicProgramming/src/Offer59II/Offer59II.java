package Offer59II;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Offer59II {
}


class MaxQueue {
    List<Integer>  lst = new ArrayList<>();
    int max = -1;

    public MaxQueue() {

    }

    public int max_value() {
        if(lst.size() == 0) return -1;
        return max;
    }

    public void push_back(int value) {
        lst.add(value);
        if(max < value){
            max = value;
        }
    }

    public int pop_front() {
        if(lst.size() == 0) return -1;
        int Q = lst.remove(0);
        if(Q == max){
            max = -1;
            for(int i = 0; i < lst.size(); i++){
                max = Math.max(max, lst.get(i));
            }
        }
        return Q;
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
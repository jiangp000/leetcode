package DesignCircularQueue622;

public class DesignCircularQueue622 {
    public static void main(String[] args) {
        MyCircularQueue test = new MyCircularQueue(3);
        System.out.println(test.enQueue(1));
        System.out.println(test.enQueue(2));
        System.out.println(test.enQueue(3));
        System.out.println(test.enQueue(4));
    }
}
class MyCircularQueue {
    int[] data;
    int start, end, size;
    public MyCircularQueue(int k) {
        data = new int[k];
        start = 0;
        end = -1;
        size = 0;
    }

    public boolean enQueue(int value) {
        if(size == this.data.length) return false;
        size ++;
        data[ (end + 1) % data.length] = value;
        end = (end + 1) % data.length;
        return true;
    }

    public boolean deQueue() {
        if(size == 0) return  false;
        size --;
        start = (start + 1) % data.length;
        return true;
    }

    public int Front() {
        if(size == 0) return  -1;
        return  data[start];

    }

    public int Rear() {
        if(size == 0) return  -1;
        return  data[end];

    }

    public boolean isEmpty() {
        return  size == 0;

    }

    public boolean isFull() {
        return  size == data.length;

    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
package yuyuezuowei;

import java.util.PriorityQueue;

public class main {
}


// 应该使用优先队列
class SeatManager {
    private PriorityQueue<Integer>  seats;

    public SeatManager(int n) {
        seats = new PriorityQueue<>();
        for(int i = 1; i < n + 1; i++) {
            seats.add(i);
        }
    }

    public int reserve() {
        return seats.poll();

    }

    public void unreserve(int seatNumber) {
        seats.add(seatNumber);

    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
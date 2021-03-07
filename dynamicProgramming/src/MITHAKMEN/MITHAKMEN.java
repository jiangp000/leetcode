package MITHAKMEN;

import java.util.LinkedList;
import java.util.Queue;

public class MITHAKMEN {

    public static void count(int m) {
        m = m - ((m >> 1) & (033333333333)) - ((m >> 2) & (011111111111));

        int n = ((m + (m >> 3)) & (030707070707)) % (63);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Queue<Integer> myqueue = new LinkedList<>();
        myqueue.poll();
        MITHAKMEN tets = new MITHAKMEN();
        count(1024);
    }
}

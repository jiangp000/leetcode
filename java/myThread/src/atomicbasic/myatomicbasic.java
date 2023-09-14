package atomicbasic;

import java.util.concurrent.atomic.AtomicInteger;

public class myatomicbasic {
    public static void main(String[] args) {
        int temp = 0;
        AtomicInteger i = new AtomicInteger(0);
        temp = i.getAndSet(3);
        System.out.println(temp+"  "+ i);
        temp = i.getAndAdd(5);
        System.out.println(temp+"  "+ i);
        temp = i.getAndIncrement();
        System.out.println(temp+"  "+ i);

    }
}

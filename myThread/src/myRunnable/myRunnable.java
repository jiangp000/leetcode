package myRunnable;

public class myRunnable  implements  Runnable{
    @Override
    public void run() {
        System.out.println("this is my running");
    }

    public static void main(String[] args) {
        myRunnable test = new myRunnable();
        Thread Q = new Thread(test);
        Q.start();
    }
}

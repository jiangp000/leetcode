package singlePattern;

public class single3 {
    private volatile static single3 myinstance;

    private single3(){}

    public synchronized  void get(){

    }

    public static single3 getInstance(){
        if(myinstance == null){
            synchronized (single3.class){
                if(myinstance == null){
                    myinstance = new single3();
                }
            }
        }
        return  myinstance;
    }

    public static void main(String[] args) {
        single3 test1 = single3.getInstance();
        single3 test2 = single3.getInstance();
        System.out.println(test1 == test2);
    }
}

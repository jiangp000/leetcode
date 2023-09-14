package singlePattern;

public class single2 {
    private static single2 myinstance;

    private  single2(){}

    public static  single2 getInstance(){
        if(myinstance == null){
            myinstance = new single2();
        }
        return myinstance;
    }

    public static void main(String[] args) {
        single2 test1 = single2.getInstance();
        single2 test2 = single2.getInstance();
        System.out.println(test1 == test2);
    }
}

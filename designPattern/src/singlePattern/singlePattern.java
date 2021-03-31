package singlePattern;

public class singlePattern {
    private static singlePattern myinstance = new singlePattern();

    private  singlePattern(){ }

    public static singlePattern getInstance(){
        return myinstance;
    }

    public static void main(String[] args) {
        singlePattern test1 = singlePattern.getInstance();
        singlePattern test2 = singlePattern.getInstance();
        System.out.println(test1 == test2);
    }
}

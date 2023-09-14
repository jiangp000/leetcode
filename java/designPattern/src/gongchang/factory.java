package gongchang;

public class factory {
    public shape getShape(String s){
        if(s == null) return null;
        else if("CIRCLE".equals(s)) return new circle();
        else if("tangle".equals(s)) return  new tangle();
        else if("wubianxing".equals(s)) return new wubianxing();
        return  null;
    }

    public static void main(String[] args) {
        factory myfactory = new factory();
        myfactory.getShape("CIRCLE").draw();
        myfactory.getShape("tangle").draw();
        myfactory.getShape("wubianxing").draw();
    }
}

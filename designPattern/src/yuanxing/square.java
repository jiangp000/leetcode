package yuanxing;

public class square extends shape{

    public square(){
        type = "square";
    }
    @Override
    void draw() {
        System.out.println("我是一个正方形");
    }
}

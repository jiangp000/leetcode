package hannuota;

public class hannuota {
    static int num =0;
    public static void hano(int i, int start, int middle, int end){
        if(i > 0) {

            hano(i - 1, start,end,middle);
            System.out.println(start+ "   ----->   " + end);
            num ++;
            hano(i - 1, middle, start,end);
        }
    }
    public static void main(String[] args) {
        hano(9,1,2,3);
        System.out.println(num);

    }

//    从 A 移动到 C 中间只有 B 一个中转的，并且顺序不能调换
//    mov A to C
//
}

package Q;





public class p {
    final static double[][] data = new double[][]{
            {1.0, 1.0},
            {9.4, 6.4},
            {2.5, 2.1},
            {8.0, 7.7},
            {0.5, 2.2},
            {7.9, 8.4},
            {7.0, 7.0},
            {2.8, 0.8},
            {1.2, 3.0},
            {7.8, 6.1}
    };

    final static int[] output = new int[]{
            1,
            -1,
            1,
            -1,
            1,
            -1,
            -1,
            1,
            1,
            -1
    };
    static double[] w = new double[] {-0.6, 0.75, 0.5};

    public static int sign(double x){
        if(x == 0.0) return 0;
        else if(x > 0.0){
            if(x - 0.0 < 0.00001) return 0;
            else return 1;
        }else{
            if(0.0 - x < 0.00001) return 0;
            else return -1;
        }
    }
    public static void compute(){
        int row = 1;
        int length = data.length;
        // 最后全部收敛
        int index = 0;
        while(index < 10) {
            System.out.println(index);
            index = 0;
            for (int i = 0; i < length; i++) {
//                for (int j = 0; j < w.length; j++) {
//                    System.out.print(w[j] + " ");
//                }
                System.out.println();
                double[] d = data[i];
                double tmp = 1.0 * w[0] + d[0] * w[1] + d[1] * w[2];

                int predict = sign(tmp);
                System.out.print("第" + row + "行, " + "本次预测值为" + tmp + "当前预测结果为: " + predict);
                if (predict == output[i]) {
                    System.out.println("本次预测结果和实际值一致");
                    index++;
                } else {
                    System.out.println("本次需要更新权重");
                    int delta = output[i] - predict; // 真实值与预测值之差
                    w[0] = w[0] + 0.2 * delta * 1.0;
                    w[1] = w[1] + 0.2 * delta * d[0];
                    w[2] = w[2] + 0.2 * delta * d[1];
                }
                row++;
            }

            for (int j = 0; j < w.length; j++) {
                System.out.print(w[j] + " ");
            }
        }

    }
    public static void main(String[] args) {
        compute();
    }
}

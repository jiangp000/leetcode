package TEST4;


import java.util.*;


// 最后一个题目，从左上角到右下角，进行
public class Main {

    static int Q = 100000;
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Q = 100000;

        int row, col, mytime;
        row = reader.nextInt();
        col = reader.nextInt();
        mytime = reader.nextInt();
        int[][] data = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                data[i][j] = reader.nextInt();
            }
        }

        process(0,0,0,mytime,data);

        int RESULT = 0;
        if(Q == 100000){
            System.out.println( -1);
        }
        else{
            System.out.println(Q);
        }
    }

    public static void   process(int row, int col, int num, int TIMES, int[][] data) {
        if (num > TIMES) return;
        if (row >= data.length) return;
        if (col >= data[0].length) return;
        if (row == data.length - 1 && col == data[0].length - 1) {
            if (num + data[row][col] > TIMES) return;
            if(Math.abs(num + data[row][col] - TIMES) < Math.abs(Q - TIMES)) Q = num + data[row][col];
            return;
        }

        if (row == data.length - 1) {
            process(row, col + 1, num + data[row][col], TIMES, data);
            return;
        } else if (col == data[0].length - 1) {
            process(row + 1, col, num + data[row][col], TIMES, data);
            return;
        } else {
            process(row + 1, col, num + data[row][col], TIMES, data);
            process(row, col + 1, num + data[row][col], TIMES, data);
        }
        return;
    }
}

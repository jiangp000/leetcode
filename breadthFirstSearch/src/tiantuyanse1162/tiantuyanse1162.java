package tiantuyanse1162;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class tiantuyanse1162 {
    static int[] x = {-1, 1, 0,0};
    static int[] y = {0, 0, 1, -1};
    // 四个方向的遍历
    // 从1 开始，是因为 如果 0，0 是1的话，如果是1，那么就不能加入到我们的queue中
    // 我们寻找第一个第一个0，0的位置，

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        int[][] data = new int[50][50];
        for(int i = 1; i < num + 1; i++){
            String eachLine = scanner.nextLine();
            // 进行每一行的处理
            String[] eachData = eachLine.split(" ");
            for(int j = 1; j < num + 1; j++){
                data[i][j] = Integer.valueOf(eachData[j - 1]);
            }
        }

        // 数据的读取算是成功了，现在进入做题
        // 现在我们在外面加一层的0 ，填充颜色指的是防止越界

        Queue<Integer> myx = new LinkedList<>();
        Queue<Integer> myy = new LinkedList<>();
        int[][] visited = new int[50][50];
        visited[0][0] = 1;
        myx.add(0);myy.add(0);

        while(! myx.isEmpty()){
            for(int i = 0; i < 4; i++){
                int dx = myx.peek() + x[i];
                int dy = myy.peek() + y[i];

                if(dx >= 0 && dy >=0 && dx <= num + 1 && dy <= num + 1 && visited[dx][dy] == 0
                        && data[dx][dy] == 0 ){
                    myx.add(dx);
                    myy.add(dy);
                    visited[dx][dy] = 1;
                }
            }
            myx.remove();
            myy.remove();
        }

        for(int i = 0; i <= num; i++){
            for(int j = 0; j <=num; j++){
                if(data[i][j] == 0 && visited[i][j] == 0){
                    data[i][j] = 2;
                }
            }
        }

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }

    }
}


//6
//        0 0 0 0 0 0
//        0 0 1 1 1 1
//        0 1 1 0 0 1
//        1 1 0 0 0 1
//        1 0 0 0 0 1
//        1 1 1 1 1 1
package Array;

import java.util.Scanner;

public class duqushuzi2 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int rowNum = reader.nextInt();
        int i = 0, res = 0;
        while(i < rowNum){
            res = 0;
            res += reader.nextInt();
            res += reader.nextInt();
            i++;
            System.out.println(res);

        }
        System.out.println(res);
    }
}

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class duozuzifuchuan {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while(reader.hasNext()){
            String[] res = reader.nextLine().split(" ");
            Arrays.sort(res);
            for(int i = 0; i < res.length; i++){
                if(i == res.length - 1) System.out.println(res[i]);
                else System.out.print(res[i] +" ");
            }
        }
    }
}

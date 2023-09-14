package Array;

import java.util.Arrays;
import java.util.Scanner;

public class zifuchuan {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());
        String[] temp = reader.nextLine().split(" ");
        Arrays.sort(temp);
        for(int i = 0; i < temp.length; i++){
            if(i== temp.length -1 )  System.out.print(temp[i]);
            else {
                System.out.print(temp[i] + " ");
            }
        }

    }
}

package Array;

import java.util.Scanner;

public class budingzhu {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (reader.hasNext()){
            String[] temp = reader.nextLine().split(" ");
            Integer[] intTemp = new Integer[temp.length];
            int result = 0;
            for(int i = 1; i < Integer.parseInt(temp[0]) + 1; i++){
                result += Integer.parseInt(temp[i]);
            }
            System.out.println(result);
        }
    }
}

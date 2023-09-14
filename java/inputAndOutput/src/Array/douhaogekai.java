package Array;

import javafx.scene.transform.Scale;

import java.util.Arrays;
import java.util.Scanner;

public class douhaogekai {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while(reader.hasNext()){
            String[] temp = reader.nextLine().split(",");
            Arrays.sort(temp);
            for(int i = 0; i < temp.length; i++){
                if(i == temp.length -1) System.out.println(temp[i]);
                else System.out.print(temp[i]);
            }
        }
    }
}

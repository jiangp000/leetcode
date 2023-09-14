package TEST1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> getRes(String[] temp){
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < temp.length; i++){
            res.add(Integer.valueOf(temp[i]));
        }

        return  res;
    }
    public static void main(String[] args) {
        Scanner reader  = new Scanner(System.in);
        int num = Integer.valueOf(reader.nextLine());
        String[] temp = reader.nextLine().split(" ");
        List<Integer> array = getRes(temp);
        int i = 0, j = 1, res = 0,middle = 0;
        int up = 1;
        while(j < array.size()){
            if(up == 1){
                if(array.get(j - 1) < array.get(j)){
                    j++;
                }
                else if(array.get(j - 1) == array.get(j)){
                    i = j;
                    j++;
                }
                else{
                    if(j == i + 1){
                        i = j;
                        j++;
                    }
                    else{
                        middle = j - 1;
                        j++;
                        up = 0;
                    }
                }
            }
            else{
                if(array.get(j - 1) > array.get(j)){
                    j++;
                }
                else if(array.get(j - 1) == array.get(j)){
                    up = 1;
                    if(j - middle == 1){
                        i = j;
                        j++;
                        middle = 0;
                    }
                    else{
                        // 此时就是
                        res = Math.max(j - i,res);
                        i = j - 1;
                        j++;
                    }
                }
                else{
                    up = 1;
                    if(j - middle == 1){
                        i = j;
                        j++;
                        middle = 0;
                    }
                    else{
                        res = Math.max(j - i,res);
                        i = j - 1;
                        j++;
                    }
                }
            }

        }

//        System.out.println(i);
        if(up == 0) res = Math.max(res, j - i);
        System.out.println(res);
    }
}

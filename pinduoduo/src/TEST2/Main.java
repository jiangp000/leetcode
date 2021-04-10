package TEST2;

import java.util.Scanner;

public class Main {
    public static boolean isTrue(int data){
        int[] dp = new int[10];
        StringBuilder s = new StringBuilder(""+ data);
        for(int i = 0; i < s.length(); i++){
            dp[s.charAt(i) - '0']++;
        }
        int NUM = 0;
        for(int i = 2; i < dp.length; i++){
            if(dp[i] > 0) NUM++;
        }
        if(NUM  > 1 ) return false;
        return  true;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.valueOf(reader.nextLine());
        for(int i = 1; i < 100; i++){
            if(isTrue(num * i)){
                System.out.println(num * i);
                return;
            }
        }
        System.out.println(-1);
    }
}

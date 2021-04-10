package TEST3;

import java.util.Scanner;

public class Main {

    public static  boolean isTrue(String s,int k ){
        int[] dp = new int[26];
        for(int i = 0; i < s.length(); i++){
            dp[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(dp[i] % k != 0) return  false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.valueOf(reader.nextLine());
        String s = reader.nextLine();
        if(s.length() % num != 0){
            System.out.println(-1);
        }

    }
}

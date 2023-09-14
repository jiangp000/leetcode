package kmp;

import java.util.Arrays;

public class kmp {
    // ABAAAAA  ABA
//    O(m + n )
//     ABA
//    0        -1
//    A        0
//    AB       0

//     ABCABC
//     ABC

//    0  -1
//    A  0
//    AB 0
//    ABC 0
//    ABCA 1
//    ABCAB 2
    public static void main(String[] args) {
        String data ="ABCABC";
        String pattern ="ABC" ;
        kmp KMP = new kmp();
        KMP.kmp(pattern,data);
    }
    public void kmp(String pattetn,String data){
        int[] pretable =prefixTable(pattetn);
//        pattern data
//        j    i
//        n    m
        int i = 0,j = 0;
        int m = data.length(), n = pattetn.length();
        while(i < m){
            if(j == n-1 && data.charAt(i) == pattetn.charAt(j)){
                System.out.println(i - j);
                j = pretable[j];
                if(j == -1){
                    j ++;
                    i++;
                    continue;
                }
            }
//            AAAAA  A
//
            if (data.charAt(i) == pattetn.charAt(j)){
                i++;
                j++;
            }
            else{
                j =  pretable[j];
                if(j == -1){
                    i++;
                    j++;
                }
            }
        }
    }

    public int[] prefixTable(String pattern) {
        int[] result = new int[pattern.length()];
        result[0] = 0;
        int len = 0;
        int i = 1;
        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                result[i] = len;
                i++;
            } else {
                if (len > 0) {
                    len = result[len - 1];
                }
                else {
                    result[i] = 0;
                    i++;
                }
            }
        }
        for(int j = result.length-1; j>0;j--){
            result[j] = result[j - 1];
        }
        result[0] = -1;
        System.out.println(Arrays.toString(result));

        return  result;
    }

}

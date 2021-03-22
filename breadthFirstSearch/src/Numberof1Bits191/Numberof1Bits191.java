package Numberof1Bits191;

public class Numberof1Bits191 {
    public static void main(String[] args) {
        System.out.println(new Solution().hammingWeight(-16));
    }
}


class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = "";
        if(n >= 0){
            s = upFromDigitalToBinary(n);
        }
        else{
            s = downFromDigitalToBinary(n);
        }
        System.out.println("s    "+ s);
        // 现在是二进制都好了，只需要数1 的结果就好了
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1') result++;
        }

        return  result;
    }

    public String upFromDigitalToBinary(int n ){
        String res = "";
        while( n > 0){
            res = res + (n % 2);
            n /= 2;
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < 32 - res.length(); i++){
            result.append("0");
        }
        result.append(new StringBuilder(res).reverse().toString());
        System.out.println(result);
        return  result.toString();
    }

    public String downFromDigitalToBinary(int n ){
        String res = upFromDigitalToBinary( - n);
        StringBuilder newRes = new StringBuilder();
        for(int i = 0; i < res.length(); i++){
            if(res.charAt(i) == '0'){
                newRes.append('1');
            }
            else{
                newRes.append('0');
            }
        }

        // 再将他们的结果加1 就可以了
        int i = 31;
        for(; i >= 0; i--){
            if(newRes.charAt(i) == '0') {
                break;
            }
        }
        StringBuilder result = new StringBuilder();
        for(int j = 0; j < i ; j++){
            result.append(newRes.charAt(j));
        }
        result.append("1");
        while(result.length() < 32) {
            result.append("0");
        }

        return  result.toString();
    }

}
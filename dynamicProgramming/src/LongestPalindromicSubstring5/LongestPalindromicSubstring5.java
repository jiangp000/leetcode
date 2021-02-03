package LongestPalindromicSubstring5;

public class LongestPalindromicSubstring5 {
    public static void main(String[] args) {
        Solution test =new Solution();
//        System.out.println(test.longestPalindrome("1"));
//        System.out.println(test.longestPalindrome("babad"));
//        System.out.println(test.longestPalindrome("cbbd"));
//        System.out.println(test.longestPalindrome("bb"));
        System.out.println(test.longestPalindrome("bc"));




    }

}

class Solution {
    public String longestPalindrome(String s) {
        if(s.length() ==1) return s;
        int result=1, start=0,end =0;
        for(int i=0; i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if( j-i+1>result){
                    if(isPalidrome(s.substring(i,j+1))) {
                        result=j-i;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return  s.substring(start,end+1);

    }

    public boolean isPalidrome(String s){
        if(s == null || s.length() ==0 || s.length() ==1 ) return true;
        else return s.charAt(0) == s.charAt(s.length()-1) && isPalidrome(s.substring(1,s.length()-1));
    }
}

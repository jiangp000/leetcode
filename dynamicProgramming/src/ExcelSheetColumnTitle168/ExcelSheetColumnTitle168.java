package ExcelSheetColumnTitle168;

public class ExcelSheetColumnTitle168 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int n = 701;
        System.out.println(test.convertToTitle(n));
    }
}
//   9

//1001
class Solution {
    public String convertToTitle(int n) {
        if(n == 0) return "";
        String result = "";
        while(n > 0){
            n -= 1;
            int temp = n % 26;
            result = (char)(temp + 'A') + result;
            n /= 26;
        }
        return result.toString();

    }
}

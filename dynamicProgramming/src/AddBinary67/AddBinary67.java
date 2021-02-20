package AddBinary67;

public class AddBinary67 {
    public static void main(String[] args) {
        Solution test = new Solution();
        String a = "100", b = "110010";
        System.out.println(test.addBinary(a,b));
    }
}


class Solution {
    public String addBinary(String a, String b) {
        StringBuilder a1 = new StringBuilder(a);
        a1 = a1.reverse();

        StringBuilder b1 = new StringBuilder(b);
        b1 = b1.reverse();
        char add ='0';
        int i = 0, j = 0;
        while(i < a.length() && j < b.length()){
            if((a1.charAt(i) - '0') + (b1.charAt(j) - '0') + (add - '0') == 3){
                a1.replace(i,i+1,"1");
                i++;
                j++;
            }
            else  if((a1.charAt(i) - '0') + (b1.charAt(j) - '0') + (add - '0') == 2){
                a1.replace(i,i+1,"0");
                i++;
                j++;
                add = '1';
            }
            else if((a1.charAt(i) - '0') + (b1.charAt(j) - '0') + (add - '0') == 1){
                a1.replace(i,i+1,"1");
                i++;
                j++;
                add = '0';
            }
            else{
                a1.replace(i,i+1,"0");
                i++;
                j++;
                add = '0';
            }
        }

        // 最后看结果 add
        if(j == b.length()){
            while (i < a.length()){
                if(a1.charAt(i) - '0' + (add - '0') == 2){
                    a1.replace(i,i+1,"0");
                }
                else if(a1.charAt(i) - '0' + (add - '0') == 1){
                    a1.replace(i,i+1,"1");
                    add = '0';
                }
                else{
                    a1.replace(i,i+1,"0");
                }
                i++;
            }
            if(add == '1') return a1.append("1").reverse().toString();
            else return a1.reverse().toString();
        }
        if(i == a.length()){
            while (j < b1.length()){
                if(b1.charAt(j) - '0' + (add - '0') == 2){
                    a1.append("0");
                }
                else if(b1.charAt(j) - '0' + (add - '0') == 1){
                    a1.append("1");
                    add = '0';
                }
                else{
                    a1.append("0");
                }
                j++;
            }
            if(add == '1') return a1.append("1").reverse().toString();
            else return a1.reverse().toString();
        }
        return  null;

    }

}
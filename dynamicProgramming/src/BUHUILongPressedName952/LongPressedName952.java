package BUHUILongPressedName952;

public class LongPressedName952 {
    public static void main(String[] args) {
        Solution test = new Solution();
        String name = "alex";
        String typed = "aaleexa";
        System.out.println(test.isLongPressedName(name,typed));
    }
}
//"alex"
//        "aaleexa"
// 他们是进行严格的对应的，i 和 j
// 这个题目我不会，非常非常菜鸡的那种

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name == null){
            if(typed == null) return true;
            return false;
        }
        if(typed ==null) return false;
        if(name.length() > typed.length()) return  false;
        int i = 0, j = 0;

        // 我们每次比较字符，如果相等，就往后面来，如果不行就过
        // 两个在一起的时候，他们的字符串也必须要一样

        while(i < name.length() && j < typed.length()){
            if(name.charAt(i) == typed.charAt(j)){
                int temp = i;
                // 如果两个地点是相等，那么就直接continue
                i++;
                j++;
                // 这个的时候还有缺陷
                // 如果i 是相等的话，是要一直判断清楚的

                if(i < name.length() && name.charAt(i - 1) == name.charAt(i)){
                    //
                    while(i < name.length() && j < typed.length()){
                        if(name.charAt(i) == name.charAt(temp)){
                            if(name.charAt(i) == typed.charAt(j)){
                                i++;
                                j++;
                            }
                            else{
                                return  false;
                            }
                        }
                        else{
                            break;
                        }
                    }
                }
            }
            // 如果两个字符不相等，那么就直接 j++
            else{
                j++;
            }
        }


        if(i == name.length() ){
            int temp = j - 1;
            while(j < typed.length()){
                if(typed.charAt(temp) != typed.charAt(j)) return false;
                j++;
            }
            return true;
        }
        return  false;

    }
}
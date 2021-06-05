package LemonadeChange860;

public class LemonadeChange860 {
}


class Solution {
    static int[] data;
    public boolean lemonadeChange(int[] bills) {
        data = new int[3];
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5) data[0]++;
            if(bills[i] == 10){
                if(data[0] > 0){
                    data[0]--;
                    data[1]++;
                }
                else{
                    return false;
                }
            }
            else if(bills[i] == 20){
                if(data[0] < 1) return false;
                data[0]--;
                if(data[1] > 0){
                    data[1]--;
                    data[2]++;
                }
                else{
                    if(data[0] < 2) return  false;
                    data[0] -= 2;
                }
            }
        }
        return true;
    }
}
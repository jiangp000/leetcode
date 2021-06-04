package CanPlaceFlowers605;

public class CanPlaceFlowers605 {
}


class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0 && ( i + 1 == flowerbed.length || flowerbed[i + 1] == 0)){
                n--;
                i++;
            }
            else if(flowerbed[i] == 1){
                i++;
            }
        }
        return n <= 0;

    }
}
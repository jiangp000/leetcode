package SortArrayByParity905;

public class SortArrayByParity905 {
}


class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int index=0;
        for(int i=0; i<A.length;i++){
            if(A[i] % 2==0){
                result[index] = A[i];
                i++;
            }
        }
        for(int i=0; i<A.length;i++){
            if(A[i] % 2 != 0){
                result[index] = A[i];
                i++;
            }
        }
        return  result;

    }
}
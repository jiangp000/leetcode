package RelativeSortArray1122;

import java.net.ServerSocket;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RelativeSortArray1122 {
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        test.relativeSortArray(arr1,arr2);
    }
}


class Solution {
    public void sortingMap(HashMap<Integer,Integer> temp){

    }
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // 建立 hashmap  key - value
        HashMap<Integer,Integer> data = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if( data.containsKey(arr1[i]) ){
                data.put(arr1[i],data.get(arr1[i]) + 1);
            }
            else{
                data.put(arr1[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : data.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        // 进行有序数组的排序
        // 将有的元素进行设置为 0
        int[] result = new int[arr1.length];
        int base = 0;
        for(int i=0;i<arr2.length;i++){
            int j=data.get( arr2[i] );
            for(int k =base; k<base+j;k++){
                result[k] =arr2[i];
            }
            data.put(arr2[i],0);
            base = base + j;
        }
        // 将最后没有出现的元素 递增
//        for(int i = 0;i<result.length;i++){
//            System.out.print(result[i] + " ");
//        }
        Integer[] keyset =data.keySet().toArray(new Integer[0]);
        Arrays.sort(keyset);
        for(int i = 0;i<keyset.length;i++){
            if( data.get(keyset[i]) != 0 ){
                // 如果不等于 0 说明，那么就皆在后面
                int j =data.get(keyset[i]);
                for(int k =base; k<base+j;k++){
                    result[k] =keyset[i];
                }
                base += j;
            }
        }

        for(int i = 0;i<result.length;i++){
            System.out.print(result[i]+ " ");
        }
//        System.out.println(base);

        return result;
    }
}
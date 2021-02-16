package HIndex274;

import java.util.*;

// 总计 h篇论文 超过h引用数，其他的论文都小于 h
public class HIndex274 {
}
class Solution {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int i = 0;
//        3 0 6 1 5
//        0 1 3 5 6
        while(i < citations.length && citations[citations.length - 1 - i]> i){
            i++;
        }
        return  i;

    }

}
//    public HashMap<Integer,Integer>  fromArrayToMap(int[] num){
//        HashMap<Integer,Integer> result = new HashMap<>();
//        for(int i = 0; i< num.length; i++){
//            if(result.containsKey(num[i])){
//                result.put(num[i],result.get(num[i])+1);
//            }
//            else{
//                result.put(num[i],1);
//            }
//        }
//        return result;
//    }
//    public int hIndex(int[] citations) {
//        if(citations.length == 1){
//            if(citations[0] == 0) return 0;
//            return 1;
//        }
//        HashMap<Integer,Integer> result = fromArrayToMap(citations);
//        List<Integer> keyList = new ArrayList<>(result.keySet());
//        Collections.sort(keyList, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        int NTimes = 0;
//        for(int i = 0; i < keyList.size(); i++){
//            NTimes += result.get(keyList.get(i));
//            if(NTimes >= keyList.get(i))  return  keyList.get(i);
//        }
//        return 0;
//
//    }

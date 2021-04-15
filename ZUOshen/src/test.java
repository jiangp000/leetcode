import java.util.*;

public class test {

    public int solve(int[][] arr){
        HashMap<Integer,Integer> res = new HashMap();
        for(int i = 0; i < arr.length; i++){
            int k = 0;
            for(int j =0; j < arr[0].length; j++){
                k += arr[i][j];
                if(res.containsKey(k)){
                    res.put(k,res.get(k) + 1);
                }
                else{
                    res.put(k,1);
                }
            }
        }
        Collections.max(res.values());
        // 求得hashmap 里面 value 的最大值，找到对应的key
        Set<Integer> keySet = res.keySet();
        Iterator s = keySet.iterator();
        int result = 0;
        int resIndex = 0;
        while(s.hasNext()){
            Integer index =(Integer) s.next();
            Integer value = res.get(index);
            if(value > result){
                resIndex = index;
                result = value;
            }
        }
        return result;

    }
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.int);


    }
}

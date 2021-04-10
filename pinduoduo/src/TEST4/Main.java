package TEST4;

import java.util.*;

public class Main {
    public static List<Integer> getRes(int i){
        List<Integer> temp = new ArrayList<>();
        for(int k = 2; k < i + 1; k++){
            if(isTrue(k)){
                temp.add(k);
            }
        }
        return  temp;
    }

    public static boolean isTrue(int k ){
        for(int j = 2; j < k / 2; j++){
            if(k % j == 0) return false;
        }
        return true;
    }
    public static HashMap<Integer,Integer> getYourRes(List<Integer> res, int base){
        int i = 0;
        HashMap<Integer,Integer> result = new HashMap<>();
        while(base != 1){
            if(base % res.get(i) == 0){
                base = base / res.get(i);
                if(result.containsKey(res.get(i))){
                    result.put(res.get(i),result.get(res.get(i)) + 1);
                }
                else{
                    result.put(res.get(i),1);
                }
            }
            else{
                i++;
            }
        }
        return result;
    }
    public static  HashMap<Integer,Integer> getKey(int i, Set<Integer> myset){
        HashMap<Integer,Integer> result = new HashMap<>();
        for(int k = i; k > 1; k--) {
            int p = k;
            Iterator iterator = myset.iterator();
            while (iterator.hasNext() ) {
                Integer s = (Integer) iterator.next();
                while (p % s == 0) {
                    p = p / s;
                    if(result.containsKey(s)){
                        result.put(s, result.get(s) + 1);
                    }
                    else{
                        result.put(s,1);
                    }
                }
            }
        }
        return result;
    }

    public static int getFinalResult(HashMap<Integer,Integer> yourNum, HashMap<Integer,Integer> realNum){
        Set<Integer> toBe = yourNum.keySet();
        Set<Integer> real = realNum.keySet();
        if(! toBe.equals(real)) return 0;

        int result = Integer.MAX_VALUE;
        Iterator s = toBe.iterator();
        while(s.hasNext()){
            Integer p = (Integer) s.next();
            int TOBE  = yourNum.get(p);
            int VALUE = realNum.get(p);
            result = Math.min(result,VALUE / TOBE);
        }
        System.out.println(result);
        return  result;

    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt(), base = reader.nextInt();
        List<Integer> oddNum = getRes(1000000);
        System.out.println(oddNum);
        HashMap<Integer,Integer> yourNum = getYourRes(oddNum,base);
//        System.out.println(yourNum);
        HashMap<Integer,Integer> realNum = getKey(num,yourNum.keySet());
//        System.out.println(realNum);

        int P = getFinalResult(yourNum,realNum);

        // 然后就进行对比两个 hashMap，看看最大的是几
    }
}

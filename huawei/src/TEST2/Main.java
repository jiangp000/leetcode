package TEST2;

import java.util.*;

// 每行给出两个字符串，查看多少个
public class Main {
    public static List<String> getList(String s) {
        String[] temp = s.split(" ");
        List<String> Q = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            Q.add(temp[i]);
        }
        return Q;
    }

    public static void process(List<Set<String>> result, List<String> temp) {
        for (int i = 0; i < temp.size(); i++) {
            for(int j = 0; j <result.size();j++){
                if(result.get(j).contains(temp.get(i))){
                    // 全添加进去
                    for(int k = 0; k < temp.size(); k++) {
                        result.get(j).add(temp.get(k));

                    }
                    return;
                }
            }
        }
        // 如果说都没有的话，那就新增加一个进去
        Set<String> q = new HashSet<>();
        for(int i = 0; i < temp.size(); i++){
            q.add(temp.get(i));
        }
        result.add(q);
        return;
    }
    public static  boolean isContains(Set<String> a, Set<String> b){
        Iterator s = b.iterator();
        while(s.hasNext()){
            if(a.contains(s.next())) return true;
        }
        return false;
    }
    public static int getFinal(List<Set<String>> result){
        int[] arr = new int[result.size()];
        int res = result.size();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if(isContains(result.get(i),result.get(j))){
                        res--;
                        arr[i] = 1;
                    }

                }
            }
            arr[i] = 1;
        }
        return  res;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.valueOf(reader.nextLine());
        List<List<String>> res = new ArrayList();
        for (int i = 0; i < num; i++) {
            String temp = reader.nextLine();
            res.add(getList(temp));
        }
        List<Set<String>> result = new ArrayList<>();

        for (int i = 0; i < res.size(); i++) {
            List<String> temp = res.get(i);
            // 看有没有存在
            process(result, temp);
        }
        for(int i = 0; i < result.size(); i++){
//            System.out.println(result.get(i));
        }
        //
        int FINAL = getFinal(result);
//        System.out.println(result.size());
        System.out.println(FINAL);
    }
}
package TEST3;


import java.util.*;

public class Main {
    public static  HashMap<Integer, List<Integer>> process(String s){
        String[] q = s.split(",");
        HashMap<Integer, List<Integer>> result = new HashMap<>();
        for(int i = 0; i < q.length; i++){
            String[] p = q[i].split("->");
            if(result.containsKey(Integer.valueOf(p[0]))){
                List<Integer> m = result.get(Integer.valueOf(p[0]));
                m.add(Integer.valueOf(p[1]));
            }
            else{
                List<Integer> m = new ArrayList<>();
                m.add(Integer.valueOf(p[1]));
                result.put(Integer.valueOf(p[0]),m);
            }
        }
        return result;
    }

    public static void help(HashMap<Integer,List<Integer>> res,int num){
        Iterator s = res.keySet().iterator();
        while(s.hasNext()){
            Integer p =(Integer) s.next();
            List<Integer> temp = res.get(p);
            //
            for(int i = 0; i < temp.size(); i++){
                if(temp.get(i) == num){
                    temp.remove(i);
                    i--;
                }
            }
            if(temp.size() == 0) res.remove(p);
        }
    }

    public static void getResult(HashMap<Integer,List<Integer>> res, int[] num){
        int[] p = new int[num.length];
        List<Integer> result = new ArrayList<>();
        int TIMES = 0;
        int[] visited = new int[p.length];
        for(int i = 0; i < num.length ; i++){
            // 先查看是否queue中的可以执行了

            if(res.containsKey(i)){
                result.add(i);
            }
            else{
                // 如果他不在的话，他就可以做了，并且还可以解脱别人的痛苦
                // 做别人的时候，就得开始做了
                p[i] = num[i] + TIMES;
                // 并且解脱别人的痛苦

                help(res,i);
                visited[i] = 1;

                TIMES = p[i];
            }
        }

//
//1,3,4,5,8,5,3,6
//0->2,2->4,2->6
//
//
//
//        35,3,34,8,16,21,24,30

        for(int j = 0; j < result.size(); j++){
            if(! res.containsKey(result.get(j)) && visited[result.get(j)] == 0){
                p[result.get(j)] = num[result.get(j)] + TIMES;
                TIMES = p[result.get(j)];
                visited[result.get(j)] = 1;
                help(res,result.get(j));
                result.remove(j);
                j = -1;
            }
        }
        for(int i = 0; i < p.length; i++){
            if (i == p.length - 1) {

                System.out.print(p[i]);
            }
            else {
                System.out.print(p[i]+",");
            }
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] q = reader.nextLine().split(",");
        int[] num = new int[q.length];
        for(int i = 0; i < q.length; i++){
            num[i] = Integer.valueOf(q[i]);
        }
        HashMap<Integer,List<Integer>> map = process(reader.nextLine());
        getResult(map,num);
    }
}

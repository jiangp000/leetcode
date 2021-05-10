package ReconstructItinerary332;

import java.util.*;

public class ReconstructItinerary332 {
}


class Solution {
    private HashMap<String, PriorityQueue<String>> map;
    private List<String> result;
    public List<String> findItinerary(List<List<String>> tickets) {
        map = new HashMap<>();
        for(int i = 0; i < tickets.size(); i++){
            if(map.containsKey(tickets.get(i).get(0))){
                map.get(tickets.get(i).get(0)).add(tickets.get(i).get(1));
            }
            else{
                PriorityQueue<String> q = new PriorityQueue<>();
                q.add(tickets.get(i).get(1));
                map.put(tickets.get(i).get(0),q);
            }
        }
        // 进行深入搜索就OK 了
        result = new ArrayList<>();
        dfs("JFK");
        Collections.reverse(result);
        return result;


    }
    public void dfs(String s){
        while(map.containsKey(s) && map.get(s).size() > 0){
            String temp = map.get(s).poll();
            dfs(temp);
        }
        result.add(s);
    }
}
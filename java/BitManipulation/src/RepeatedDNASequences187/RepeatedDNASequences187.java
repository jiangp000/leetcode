package RepeatedDNASequences187;

import java.util.*;

public class RepeatedDNASequences187 {
}


class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> res = new HashMap<>();
        for(int i = 0; i < s.length() -10; i++){
            if(res.containsKey(s.substring(i,i+10))){
                res.put(s.substring(i,i+10),res.get(s.substring(i,i+10)) + 1);
            }
            else{
                res.put(s.substring(i,i+10), 1);
            }
        }
        Set<String> result = res.keySet();
        Iterator q = result.iterator();
        List<String> result999 = new ArrayList<>();
        while(q.hasNext()){
            String temp = (String) q.next();
            if(res.get(temp) > 1) {
                result999.add(temp);
            }
        }

        return  result999;

    }
}
package CloneGraph133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph133 {
    public static void main(String[] args) {
        System.out.println(1111);
    }

}


class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class Solution {
    HashMap<Node,Node> res = new HashMap();
    public Node cloneGraph(Node node) {
        if(node == null) return node;
        if(res.containsKey(node)) return res.get(node);

        Node clone = new Node(node.val,new ArrayList());
        res.put(node,clone);

        for(Node neighbour : node.neighbors){
            res.get(node).neighbors.add(cloneGraph(neighbour));
        }
        return  clone;


    }
}
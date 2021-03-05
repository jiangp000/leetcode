package mianshi;

import java.util.ArrayList;
import java.util.List;

public class mianshi {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node s1 = new Node(2);
        Node s2 = new Node(3);
        Node s3 = new Node(4);
        Node s4 = new Node(5);
        Node s5 = new Node(6);
        root.left = s1;
        root.right = s2;
        s1.left = s3;
        s1.right = s4;
        s2.left = s5;
        List<Integer> paths = new ArrayList<>();
        getParent(root,paths);
        System.out.println(paths);
    }
    public static void getParent(Node node, List<Integer> temp){
        if(node !=null){
            temp.add(node.value);
            getParent(node.left,temp);
            getParent(node.right,temp);
        }
    }

}

class Node{
    Node left;
    Node right;
    int value;

    public Node(int value) {
        this.value = value;
    }
}
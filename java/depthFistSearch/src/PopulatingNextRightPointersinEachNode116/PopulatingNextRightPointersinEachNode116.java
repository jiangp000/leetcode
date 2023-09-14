package PopulatingNextRightPointersinEachNode116;

import java.util.*;

public class PopulatingNextRightPointersinEachNode116 {
}



class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        Node myroot = root;
        Queue<Node> stack = new LinkedList();
        stack.add(root);
        while (!stack.isEmpty()) {
            int num = stack.size();

            Node first = stack.remove();
            if (num == 1) {
                if (first.left != null) {
                    stack.add(first.left);
                }
                if (first.right != null) {
                    stack.add(first.right);
                }
            }
            else {
                for (int i = 0; i < num - 1; i++) {
                    Node second = stack.remove();
                    if (first.left != null) {
                        stack.add(first.left);
                    }
                    if (first.right != null) {
                        stack.add(first.right);
                    }
                    first.next = second;
                    first = first.next;
                    if(i == num -2){
                        if (first.left != null) {
                            stack.add(first.left);
                        }
                        if (first.right != null) {
                            stack.add(first.right);
                        }
                    }
                }
            }
        }
        return myroot;
    }
}
package SecondMinimumNodeInaBinaryTree671;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SecondMinimumNodeInaBinaryTree671 {
    public static void main(String[] args) {

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    static ArrayList<Integer> num ;
    public int findSecondMinimumValue(TreeNode root) {
        num = new ArrayList<>();
        pretraversal(root);
        int smallest = Collections.min(num);
        int secondsmall = Integer.MAX_VALUE;
        for(int i=0;i<num.size();i++){
            if(num.get(i) == smallest){
                num.remove(i);
                i--;
            }
        }
        if(num.size() == 0) return -1;
        return Collections.min(num);

    }

    public void pretraversal(TreeNode node){
        if(node == null) return;
        num.add(node.val);
        pretraversal(node.left);
        pretraversal(node.right);
    }

}
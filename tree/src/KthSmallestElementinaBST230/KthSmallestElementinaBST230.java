package KthSmallestElementinaBST230;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementinaBST230 {
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
    static List<Integer> res;
    public int kthSmallest(TreeNode root, int k) {
        res = new ArrayList<>();
        inScan(root);

        return  res.get(k - 1);
    }
    public void inScan(TreeNode node){
        if(node == null) return ;
        inScan(node.left);
        res.add(node.val);
        inScan(node.right);

    }
}
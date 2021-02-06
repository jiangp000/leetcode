package ValidateBinarySearchTree98;


import java.util.ArrayList;
import java.util.Arrays;

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

public class ValidateBinarySearchTree98 {
    public static void main(String[] args) {
        Solution test = new Solution();
        TreeNode s1 =new TreeNode(0);
        s1.left = null;
        s1.right = null;
        System.out.println(test.isValidBST(s1));
    }
}
class Solution {
    static ArrayList<Integer> item =new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        if(item.size() == 1) return  true;
        System.out.println(Arrays.toString(item.toArray()));

        for(int i = 0;i < item.size()-1;i++){
            if(item.get(i) > item.get(i+1)) return  false;
        }
        return true;
    }
    public void inorder(TreeNode node){
        if(node == null) return ;
        inorder(node.left);
        item.add(node.val);
        inorder(node.right);
    }
}
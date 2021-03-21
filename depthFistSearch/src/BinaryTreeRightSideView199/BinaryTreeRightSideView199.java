package BinaryTreeRightSideView199;

import java.util.*;

public class BinaryTreeRightSideView199 {
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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(! queue.isEmpty()){
            int N = queue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < N; i++){
                TreeNode mynode = queue.remove();
                temp.add(mynode.val);
                if(mynode.left != null){
                    queue.add(mynode.left);
                }

                if(mynode.right != null){
                    queue.add(mynode.right);
                }
            }
            res.add(temp);
        }

        List<Integer> myres = new ArrayList<>();

        for(int i = 0; i < res.size(); i++){
            List<Integer> p = res.get(i);
            myres.add(p.get(p.size() - 1));
        }

        return myres;

    }
}
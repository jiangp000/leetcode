package BinaryTreeZigzagLevelOrderTraversal103;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal103 {
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(! queue.isEmpty()){
            int N = queue.size();
            List<Integer> eachList = new ArrayList<>();
            for(int i = 0; i < N; i++){
                TreeNode temp = queue.remove();
                eachList.add(temp.val);
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
            res.add(eachList);
        }

        for(int i = 0; i < res.size(); i++){
            if(i % 2 == 1){
                Collections.reverse(res.get(i));
            }
        }
        return  res;

    }
}
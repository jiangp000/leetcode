package MinimumAbsoluteDifferenceinBST530;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MinimumAbsoluteDifferenceinBST530 {
}

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


//   任意两个节点的数值，不是相邻节点的数值
//   那就进行遍历，中序遍历，
class Solution {
    static List<Integer> res;
    static  int MIN = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        res = new ArrayList<>();
        process(root);
        MIN = Integer.MAX_VALUE;
        for(int i = 1; i < res.size(); i++){
            System.out.println(res.get(i));
            MIN = Math.min(MIN,res.get(i) - res.get(i - 1));

        }
        return  MIN;
    }

    public void process(TreeNode node){
        if(node == null) return ;

        Stack<TreeNode> stack = new Stack();

        while( !stack.isEmpty() || node != null){
            while(node != null){
                stack.push(node);
                node = node.left;
            }
            TreeNode myNode = stack.pop();
            res.add(myNode.val);
            node = myNode.right;
        }

    }
}
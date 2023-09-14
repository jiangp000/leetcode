package ConvertBSTGreaterTree538;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConvertBSTGreaterTree538 {
}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class Solution {
    static List<Integer> res;
    static HashMap<Integer,Integer> hashmap;
    public TreeNode convertBST(TreeNode root) {
            if(root == null) return null;
        res = new ArrayList<>();
        hashmap = new HashMap();
        inOrder(root);
        int[] sum = new int[res.size() + 1];
        // 大于等于之和，我还以为小于等于之和，


        sum [sum.length - 1] = res.get(res.size() - 1);
        for(int i = sum.length - 2; i >= 1; i--){
            sum[i] = sum[i + 1] + res.get(i - 1);
        }
        for(int i = 1; i < sum.length; i++){
            hashmap.put(res.get(i - 1),sum[i]);
        }

        process(root);
        return  root;

    }

    public  void  process(TreeNode node){
        if(node == null) return;
        node.val = hashmap.get(node.val);
        process(node.left);
        process(node.right);
    }

    public void inOrder(TreeNode node){
        if(node == null) return;
        inOrder(node.left);
        res.add(node.val);
        inOrder(node.right);
    }
}
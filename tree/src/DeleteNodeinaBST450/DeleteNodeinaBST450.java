package DeleteNodeinaBST450;

public class DeleteNodeinaBST450 {
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

    public int successor(TreeNode node){
        node  = node.right;
        while(node.left != null) node = node.left;
        return  node.val;
    }

    // 右子节点中选择最小的
    // 左子节点中选择最大的
    public int predecessor(TreeNode node){
        node = node.left;
        while(node.right != null) node = node.right;
        return node.val;
    }

    // 我们要找到他的爸爸，然后根据他的爸爸来进行操作
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return  null;
        if(root.val < key) root.right = deleteNode(root.right,key);
        else if(root.val > key) root.left = deleteNode(root.left,key);
        else{
            // 此时就找到了自己的位置
            if(root.left == null && root.right == null) root = null;
            else if(root.right != null){
                // 找到右边的最小的数值，此时恰好
                root.val = successor(root);
                root.right = deleteNode(root.right,root.val);
            }
            else{
                root.val = predecessor(root);
                root.left = deleteNode(root.left,root.val);

            }
        }

        return  root;



    }
}
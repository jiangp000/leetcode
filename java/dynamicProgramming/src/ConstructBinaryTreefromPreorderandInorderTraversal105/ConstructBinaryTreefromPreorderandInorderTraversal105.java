package ConstructBinaryTreefromPreorderandInorderTraversal105;




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

public class ConstructBinaryTreefromPreorderandInorderTraversal105 {
}

//        preorder = [3,9,20,15,7]
//        inorder = [9,3,15,20,7]

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0,0,inorder.length-1,preorder,inorder);

    }

    public TreeNode helper(int prestart,int instart,int inend,int[] preorder,int[] inoder){
        if(prestart > inoder.length -1 || instart >inend) return null;

        TreeNode root =new TreeNode(preorder[prestart]);

        int index=0;
        for(int i = instart;i < inoder.length;i++){
            if(preorder[prestart] == inoder[i]){
                index = i;
                break;
            }
        }
//        preorder = [3,9,20,15,7]
//        inorder = [9,3,15,20,7]

        root.left  = helper(prestart+1,instart,index-1,preorder,inoder);
        root.right = helper(prestart+index-instart+1,index+1,inend,preorder,inoder);

        return root;

    }
}
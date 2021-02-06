package BinaryTreeLevelOrderTraversalII107;

import java.util.*;

public class BinaryTreeLevelOrderTraversalII107 {
    public static void main(String[] args) {
        List<List>  mylist =new ArrayList<>();
        List<Integer> s1 =new ArrayList<>();
        s1.add(1);
        s1.add(2);
        List<Integer> s2 =new ArrayList<>();
        s2.add(3);
        s2.add(4);
        mylist.add(s1);
        mylist.add(s2);
        for(int i=0;i<mylist.size();i++){
            System.out.println(Arrays.toString(mylist.get(i).toArray()));
        }
        Collections.reverse(mylist);
        for(int i=0;i<mylist.size();i++){
            System.out.println(Arrays.toString(mylist.get(i).toArray()));
        }
    }
}
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;

     TreeNode(int x) {
         val = x;
     }

 }

// before  after
//[1,2]
//
//[3,4,5,6]
//
//
//[1,2,3,5,6,7]

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return null;
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue =new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            List<Integer> s1 = new ArrayList<>();
            for(int i = 0;i < len;i++){
                TreeNode temp = queue.poll();
                s1.add(temp.val);
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            }
            result.add(s1);
        }

        Collections.reverse(result);
        return  result;


    }
}
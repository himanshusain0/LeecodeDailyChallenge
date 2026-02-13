
//   Definition for a binary tree node.

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
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


    void  helper(TreeNode root,List<Integer> res){
        if(root!=null){
            helper(root.left,res);
            res.add(root.val);
            helper(root.right,res);
        }
    }

    TreeNode result(List<Integer> res , int left, int right){
        if(left>right) return null; 
        int mid =( left+right)/2;
        TreeNode root = new TreeNode(res.get(mid));
        root.left = result(res, left, mid-1);
        root.right = result(res, mid+1, right);
        return root;
    }

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        int left=0;
        int right = res.size()-1;


        return result(res, left , right);
    }
}
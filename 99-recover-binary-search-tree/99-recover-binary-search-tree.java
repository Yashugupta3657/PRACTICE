/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    //global to store the one to be swapped;
    TreeNode previous=null;
    TreeNode first=null;
    TreeNode second=null;
    public void recoverTree(TreeNode root) {
        check(root);
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
//move inorder wise as it gives sorted values previous of first violation and root for second violation they are stored and in main function we swap them..violation will occure 2times.
    public void check(TreeNode root){
        if(root==null){
            return;
        }
        check(root.left);
        if(previous!=null&&root.val<previous.val){
            if(first==null){
                first=previous;
            }
            second=root;
        }
        previous=root;
        check(root.right);
    }
}
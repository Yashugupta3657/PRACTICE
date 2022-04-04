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
            List<String> m=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {

        check(root,"");
        return m;
    }
    public void check(TreeNode root,String s){
        if(root==null){
            return;
        }
        s=s+String.valueOf(root.val);
        if(root.left==null&&root.right==null){
            m.add(s);
            return;
        }
        if(root.left!=null){
            check(root.left,s+"->");
        }
        if(root.right!=null){
            check(root.right,s+"->");
        }
    }
}
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> m=new ArrayList<>();
        check(root,"",m);
        return m;
    }
    public void check(TreeNode root,String s,List<String> m){
        if(root==null){
            return;
        }
        s=s+String.valueOf(root.val);
        if(root.left==null&&root.right==null){
            m.add(s);
            return;
        }
        if(root.left!=null){
            check(root.left,s+"->",m);
        }
        if(root.right!=null){
            check(root.right,s+"->",m);
        }
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans=null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
         check(original,cloned,target);
        return ans;
    }
    public void check(TreeNode root,TreeNode root1,TreeNode target){
        if(root==null)
            return;
        if(root==target)
        { 
            ans=root1;
           return;
        }
        check(root.left,root1.left,target);
        check(root.right,root1.right,target);
    }
}
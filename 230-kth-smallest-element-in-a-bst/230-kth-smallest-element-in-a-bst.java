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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> m=new ArrayList<>();
        inorder(m,root);
        return m.get(k-1);
    }
    public void inorder(List<Integer> m,TreeNode root){
        if(root==null)
            return;
        inorder(m,root.left);
        m.add(root.val);
        inorder(m,root.right);
    }
}
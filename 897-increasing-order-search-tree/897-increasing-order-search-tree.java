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
    public TreeNode increasingBST(TreeNode root) {
       List<Integer> val=new ArrayList<>();
        storeInorder(val,root);
        TreeNode answer=null;
        TreeNode current=null;
        for(int i=0;i<val.size();i++){
            if(answer==null){
                answer=new TreeNode(val.get(i));
                current=answer;
            }
            else{
                current.right=new TreeNode(val.get(i));
                current=current.right;
            }
        }
        return answer;
    }
    public void storeInorder(List<Integer> val,TreeNode root){
        if(root==null)
            return;
        storeInorder(val,root.left);
        val.add(root.val);
        storeInorder(val,root.right);
    }
}
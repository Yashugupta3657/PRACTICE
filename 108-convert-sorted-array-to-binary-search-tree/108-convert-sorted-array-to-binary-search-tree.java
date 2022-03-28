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
    public TreeNode sortedArrayToBST(int[] nums) {
       return create(0,nums.length-1,nums);  
    }
    public TreeNode create(int left,int right,int[] nums){
        if(left>right)
            return null;
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=create(left,mid-1,nums);
        root.right=create(mid+1,right,nums);
        return root;
    }
}
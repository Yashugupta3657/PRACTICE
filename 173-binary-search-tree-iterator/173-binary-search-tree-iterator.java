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
class BSTIterator {
    int size;
    ArrayList<Integer> A;
    public BSTIterator(TreeNode root) {
      this.A = new ArrayList<>();
      this.size = 0;
      this.dfs(root);
    }
    
    public void dfs(TreeNode root){
       if(root == null) return;
       this.dfs(root.left);
       this.A.add(root.val);
       this.dfs(root.right);
    }
    
    public int next() {
        return this.A.get(size++);
    }
    
    public boolean hasNext() {
        if(this.size + 1 <= this.A.size())
         return true;
        else
         return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
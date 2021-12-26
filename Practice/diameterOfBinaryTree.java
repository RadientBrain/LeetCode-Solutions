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
    int count=0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return count;
    }
    
    int depth(TreeNode root){
        if(root==null) return 0;
        int leftSubTree = depth(root.left);
        int rightSubTree = depth(root.right);
        count = Math.max(count,leftSubTree + rightSubTree);
        return Math.max(leftSubTree,rightSubTree)+1;
    }
}

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        
        if(root == null){
            return res;
        }
        q.offer(root);
        while(q.size()>0){
            List<Integer> levelList = new LinkedList<Integer>();
            int numLevel = q.size();
            for(int i=0;i<numLevel;i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                levelList.add(q.poll().val);
            }
            res.add(levelList);
        }
        return res;
    }
}

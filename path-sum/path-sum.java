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
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            return sum - root.val == 0;
        }
        
        return (root.left != null ? hasPathSum(root.left, sum-root.val) : false) | (root.right != null ? hasPathSum(root.right, sum-root.val) : false);
    }
}
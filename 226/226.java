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
    public TreeNode invertTree(TreeNode root) {
        TreeNode ans = root;
        invert(root);
        return ans;
    }
    public void invert(TreeNode root){
        if (root==null){
            return;
        }
        TreeNode n = new TreeNode();
        n = root.right;
        root.right = root.left;
        root.left = n;
        invert(root.left);
        invert(root.right);
    }
}
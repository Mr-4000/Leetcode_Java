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
    public int maxDepth(TreeNode root) {
        return CheckHeight(root,0);
    }
    public int CheckHeight(TreeNode root, int h) {
        if (root==null){
            return h;
        }
        return Math.max(CheckHeight(root.left,h+1),CheckHeight(root.right,h+1));
    }
}
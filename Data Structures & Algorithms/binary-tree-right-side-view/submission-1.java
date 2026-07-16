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
    public List<Integer> ans = new ArrayList<>();
    public void dfs(TreeNode node, int depth){
        if(node == null) return;

        if(ans.size() == depth){
            ans.add(node.val);
        }

        dfs(node.right, 1 + depth);
        dfs(node.left, 1 + depth);
    }
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return ans;
    }
}

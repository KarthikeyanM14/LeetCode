class Solution {
    public int solve(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return Math.max((1+solve(root.left)),(1+solve(root.right)));
    }
    public int maxDepth(TreeNode root) {
        return solve(root);
    }
}
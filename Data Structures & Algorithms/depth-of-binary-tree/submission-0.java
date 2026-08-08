class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int LeftHeight = maxDepth(root.left);
        int RightHeight = maxDepth(root.right);
        return 1 + Math.max(LeftHeight , RightHeight);
    }
}

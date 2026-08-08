class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }
    private int checkHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int LeftHeight = checkHeight(root.left);
        if(LeftHeight == -1){
            return -1;
        }
        int RightHeight = checkHeight(root.right); 
        if(RightHeight == -1){
            return -1;
        }
        if(Math.abs(LeftHeight - RightHeight) > 1){
            return -1;
        }
        return 1 + Math.max(LeftHeight , RightHeight);
    } 
}

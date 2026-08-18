class Solution {
    int result = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return result;
    }
    private int maxGain(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftGain = Math.max(maxGain(node.left),0);
        int rightGain = Math.max(maxGain(node.right),0);

        int currentpath = leftGain + rightGain + node.val;
        result = Math.max(result, currentpath);

        return node.val + Math.max(leftGain , rightGain);
    }
}

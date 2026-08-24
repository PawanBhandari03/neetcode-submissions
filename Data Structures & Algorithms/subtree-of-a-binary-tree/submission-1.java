class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return check(root, subRoot);
    }

    public boolean check(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null)
            return true;

        if (root == null)
            return false;

        if (same(root, subRoot))
            return true;

        return check(root.left, subRoot) || check(root.right, subRoot);
    }

    public boolean same(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        if (p.val != q.val)
            return false;

        return same(p.left, q.left) && same(p.right, q.right);
    }
}
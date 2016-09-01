package solutions;

import leetcode.datastructures.TreeNode;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return compare(p, q);
    }

    private boolean compare(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (q == null || p == null || p.val != q.val) {
            return false;
        }
        return compare(p.left, q.left) && compare(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode first = new TreeNode(new TreeNode(null, null, 5), new TreeNode(null, null, 15), 10);
        TreeNode second = new TreeNode(new TreeNode(null, new TreeNode(null, null, 15), 5), null, 10);
        System.out.println(new SameTree().isSameTree(first, second));
    }
}

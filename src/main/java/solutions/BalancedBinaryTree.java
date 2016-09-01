package solutions;

import leetcode.datastructures.TreeNode;

public class BalancedBinaryTree {

    private boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        countDepth(root);
        return isBalanced;
    }

    private int countDepth(TreeNode node) {
        if (node == null) return 0;
        int leftDepth = countDepth(node.left);
        int rightDepth = countDepth(node.right);
        if (Math.abs(leftDepth - rightDepth) > 1) {
            isBalanced = false;
        }
        return Math.max(leftDepth, rightDepth) + 1;
    }
}

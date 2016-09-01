package solutions;

import leetcode.datastructures.TreeNode;

public class MinimumDepthOfBinaryTree {
     private static final int INFINITY = -1;
     private int minLength = INFINITY;

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        findMinDepth(root, 1);
        return minLength;
    }

    private void findMinDepth(TreeNode node, int currentDepth) {
        if (node.left == null && node.right == null) {
            if (minLength == INFINITY) {
                minLength = currentDepth;
            } else {
                minLength = Math.min(minLength, currentDepth);
            }
            return;
        }

        if (node.left != null) {
            findMinDepth(node.left, currentDepth + 1);
        }

        if (node.right != null) {
            findMinDepth(node.right, currentDepth + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new MinimumDepthOfBinaryTree().minDepth(new TreeNode(new TreeNode(null, null, 2), null, 1)));
    }
}

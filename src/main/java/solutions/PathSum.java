package solutions;

import leetcode.datastructures.TreeNode;

public class PathSum {
    private int sumToFind = 0;
    private boolean found = false;

    public boolean hasPathSum(TreeNode root, int sum) {
        sumToFind = sum;
        parentSum(root, 0);
        return found;
    }

    public void parentSum(TreeNode node, int previousSum) {
        if (node == null) return;
        int currentSum = previousSum + node.val;
        if (node.left == null && node.right == null && currentSum == sumToFind) {
            found = true;
            return;
        }
        parentSum(node.left, currentSum);
        parentSum(node.right, currentSum);
    }

    public static void main(String args[]) {
        System.out.println(new PathSum().hasPathSum(new TreeNode(null, null, 1), 1));
    }
}

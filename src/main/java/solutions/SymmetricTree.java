package solutions;

import leetcode.datastructures.TreeNode;

public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return checkSubTrees(root.left, root.right);
    }

    private static boolean checkSubTrees(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return (left.val == right.val) &&
                checkSubTrees(left.left, right.right) &&
                checkSubTrees(left.right, right.left);
    }

    public static void main(String[] args){
        TreeNode node = new TreeNode(
                new TreeNode(
                        new TreeNode(null, null, 3),
                        new TreeNode(null, null, 4), 2),
                new TreeNode(
                        new TreeNode(null, null, 4),
                        new TreeNode(null, null, 3), 2),
                1);
        TreeNode node2 = new TreeNode(null, null, 1);
        System.out.println(isSymmetric(node));
        System.out.println(isSymmetric(node2));
    }
}

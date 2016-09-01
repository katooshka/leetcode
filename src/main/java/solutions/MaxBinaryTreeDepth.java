package solutions;

import leetcode.datastructures.TreeNode;

import static java.lang.Math.max;
import static leetcode.datastructures.TreeNode.leaf;
import static leetcode.datastructures.TreeNode.node;

public class MaxBinaryTreeDepth {
    private int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        visit(root, 1);
        return maxDepth;
    }

    private void visit(TreeNode node, int nodeDepth) {
        maxDepth = max(maxDepth, nodeDepth);
        if (node.left != null) {
            visit(node.left, nodeDepth + 1);
        }
        if (node.right != null) {
            visit(node.right, nodeDepth + 1);
        }
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) return 0;
        return max(maxDepth2(root.left), maxDepth2(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode tree =
                node(
                        node(
                                leaf(),
                                leaf()),
                        node(
                                node(
                                        node(
                                                leaf(),
                                                leaf()
                                        ),

                                        leaf()
                                ),
                                leaf()
                        ));
        System.out.println(new MaxBinaryTreeDepth().maxDepth2(tree));
    }
}


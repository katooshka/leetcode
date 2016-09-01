package solutions;

import leetcode.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static leetcode.datastructures.TreeNode.node;

public class BinaryTreeLevelOrderTraversal {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return result;

        List<TreeNode> rootLevelNode = Collections.singletonList(root);
        List<Integer> rootLevelValue = Collections.singletonList(root.val);

        result.add(rootLevelValue);
        addValues(rootLevelNode);

        return result;
    }

    private void addValues(List<TreeNode> previousLevelNodes) {
        if (previousLevelNodes.isEmpty()) return;
        List<TreeNode> nextLevelNodes = new ArrayList<TreeNode>();
        List<Integer> nextLevelValues = new ArrayList<Integer>();
        for (TreeNode previousLevelNode : previousLevelNodes) {
            if (previousLevelNode.left != null) {
                nextLevelNodes.add(previousLevelNode.left);
                nextLevelValues.add(previousLevelNode.left.val);
            }
            if (previousLevelNode.right != null) {
                nextLevelNodes.add(previousLevelNode.right);
                nextLevelValues.add(previousLevelNode.right.val);
            }
        }
        if (nextLevelNodes.isEmpty()) return;
        result.add(nextLevelValues);
        addValues(nextLevelNodes);
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        levelOrderDfs(root, 0);
        return result;
    }

    public void levelOrderDfs(TreeNode node, int depth) {
        if (node == null) return;
        if (result.size() == depth) {
            result.add(new ArrayList<Integer>());
        }
        result.get(depth).add(node.val);
        levelOrderDfs(node.left, depth + 1);
        levelOrderDfs(node.right, depth + 1);
    }

    public static void main(String[] args) {
        TreeNode treeNode =
                new TreeNode(
                        new TreeNode(
                                new TreeNode(null, null),
                                new TreeNode(null, null),
                                9),
                        new TreeNode(
                                new TreeNode(
                                        new TreeNode(null, null),
                                        new TreeNode(null, null),
                                        15),
                                new TreeNode(
                                        new TreeNode(null, null),
                                        new TreeNode(null, null),
                                        7),
                                20
                        ),
                        3
        );

        System.out.println(new BinaryTreeLevelOrderTraversal().levelOrder(treeNode));
    }
}

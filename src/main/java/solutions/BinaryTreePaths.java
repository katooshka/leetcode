package solutions;

import leetcode.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    private List<String> paths = new ArrayList<>();
    private List<String> currentPath = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return null;
        addElementsToPath(root);
        return paths;
    }

    private void addElementsToPath(TreeNode node) {
        currentPath.add(String.valueOf(node.val));

        if (node.left == null && node.right == null) {
            paths.add(format(currentPath));
        }
        if (node.left != null) {
            addElementsToPath(node.left);
        }
        if (node.right != null) {
            addElementsToPath(node.right);
        }

        currentPath.remove(currentPath.size() - 1);
    }

    private static String format(List<String> path) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < path.size() - 1; i++) {
            sb.append(path.get(i)).append("->");
        }
        sb.append(path.get(path.size() - 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new BinaryTreePaths().binaryTreePaths(
                new TreeNode(
                        new TreeNode(null, null, 2),
                        new TreeNode(null, null, 3), 1)));
    }
}

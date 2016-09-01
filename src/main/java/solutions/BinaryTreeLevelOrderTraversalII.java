package solutions;

import leetcode.datastructures.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> traversal = new ArrayList<>();

        addNode(traversal, root, 0);
        Collections.reverse(traversal);
        return traversal;
    }

    private void addNode(List<List<Integer>> traversal, TreeNode node, int depth) {
        if (node == null) return;

        if (traversal.size() == depth) {
            traversal.add(new ArrayList<>());
        }
        traversal.get(depth).add(node.val);
        
        addNode(traversal, node.left, depth + 1);
        addNode(traversal, node.right, depth + 1);
    }
}

package solutions;

import leetcode.datastructures.TreeNode;

import static leetcode.datastructures.TreeNode.leaf;
import static leetcode.datastructures.TreeNode.node;

public class LowestCommonAncestorOfBST {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        TreeNode f = leaf(4);
        TreeNode d = node(null, f, 3);
        TreeNode e = leaf(6);
        TreeNode b = node(d, e, 5);
        TreeNode c = leaf(8);
        TreeNode a = node(b, c, 10);

        System.out.println(new LowestCommonAncestorOfBST().lowestCommonAncestor(a, f, e));
    }
}


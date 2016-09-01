package leetcode.datastructures;

public class TreeNode {
    public static TreeNode node(TreeNode left, TreeNode right) {
        return new TreeNode(left, right);
    }

    public static TreeNode node(TreeNode left, TreeNode right, int val) {
        return new TreeNode(left, right, val);
    }

    public static TreeNode leaf() {
        return new TreeNode(null, null);
    }

    public static TreeNode leaf(int val) {
        return new TreeNode(null, null, val);
    }

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
    }
    public TreeNode(TreeNode left, TreeNode right, int val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }
    public TreeNode(int x) { val = x; }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

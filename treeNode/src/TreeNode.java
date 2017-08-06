/**
 * Created by alexei.yakushyn on 03.08.17.
 */


public class TreeNode {

    public TreeNode root;
    public TreeNode left;
    public TreeNode right;
    int value;
    private TreeNode parent;

    public TreeNode(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }

    public void setValue(int data) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getParent() {
        return this.parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
}


import java.lang.reflect.Type;

/**
 * Created by alexei.yakushyn on 03.08.17.
 */


public class TreeNode implements Comparable {

    public TreeNode left;
    public TreeNode right;
    int value;
    private TreeNode parent;
    private TreeNode root;

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

    public void add(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                add(node.left, value);
            } else {
                System.out.println("  Inserted " + value + " to left of "
                        + node.value);
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                add(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                        + node.value);
                node.right = new Node(value);
            }
        }
    }

    public int size(Node node) {
        if (node == null) return(0);
        else {
            return(size(node.left) + 1 + size(node.right));
        }
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}


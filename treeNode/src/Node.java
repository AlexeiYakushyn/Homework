import java.lang.reflect.Type;

/**
 * Created by alexei.yakushyn on 07.08.2017.
 */
public  class Node implements Comparable<Node> {

    int key;

    String name;

    Node leftChild;

    Node rightChild;

    Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public Node(int key) {
        this.key = key;
    }

    public Node() {

    }

    public String toString() {
        return name + " has the key " + key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public int compareTo(Node o) {
        return 0;
    }


}

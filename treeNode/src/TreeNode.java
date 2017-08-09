import java.lang.reflect.Type;

/**
 * Created by alexei.yakushyn on 03.08.17.
 */


public class TreeNode implements Comparable<Node> {

    Node root;

    Node newNode = new Node();
    /**
     * Method @addNode() that filling our tree with some Nodes.
     */

    public void addNode(int key, String name) {

        /** creating a new Node and initialize it */

        Node newNode = new Node(key, name);

        /** checking if there is root. If not this become root. */

        if (root == null) {

            root = newNode;

        } else {

            // Set root as the Node we will start with as we traverse the tree.

            Node concreteNode = root;

            // Future parent for our new Node

            Node parent;

            while (true) {

                // root is the top parent so we start there.

                parent = concreteNode;

                // Check if the new node should go on
                // the left side of the parent node

                if (key < concreteNode.key) {

                    concreteNode = concreteNode.leftChild;

                    if (concreteNode == null) {

                        parent.leftChild = newNode;
                        return;
                    }
                } else {

                    concreteNode = concreteNode.rightChild;

                    if (concreteNode == null) {

                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }




    @Override
    public int compareTo(Node o) {
        return 0;
    }


}


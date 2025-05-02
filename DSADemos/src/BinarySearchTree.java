public class BinarySearchTree {
    public static class Node {
        int data;
        Node childLeft;
        Node childRight;

        public Node(int data) {
            this.data = data;
            childLeft = null;
            childRight = null;
        }
    }

    public static class Tree {
        Node root = null;


        public Node addRecursive(Node currentNode, int data) {
            if (currentNode == null) {
                return new Node(data);
            }
            if (data < currentNode.data) {
                currentNode.childLeft = addRecursive(currentNode.childLeft, data);
            } else if (data > currentNode.data) {
                currentNode.childRight = addRecursive(currentNode.childRight, data);
            }
            return currentNode;
        }

        public void add(int data) {
            root = addRecursive(root, data);
        }


    }

    public static void main(String[] args) {
        Tree bst = new Tree();

        bst.add(10);
        bst.add(5);
        bst.add(15);
        bst.add(3);
        bst.add(7);

        // Output the tree structure (in-order traversal)
        printInOrder(bst.root);
    }

    // Helper function for in-order traversal
    public static void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.childLeft);
            System.out.print(node.data + " ");
            printInOrder(node.childRight);
        }
    }
}

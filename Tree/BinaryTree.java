package Tree;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    Node root;

    public void insert(int data) {
        root = insertNode(root, data);
    }

    private Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    public void printInOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    public void printPreOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void printPostOrder() {
        postOrderRec(root);
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void treeDisplay() {
        DisplayTree(root);
    }

    private void DisplayTree(Node node) {
        if (node == null) {
            return;
        }
        // self work - In Order Manner
        String levelPath = "";
        levelPath += node.left == null ? "." : node.left.data;
        levelPath += " -> " + node.data + " <- ";
        levelPath += node.right == null ? "." : node.right.data;
        System.out.println(levelPath);
//        leap of faith.
        DisplayTree(node.left);
        DisplayTree(node.right);
    }

    public int treeSum() {
        return TreeSum(root);
    }

    private int TreeSum(Node node) {
        if (node == null) {
            return 0;
        }
        int leftSum = TreeSum(node.left);
        int rightSum = TreeSum(node.right);
        return leftSum + rightSum + node.data;
    }

    public int treeSize() {
        return TreeSize(root);
    }

    private int TreeSize(Node node) {
        if (node == null) {
            return 0;
        }
        int leftSize = TreeSize(node.left);
        int rightSize = TreeSize(node.right);
        return leftSize + rightSize + 1;
    }
}

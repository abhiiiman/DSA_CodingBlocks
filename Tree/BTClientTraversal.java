package Tree;

public class BTClientTraversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        System.out.println("In Order :");
        tree.printInOrder();
        System.out.println("\nPre Order :");
        tree.printPreOrder();
        System.out.println("\nPost Order :");
        tree.printPostOrder();
    }
}

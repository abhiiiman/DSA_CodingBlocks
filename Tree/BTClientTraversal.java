package Tree;

public class BTClientTraversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] treeArray = {8, 7, 12, 15, 2, 5};
//        inserting the nodes in the tree.
        for (int node : treeArray){
            tree.insert(node);
        }
        System.out.println("In Order :");
        tree.printInOrder();
        System.out.println("\nPre Order :");
        tree.printPreOrder();
        System.out.println("\nPost Order :");
        tree.printPostOrder();
        System.out.println();

//        In Order Manner.
        tree.treeDisplay();
    }
}

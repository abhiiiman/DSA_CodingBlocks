package Tree;

public class BTClientSize {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] treeArray = {8, 7, 12, 15, 2, 5};
//        inserting the nodes in the tree.
        for (int node : treeArray) {
            tree.insert(node);
        }
//        getting the size of the tree i.e. total node count
        int ansSize = tree.treeSize();
        System.out.println(ansSize);
    }
}

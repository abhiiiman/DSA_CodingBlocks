package Tree;

public class BTClientHeight {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] treeArray = {50, 25, 75, 17, 37, 62, 77, 60, 70};
//        inserting the nodes in the tree.
        for (int node : treeArray) {
            tree.insert(node);
        }
//        inorder display the tree here.
        tree.treeDisplay();
//        getting the height here i.e. max edges (from root to deepest leaf node).
        int ansHeight = tree.treeHeight();
        System.out.println(ansHeight);
    }
}

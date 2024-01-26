package Tree;

public class BTClientMax {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] treeArray = {8, 7, 12, 15, 2, 5};
//        inserting the nodes in the tree.
        for (int node : treeArray) {
            tree.insert(node);
        }
        // getting the max node here
        int ansMax = tree.treeMax();
        System.out.println("Max of Tree : " + ansMax);
    }
}

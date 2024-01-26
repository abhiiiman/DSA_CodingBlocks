package Tree;

public class BTClientSum {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] treeArray = {8, 7, 12, 15, 2, 5};
//        inserting the nodes in the tree.
        for (int node : treeArray) {
            tree.insert(node);
        }
        // getting the sum of the tree here.
        int ans = tree.treeSum();
        System.out.println("Tree Sum -> "+ ans);
    }
}

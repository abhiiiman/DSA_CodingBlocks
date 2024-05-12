package UpGrad_CP;

class SortedLinkedList {

    // static inner class
    static class Node {
        int data;

        // connect each node to next node
        Node next;
        Node bottom;

        Node(int d) {
            data = d;
            next = null;
            bottom = null;
        }
    }

    Node mergeTwoLists(Node a, Node b) {

        Node temp = new Node(0);
        Node res = temp;

        while (a != null && b != null) {
            if (a.data < b.data) {
                temp.bottom = a;
                temp = temp.bottom;
                a = a.bottom;
            } else {
                temp.bottom = b;
                temp = temp.bottom;
                b = b.bottom;
            }
        }

        if (a != null) temp.bottom = a;
        else temp.bottom = b;
        return res.bottom;

    }

    Node flatten(Node root) {

        if (root == null || root.next == null)
            return root;

        // recur for list on right
        root.next = flatten(root.next);

        // now merge
        root = mergeTwoLists(root, root.next);

        // return the root
        // it will be in turn merged with its left
        return root;
    }

    public static void main(String[] args) {

        // create an object of LinkedList
        SortedLinkedList linkedList = new SortedLinkedList();

        // Example usage
        Node node1 = new Node(5);
        node1.bottom = new Node(7);
        node1.bottom.bottom = new Node(8);

        Node node2 = new Node(10);
        node2.bottom = new Node(20);

        Node node3 = new Node(19);
        node3.bottom = new Node(22);
        node3.bottom.bottom = new Node(50);

        // Assigning the bottom nodes
        node1.next = node2;
        node2.next = node3;

        System.out.println("Original Sorted Linked Lists:");
        printList(node1); // Printing the original list

        // Flatten the sorted linked lists
        Node flattenedList = linkedList.flatten(node1);

        System.out.println("\nFlattened Sorted Linked Lists:");
        printList(flattenedList); // Printing the flattened list
    }

    // Method to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.bottom;
        }
        System.out.println("null");
    }
}
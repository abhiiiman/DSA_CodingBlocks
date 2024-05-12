package UpGrad_CP;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class FlattenSortedLinkedLists {
    private Node flatten(Node[] lists) {
        if (lists == null || lists.length == 0) return null;
        return merge(lists, 0, lists.length - 1);
    }

    private Node merge(Node[] lists, int left, int right) {
        if (left == right) {
            return lists[left]; // Only one list, return it
        }
        if (left < right) {
            int mid = left + (right - left) / 2;
            Node leftList = merge(lists, left, mid);
            Node rightList = merge(lists, mid + 1, right);
            return mergeTwoLists(leftList, rightList);
        }
        return null;
    }

    private Node mergeTwoLists(Node list1, Node list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        FlattenSortedLinkedLists solution = new FlattenSortedLinkedLists();

        // Example usage
        Node[] lists = new Node[3];
        lists[0] = new Node(1);
        lists[0].next = new Node(4);
        lists[0].next.next = new Node(5);

        lists[1] = new Node(1);
        lists[1].next = new Node(3);
        lists[1].next.next = new Node(4);

        lists[2] = new Node(2);
        lists[2].next = new Node(6);

        Node flattenedList = solution.flatten(lists);
        printList(flattenedList);
    }

    // Method to print the linked list
    private static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}


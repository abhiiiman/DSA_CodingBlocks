package UpGrad_CP;

// Define the ListNode class representing a node in the linked list
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

// Define the Solution class containing the mergeTwoLists method
public class MergeTwoSortedLists {
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Creating the dummy node to store the result here.
        ListNode returnNode = new ListNode(Integer.MIN_VALUE);
        // Creating headNode to keep track of the head for the return node here.
        ListNode headNode = returnNode;
        // Traversing the lists until one of them reaches null.
        while (list1 != null && list2 != null) {
            // Check for the smaller or equal element to store it in the front and sort.
            if (list1.val <= list2.val) {
                returnNode.next = list1;
                list1 = list1.next;
            } else {
                returnNode.next = list2;
                list2 = list2.next;
            }
            // Move returnNode to the next node.
            returnNode = returnNode.next;
        }
        // Adding the remaining list here.
        if (list1 == null) {
            returnNode.next = list2;
        } else {
            returnNode.next = list1;
        }
        // Return the head of the returnNode finally.
        return headNode.next;
    }

    // Define the Main class containing the main method for testing
    public static void main(String[] args) {
        // Define your test cases here and call the mergeTwoLists method
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4))); // 1 -> 2 -> 4.
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(5))); // 1 -> 3 -> 5.

        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Print the merged list
        printList(mergedList);
    }

    // Method to print the linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

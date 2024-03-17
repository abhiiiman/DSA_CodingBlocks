package UpGrad_CP;

public class SinglyLinkedList {

    public static class ListNode {
        private final int data; // generic type.
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode head;

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("Null\n");
    }

    // detect the cycle
    public void detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                System.out.println("Cycle Detected!");
                removeCycle(slow);
                System.out.println("Cycle Removed!");
            }
        }
        System.out.println("No Cycle Detected!");
    }

    // remove the cycle
    public void removeCycle(ListNode meet) {
        ListNode temp = head;
        while (meet.next != temp.next) {
            temp = temp.next;
            meet = meet.next;
        }
        meet.next = null;
    }

    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10); // head data.
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // now we have to connect them together.

        sll.head.next = second; // 10-->1-->N
        second.next = third; // 10-->1-->8-->N
        third.next = fourth; // 10-->1-->8-->11-->N
        fourth.next = second; // 10 --> 1 --> 8 --> 11 --> 1 // infinite loop
        // after detecting & removing the cycle
        sll.detectCycle(sll.head);
        // updated LL
        System.out.println("Updated LL without cycle :");
        sll.display();
    }

}
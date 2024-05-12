package UpGrad_CP;

public class LinkedList {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;

    public void addFirst(int val) {
        if (isEmpty()) {
            head = new Node(val);
            tail = head;
            return;
        }
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int val) {
        if (isEmpty()) {
            head = new Node(val);
            tail = head;
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(int pos, int val) {
        if (pos == 1) {
            addFirst(val);
            return;
        }
        Node current = head;
        int count = 1;
        while (count < pos - 1) {
            count++;
            current = current.next;
        }
        Node newNode = new Node(val);
        newNode.next = current.next;
        current.next = newNode;
    }

    public int deleteFirst() {
        if (isEmpty()) {
            throw new RuntimeException("List is Empty!");
        }
        Node current = head;
        head = head.next;
        current.next = null;
        if (isEmpty()) {
            tail = null;
        }
        return current.val;
    }

    public int deleteLast() {
        if (isEmpty()) {
            throw new RuntimeException("List is Empty!");
        }
        if (head == tail) {
            int val = head.val;
            head = null;
            tail = null;
            return val;
        }
        Node current = head;
        Node prev = null;
        while (current != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
        tail = prev;
        return current.val;
    }

    public int delete(int pos) {
        if (isEmpty()) {
            throw new RuntimeException("List is Empty!");
        }
        if (pos == 1) {
            deleteFirst();
        }
        Node current = head;
        Node prev = null;
        int count = 1;
        while (count < pos) {
            count++;
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
        current.next = null;
        return current.val;
    }

    public boolean search(int val) {
        Node current = head;
        while (current != null) {
            if (current.val == val) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println();
    }

    //    Driver Code.
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(20);
        System.out.println("After adding 20 at the first : ");
        ll.printList();

        ll.addFirst(10);
        System.out.println("After adding 10 at the first : ");
        ll.printList();

        ll.addLast(30);
        System.out.println("After adding 30 at the last : ");
        ll.printList();

        int pop1 = ll.deleteFirst();
        System.out.println(pop1);
        System.out.println("After deletion from the first : ");
        ll.printList();

        int pop2 = ll.deleteLast();
        System.out.println(pop2);
        System.out.println("After deletion from the last : ");
        ll.printList();

        int pop3 = ll.delete(3);
        System.out.println(pop3);
        System.out.println("After deleting from position 3 : ");
        ll.printList();

        boolean answer = ll.search(10);
        System.out.println(answer);
    }
}

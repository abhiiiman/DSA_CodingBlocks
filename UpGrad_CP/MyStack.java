package UpGrad_CP;

import java.util.LinkedList;
import java.util.Queue;

// Implementation of Stack using Single Queue.
public class MyStack {
    private final Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        // add element inside the queue in Stack format.
        for (int i = 1; i < queue.size(); i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        if (!queue.isEmpty()) return queue.peek();
        return -1;
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public void printQueue() {
        System.out.println("Queue: " + queue);
    }

    public static void main(String[] args) {
        MyStack queueStack = new MyStack();
        queueStack.push(1);
        queueStack.push(2);
        queueStack.push(3);
        queueStack.push(4);
        queueStack.push(5);
        int popped = queueStack.pop();
        int top = queueStack.top();
        boolean isEmpty = queueStack.empty();
        queueStack.printQueue();
        System.out.println("Popped Element : " + popped);
        System.out.println("Top Element : " + top);
        System.out.println("IsEmpty Check : " + isEmpty);
    }
}
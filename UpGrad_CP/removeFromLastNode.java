package UpGrad_CP;

import java.util.LinkedList;

public class removeFromLastNode {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addLast(5);
        System.out.println(list.size());
        list.remove(list.size() - 2);
        System.out.println(list);
    }
}
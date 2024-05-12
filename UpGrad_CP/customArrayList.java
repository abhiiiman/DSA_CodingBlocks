package UpGrad_CP;

class ArrayList {
    Object[] array;
    int size;
    int capacity;

    ArrayList() {
        capacity = 10;
        size = 0;
        array = new Object[capacity];
    }

    //    method to add item to arraylist.
    void add(Object item) {
        array[size++] = item;
    }

    //    method to get the item from a specific index.
    Object get(int index) {
        return array[index];
    }

    //    method to get the size of the arraylist.
    int size() {
        return size;
    }
}

public class customArrayList {
    public static void main(String[] args) {
//        creating an object for ArrayList here.
        ArrayList list = new ArrayList();
//        adding the elements here.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add("Abhijit");
        list.add("9.083");
        list.add(null);
//        printing the elements here.
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

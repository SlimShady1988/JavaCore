package Core;

import java.util.Arrays;

public class LinkedListExercise {

    private Node head;
    private int size;

    public void add (int value) {
        /*IF first initialization*/
        if (head == null) {
            this.head = new Node(value);
            /* SOME CODE */
        } else {
            Node temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            temp.setNext(new Node(value));
        }
        size++;
    }

    public String toString () {
        int[] result = new int[size];
        int index = 0;
        Node temp = head;

        while (temp != null) {
            result[index++] = temp.getValue();
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }


    private static class Node {
        private int value;

        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkedListExercise list = getList();
        System.out.println(list);
    }

    private static LinkedListExercise getList() {
        LinkedListExercise integerList = new LinkedListExercise();
        integerList.add(5);
        integerList.add(2);
        integerList.add(76);
        integerList.add(1);

        return integerList;
    }

}

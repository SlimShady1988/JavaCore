package Collections;

import java.util.*;

public class QueueInterface {
    public static Queue<User> getCollection(String collectionType) {
        Queue<User> collection;
        if (collectionType.equals("priorityQueue")) {
            collection = new PriorityQueue<>();
        } else {
            collection = new ArrayDeque<>();
        }
        collection.add(new User("Petro", "Petrov", 31));
        collection.add(new User("Petro", "Petrov", 31));
        collection.add(new User("Ivan", "Ivanov", 22));
        collection.add(new User("Semen", "Semenov", 44));

        return collection;
    }

    public static void main(String[] args) {
        System.out.println("/////////////////////////////////////    PriorityQueue    ////////////////////////////////");
        priorityQueueEx((PriorityQueue<User>)getCollection("priorityQueue"));
        System.out.println();
        System.out.println("/////////////////////////////////////    ArrayDeque    ///////////////////////////////////");
        ArrayDequeEx((ArrayDeque<User>)getCollection(""));
        System.out.println();

    }

    private static void priorityQueueEx(PriorityQueue<User> queueCollection) {
        System.out.println("##########################     Перебір PriorityQueue колекції   ##########################");
        for (User user : queueCollection) {
            System.out.println(user.getName());
        }
//            queueCollection.add(null);
        System.out.println();
    }

    private static void ArrayDequeEx(ArrayDeque<User> arrayDeque) {
        System.out.println("##########################      Перебір ArrayDeque колекції     ##########################");
        for (User user : arrayDeque) {
            var name = user.getName();
            System.out.println(name);
        }

        System.out.println();
        System.out.println("#######################  додаткові методи для інтерфейсу Deque  ##########################");
        if (!arrayDeque.isEmpty()) {
            System.out.println("first element - " + arrayDeque.getFirst().getName());
            System.out.println("select last - " + arrayDeque.peekLast().getName());
            System.out.println("delete last- " + arrayDeque.pollLast().getName());
        }

        //            arrayDeque.add(null);
        System.out.println("##########################################################################################");
        Object[] array = arrayDeque.toArray();
        for (Object user : array) {
            User user2 = (User) user;
            System.out.println(user2.getName());
        }
    }
}

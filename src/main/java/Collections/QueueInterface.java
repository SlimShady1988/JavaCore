package Collections;

import java.util.*;

public class QueueInterface {
    public static final Queue<User> arrayDequeCollection = new ArrayDeque<>();
    public static final Queue<User> priorityQueueCollection = new PriorityQueue<>();
    public static final Queue<User> queueCollection = new ArrayDeque<>();
    public static final User petro = new User("Petro", "Petrov", 31);
    public static final User ivan = new User("Ivan", "Ivanov", 22);
    public static final User semen = new User("Semen", "Semenov", 44);
    public static final User jora = new User("Jora", "Joranik", 45);
    public static final Role guest = new Role("guest", "new", 1);
    public static final Role admin = new Role("admin", "old", 9213);
    public static final Role support = new Role("support", "casual", 32);
    public static final Role jorarol = new Role("main", "main", 2);

    public static Queue<User> getListCollection(Queue<User> queue) {
        assert false;
        queue.add(petro);
        queue.add(petro);
        queue.add(ivan);
        queue.add(semen);

        return queue;
    }

    public static void main(String[] args) {
        System.out.println("//////////////////////////////////////////////////////////     ArrayDeque    //////////////////////////////////////////////////////////////");
        queueEx(arrayDequeCollection);
        System.out.println("//////////////////////////////////////////////////////////     ArrayDeque    //////////////////////////////////////////////////////////////");
        System.out.println("===============================================================================");

        System.out.println("//////////////////////////////////////////////////////////     PriorityQueue    ///////////////////////////////////////////////////////");
        queueEx(priorityQueueCollection);
        System.out.println("//////////////////////////////////////////////////////////     PriorityQueue   ////////////////////////////////////////////////////////");
        System.out.println("===============================================================================");

    }

    private static void queueEx(Queue<User> queue) {
        Queue<User> collection = getListCollection(queue);
        if (collection.getClass() == ArrayDeque.class) {
            System.out.println("##########################                   Перебір ArrayDeque колекції                           ##########################");
            for (User user : collection) {
                System.out.println(user.getName());
            }
//
//            collection.add(null);
            System.out.println("##################################################");
            Object[] array = collection.toArray();
            for (Object user : array) {
                User user2 = (User) user;
                System.out.println(user2);
            }
        }

        if (collection.getClass() == PriorityQueue.class) {
            System.out.println("##########################                   Перебір PriorityQueue колекції                           ##########################");
            for (User user : collection) {
                System.out.println(user.getName());
            }
//
//            collection.add(null);
            System.out.println("##################################################");
            Object[] array = collection.toArray();
            for (Object user : array) {
                User user2 = (User) user;
                System.out.println(user2);
            }
        }
    }
}

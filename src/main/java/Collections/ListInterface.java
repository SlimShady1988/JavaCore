package Collections;

import java.util.*;

public class ListInterface {
    public static final List<User> arrayList = new ArrayList<User>();
    public static final List<User> linkedList = new LinkedList<User>();
    public static final User petro = new User("Petro", "Petrov", 31);
    public static final User ivan = new User("Ivan", "Ivanov", 22);
    public static final User semen = new User("Semen", "Semenov", 44);
    public static final User jora = new User("Jora", "Joranik", 45);
    public static final Role guest = new Role("guest", "new", 1);
    public static final Role admin = new Role("admin", "old", 9213);
    public static final Role support = new Role("support", "casual", 32);
    public static final Role jorarol = new Role("main", "main", 2);

    public static List<User> getListCollection(List<User> list) {
        assert false;
        list.add(petro);
        list.add(petro);
        list.add(ivan);
        list.add(semen);

        return list;
    }

    public static void main(String[] args) {
        System.out.println("//////////////////////////////////////////////////////////     ArrayList    //////////////////////////////////////////////////////////////");
        listEx(arrayList);
        System.out.println("//////////////////////////////////////////////////////////     ArrayList    //////////////////////////////////////////////////////////////");
        System.out.println("===============================================================================");

        System.out.println("//////////////////////////////////////////////////////////     LinkedList    ///////////////////////////////////////////////////////");
        listEx(linkedList);
        System.out.println("//////////////////////////////////////////////////////////     LinkedList   ////////////////////////////////////////////////////////");
        System.out.println("===============================================================================");

    }

    private static void listEx(List<User> list) {
        List<User> listCollection = getListCollection(list);
        if (listCollection.getClass() == ArrayList.class) {
            System.out.println("##########################                   Перебір ArrayList колекції                           ##########################");
            for (User user : listCollection) {
                System.out.println(user.getName());
            }

            listCollection.add(2, null);
            System.out.println("##################################################");
            Object[] array = listCollection.toArray();
            for (Object user : array) {
                User user2 = (User) user;
                System.out.println(user2);
            }
        }
        if (listCollection.getClass() == LinkedList.class) {
            System.out.println("##########################                   Перебір LinkedList колекції                           ##########################");
            for (User user : listCollection) {
                System.out.println(user.getName());
            }

            listCollection.add(2, jora);
            ListIterator<User> userListIterator = listCollection.listIterator();
            while (userListIterator.hasNext()) {
                if (Objects.equals(userListIterator.next().getName(), "Ivan")) {
                    userListIterator.remove();
                    break;
                }
            }
            System.out.println("##################################################");

            Object[] array = listCollection.toArray();
            for (Object user : array) {
                User user2 = (User) user;
                System.out.println(user2.getName());
            }
        }


    }
}

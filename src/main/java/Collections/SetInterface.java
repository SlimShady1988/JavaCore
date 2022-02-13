package Collections;

import java.util.*;

public class SetInterface {
    public static final Set<User> hashSetPeople = new HashSet<>();
    public static final Set<User> linkedHashSetPeople = new LinkedHashSet<>();
    public static final Set<User> TreeSetPeople = new TreeSet<>();
    public static final User petro = new User("Petro", "Petrov", 31);
    public static final User ivan = new User("Ivan", "Ivanov", 22);
    public static final User semen = new User("Semen", "Semenov", 44);
    public static final User jora = new User("Jora", "Joranik", 45);

    public static Set<User> getSetCollection(Set<User> set){
        assert false;
//        if (Objects.equals(set, TreeSet.class)) {
//            Collections.synchronizedSet(set);
//        }
        set.add(petro);
        set.add(ivan);
        set.add(semen);

        return set;
    }


    public static void main(String[] args) {
        System.out.println("//////////////////////////////////////////////////////////     HashSet    //////////////////////////////////////////////////////////////");
        setEx(hashSetPeople);
        System.out.println("//////////////////////////////////////////////////////////     HashSet    //////////////////////////////////////////////////////////////");
        System.out.println("===============================================================================");

        System.out.println("//////////////////////////////////////////////////////////     LinkedHashSet    ///////////////////////////////////////////////////////");
        setEx(linkedHashSetPeople);
        System.out.println("//////////////////////////////////////////////////////////     LinkedHashSet   ////////////////////////////////////////////////////////");
        System.out.println("===============================================================================");

        System.out.println("//////////////////////////////////////////////////////////     TreeSet    ////////////////////////////////////////////////////////");
        setEx(TreeSetPeople);
        System.out.println("//////////////////////////////////////////////////////////     TreeSet   /////////////////////////////////////////////////////////");
        System.out.println("===============================================================================");

    }

    public static void setEx(Set<User> set) {
        Set<User> setCollection = getSetCollection(set);

        if (setCollection.getClass() == HashSet.class) {
            System.out.println("##########################                   Перебір HashSet колекції                           ##########################");
            for (User user : setCollection) {
                System.out.println(user.getName());
            }

            setCollection.add(jora);
            Object[] array = setCollection.toArray();
            System.out.println("##########################        ##########################");

            for (Object user : array) {
                User user2 = (User) user;
                System.out.println(user2.getName());
            }
        }

        if (setCollection.getClass() == LinkedHashSet.class) {
            System.out.println("##########################                   Перебір LinkedHashSet колекції                           ##########################");
            for (User user : setCollection) {
                System.out.println(user.getName());
            }

            setCollection.add(jora);
            Object[] array = setCollection.toArray();
            System.out.println("##########################        ##########################");

            for (Object user : array) {
                User o = (User)Optional.ofNullable(user).orElse(null);
//                Object user2 = ((user == User.class) ? (User)user : null);
                        System.out.println(o.getName());
            }
        }
        if (setCollection.getClass() == TreeSet.class) {
            System.out.println("##########################                   Перебір TreeSet колекції                           ##########################");
            System.out.println(setCollection);
            for (User user : setCollection) {
                System.out.println(user.getName());
            }

            setCollection.add(jora);
            Object[] array = setCollection.toArray();
            System.out.println("###################################################");

            for (Object user : array) {
                User o = (User)Optional.ofNullable(user).orElse(null);
                System.out.println(o.getName());
            }
        }



        }
 }


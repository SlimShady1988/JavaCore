package Collections;

import java.util.*;

public class MapInterface {
    public static final Map<User, Role> hashMapPeople = new HashMap<>();
    public static final Map<User, Role> linkedHashMapPeople = new LinkedHashMap<>();
    public static final Map<User, Role> weakHashMapPeople = new WeakHashMap<>();
    public static final Map<User, Role> treeMapPeople = new TreeMap<>();
    public static final User petro = new User("Petro", "Petrov", 31);
    public static final User ivan = new User("Ivan", "Ivanov", 22);
    public static final User semen = new User("Semen", "Semenov", 44);
    public static final User jora = new User("Jora", "Joranik", 45);
    public static final Role guest = new Role("guest", "new", 1);
    public static final Role admin = new Role("admin", "old", 9213);
    public static final Role support = new Role("support", "casual", 32);
    public static final Role jorarol = new Role("main", "main", 2);

    public static Map<User, Role> getMapCollection(Map<User, Role> map) {
        assert false;
        map.put(petro, guest);
        map.put(ivan, admin);
        map.put(semen, support);

        return map;
    }


    public static void main(String[] args) {
//        Map<String, String> workerMap = new HashMap<>();
//        workerMap.put(null, "writer");
//        workerMap.put("tim", "driver");
//        workerMap.put("bob", "skier");
//        workerMap.put("sam", "jumper");
//
//        //Вибрати всі ключі
//        Set<String> keySet = workerMap.keySet();
//        System.out.println(keySet);
//
//        for ( String name : workerMap.keySet()) {
//            System.out.println(name);
//        }
//
//        //Вибрати значення по  ключу
//        String get = workerMap.get("tim");
//        System.out.println(get);
//
//        //всі значення
//        Collection<String> values = workerMap.values();
//        System.out.println(values);
//
//        //Вибрати ключ=значення
//        Set<Map.Entry<String, String>> entrySet = workerMap.entrySet();
//        System.out.println(entrySet);
//
//        for ( Map.Entry<String, String> worker : workerMap.entrySet()) {
//            System.out.println(worker);
//            System.out.println(worker.getKey());
//            System.out.println(worker.getValue());
//        }
//
//        workerMap.put("bob", "killer");
//        System.out.println(entrySet);
//
//        workerMap.put(null, "killer");
//        System.out.println(entrySet);
        System.out.println("//////////////////////////////////////////////////////////     HashMap    //////////////////////////////////////////////////////////////");
        mapEx(hashMapPeople);
        System.out.println("//////////////////////////////////////////////////////////     HashMap    //////////////////////////////////////////////////////////////");
        System.out.println("===============================================================================");

        System.out.println("//////////////////////////////////////////////////////////     LinkedHashMap    ///////////////////////////////////////////////////////");
        mapEx(linkedHashMapPeople);
        System.out.println("//////////////////////////////////////////////////////////     LinkedHashMap   ////////////////////////////////////////////////////////");
        System.out.println("===============================================================================");

        System.out.println("//////////////////////////////////////////////////////////     WeakHashMap    ////////////////////////////////////////////////////////");
        mapEx(weakHashMapPeople);
        System.out.println("//////////////////////////////////////////////////////////     WeakHashMap   /////////////////////////////////////////////////////////");
        System.out.println("===============================================================================");

        System.out.println("//////////////////////////////////////////////////////////     TreeMap    ////////////////////////////////////////////////////////");
        mapEx(treeMapPeople);
        System.out.println("//////////////////////////////////////////////////////////     TreeMap   /////////////////////////////////////////////////////////");
        System.out.println("===============================================================================");
    }

    public static void mapEx(Map<User, Role> map) {
        Map<User, Role> mapCollection = getMapCollection(map);
        if ((mapCollection.getClass() == HashMap.class) || (mapCollection.getClass() == LinkedHashMap.class) || (mapCollection.getClass() == WeakHashMap.class)) {
            System.out.println("##########################                   Перебір HashMap колекції EntrySet                           ##########################");
            for (Map.Entry<User, Role> worker : mapCollection.entrySet()) {
                User user = worker.getKey();
                Role role = worker.getValue();
                System.out.println(user);

                if (user != null) {
                    System.out.println(user.getName());
                    System.out.println(role.getName());
                    if (Objects.equals(user.getName(), "Petro"))
                        break;
                }

            }

            System.out.println("");
            System.out.println("##########################                   Перебір HashMap Ітератором Ключа як SET                   ##########################");
            Set<User> users = mapCollection.keySet();
            for (User user : users) {
                if (user != null) {
                    System.out.println(user.getAge());
                }
            }

            System.out.println("");
            System.out.println("##########################           Перебір HashMap  Ітератором значення як Колекції                ##########################");
            Collection<Role> values = mapCollection.values();
            Iterator<Role> iterator1 = values.iterator();
            while (iterator1.hasNext()) {
                Role role = iterator1.next();
                System.out.println(role.getVisitCount());
            }
            mapCollection.put(null, guest);


            System.out.println("");
            System.out.println("#####################   getOrDefault     ############################");
            System.out.println("#####################   Якщо є ключ то вертає значення, а якщо ні то 2 параметр що передали     ############################");
            Role orDefault = mapCollection.getOrDefault(new User("Petro", "Petrov", 31), admin);
            System.out.println(orDefault.getName());

            System.out.println("");
            System.out.println("#####################    putIfAbsent    ############################");
            System.out.println("#####################    Якщо ключ null або його нема то добавить значення з параметрів    ############################");
            mapCollection.putIfAbsent(jora, null);
            System.out.println("");
            System.out.println(mapCollection);
        }
        if (mapCollection.getClass() == TreeMap.class) {
//            mapCollection.put(null, guest);
        }


        }
}


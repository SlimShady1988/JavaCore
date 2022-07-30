package Collections;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class TryCollection {
    public static Map<String, User> getMapCollection () {
        return null;
    }

    public static List<User> getListCollection (String type) {
        List<User> list = null;
        if (type.equals("array")) {
            list = new ArrayList<>();
        }
        if (type.equals("linked")) {
            list = new LinkedList<>();
        }
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            String name = RandomStringUtils.randomAlphabetic(8);
            String surname = RandomStringUtils.randomAlphabetic(10);
            var age = random.nextInt(80 - 18) + 18;
            list.add(new User(name, surname, age));
        }

        return list;
    }

    public static void main(String[] args) {
        List<User> arrayList = getListCollection("array");
        List<User> linkedList = getListCollection("linked");
        List<String> collect = linkedList.stream().map(user -> user.getName()).collect(Collectors.toList());
        collect.add("AAA");

        System.out.println(collect.get(10));
    }
}

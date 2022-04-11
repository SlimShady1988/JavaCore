package Core.Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamEx {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Vic", 34));
        persons.add(new Person("Oxa", 29));
        persons.add(new Person("Pol", 33));
        persons.add(new Person("Slave", 31));

        persons.stream()
                .filter(person -> person.getAge() >= 32)
                .sorted(Comparator.comparing(Person::getName))
                .map(Person::getName)
                .forEach(
//                (String name) -> {
//                    System.out.println(name);
//                }
                        System.out::println
                );
    }
}

class StreamEx2 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Vic", 34));
        persons.add(new Person("Oxa", 29));
        persons.add(new Person("Pol", 33));
        persons.add(new Person("Slave", 31));

        int sum = 0;
        int thirty = 0;

        for (Person person : persons){
            if (person.getAge() >30 ) {
                sum += person.getAge();
                thirty++;
            }
        }
        double averageAge = (double) sum / thirty;

        System.out.println(averageAge);

        double average2 = persons.stream().filter(person -> person.getAge() > 30).mapToInt(person -> person.getAge()).average().getAsDouble();
        System.out.println(average2);


        }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

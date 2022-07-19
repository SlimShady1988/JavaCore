package Core.Java8.java17;

import java.time.LocalDateTime;

public record RecordTry(String name, Integer age) {
    public static LocalDateTime birthday;

    public LocalDateTime getBirthday () {
        return birthday;
    }

    public void setBirthday (LocalDateTime intValue) {
        birthday = intValue;
    }

    public String getName () {
        return name;
    }

}

class TryRecord {
    public static void main(String[] args) {
        RecordTry ivan = new RecordTry("Ivan", 22);
        ivan.setBirthday(LocalDateTime.of(1990,10,15,0,0));
        System.out.println(ivan.getBirthday());
        System.out.println(ivan.name());
        System.out.println(ivan.age());
    }
}

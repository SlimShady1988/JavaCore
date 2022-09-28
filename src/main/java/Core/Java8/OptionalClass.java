package Core.Java8;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.sql.Array;
import java.util.*;
import java.util.stream.Stream;

public class OptionalClass {
    public static void main(String[] args) {
        String str;
        String str2;
        String str3;
        var random = new Random().ints(0, 10).findFirst().getAsInt();
        /*return new Optional through private constructor (Factory method)*/
        Optional<Integer> optionalEmpty = Optional.empty();

        /*return new Optional  with passed value  or nullPointerExc*/
        var optionalInteger = Optional.of(random);

        /*return new Optional through private constructor (Factory method) or passed value */
        Optional<Integer> optionalNullable = Optional.ofNullable(null);

        /*Якщо Optional  повертає null то метод ifPresent не буде його обробляти
        * Тобто ifPresent виконує Consumer функцію над не нульовим Optional*/
        System.out.println("ifPresent method - ");
        optionalNullable.ifPresent(System.out::println);
        System.out.println();
        /* Метод orElse на Optional буде вертати об'єкт, що в методі orElse() в тому випадку,
         коли Optional(на якому викликається) вертає null. Об'єкт має бути того ж типу що чекається в Optional.
         Він буде створений зазвичай заздалегідь, отже на нього буде потрачено певний ресурс*/
        System.out.println("orElse method - ");
        System.out.println(isPresentMan(random).orElse(888));
        System.out.println();
        /* метод orElseGet на Optional буде вертати Supplier, що буде описаний в методі orElseGet() в тому випадку,
         коли Optional(на якому викликається) вертає null. Обєкт має бути того ж типу що чекається в Optional.
         Він буде створений ТІЛЬКИ в випадку NULL на головному Optional, а отже не буде потрачено ресурс зазделегідь*/
        System.out.println("orElseGet method - ");
        System.out.println(isPresentMan(random).orElseGet(() ->new Random().ints(5,55).findFirst().getAsInt()));
        System.out.println();
        /* метод orElseGet на Optional буде вертати NoSuchElementException в тому випадку,
         коли Optional(на якому викликається) вертає null.*/
        System.out.println("orElseThrow method - ");
        System.out.println(isPresentMan(random).orElseThrow());
        System.out.println();




        System.out.println(optionalEmpty);
        System.out.println(optionalInteger);
        System.out.println(optionalNullable);
    }

    public static Optional<String> getString(){
        return Optional.of("Simple value");
    }
    public static List<Integer> peoplePresent() {
        Integer[] list = new Integer[10];
        list[6] = 6;
        list[2] = 2;
        list[4] = 4;
        list[7] = 7;
        list[9] = 9;

        return Arrays.asList(list);
    }
    public static Optional<Integer> isPresentMan(Integer id) {

        return Optional.ofNullable(peoplePresent().get(id));
    }

}



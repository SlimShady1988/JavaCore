package Core.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreatorVariants {
    public static void main(String[] args) {
        //Єтап 1
        //Методи перетворення даних в потік(Stream)
//1
        List<Integer> integerList = Arrays.asList(10, -20, 30, 40, 30)
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(integerList);
//2
        Stream<Integer> integerStream = Stream.of(10, 20, 30, 40, 30);
//3
        String[] arr = {"Max", "Petro", "Oleg"};
        Stream<String> stringStream = Arrays.stream(arr);
//4
        Stream<Object> objectStream = Stream.builder()
                .add(10)
                .add(20)
                .add(30)
                .add(40)
                .build();
//5
        IntStream intStream = "String".chars();

        //Єтап 2
        //Конвеєрні операції
        /*
            map - для перетворення з 1 типу в інший
            filter - відбирає елементи по заданому критеріїю
            distinct - видаляє дублікати
            parallel -
            sequential -
            flatMap - створення з окремих елементів в одного, обєднавши
            skip - для пропуску значень в згенерованому списку значень
                *для генератора значень ще тре примынити limit метод
            sorted - для сортування елеменів
        */

        //Єтап 3
        //Термінальні операції
        /*
            forEach - для перебору елементів
            collect - зберігає результат в колекцію
            toArray, toList -  перетворюэ колекцію в масив або список
            min, max,sum, count -
            matcher(anyMatch/allMatch) - якесь значення має відповідати / всі
            findFirst, findAny - знайти перший підходящий або будь який
            iterator - гунерує безкінечний потік

        */
    }

}

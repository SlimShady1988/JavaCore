package Core.Java8;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalClass {
    public static void main(String[] args) {
        /*return new Optional through private constructor (Factory method)*/
        Optional<Integer> optionalEmpty = Optional.empty();
        /*return new Optional  with passed value  or nullPointerExc*/
        Optional<Integer> optionalInteger = Optional.of(10);
        /*return new Optional through private constructor (Factory method) or passed value */
        Optional<Integer> optionalNullable = Optional.ofNullable(null);

        String str;
        String str2;
        String str3;

        if (getString().isPresent()) {
            str = getString().get();
//            str = getString().orElseGet(String::new);
            System.out.println(str);
        }
        str2 = getString().orElse(null);
        str3 = getString().orElseThrow(null);
        Stream.of(str2).forEach(System.out::println);
        Stream.of(str3).forEach(System.out::println);


        System.out.println(optionalEmpty);
        System.out.println(optionalInteger);
        System.out.println(optionalNullable);
    }

    public static Optional<String> getString(){
        return Optional.of("Simple value");
    }
}



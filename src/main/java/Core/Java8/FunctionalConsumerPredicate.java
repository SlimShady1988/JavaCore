package Core.Java8;

import java.util.Comparator;
import java.util.function.*;

public class FunctionalConsumerPredicate {
    public static Integer integer = 10;
    public static String aaaString = "aaa";

    public static void main(String[] args) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!       FUNCTIONAL INTERFACE METHODS      !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        functionalEx();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!       CONSUMER INTERFACE METHODS      !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        consumersEx();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!       PREDICATE INTERFACE METHODS      !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        predicateEx();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!       SUPPLIER INTERFACE METHODS      !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        supplierEx();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!       BINARY OPERATION INTERFACE METHODS      !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        binaryOperationEx();
    }

    public static void functionalEx() {
        Function<String, Integer> strInt = a ->  {
            System.out.println("STR - INT return INT Length");
            return  a.length();
        };
        Function<Integer, String> intStr = a ->  {
            System.out.println("INT - Str return Integer toString");
            return  " Integer - " + a.toString();
        };
        Function<Integer, Integer> intInt = a ->  {
            System.out.println("INT - INT return INT *22");
            return 22;
        };
        Function<String, String> strStr = a ->  {
            System.out.println("STR - STR return UpperCAse");
            return  a.toUpperCase();
        };


        System.out.println("############ ==   FunctionInterface implementation   == ##############");
        FunctionalInterfaceEx functionalInterfaceEx = String::length;
        int iz = functionalInterfaceEx.applyEx(aaaString);
        System.out.println(iz);


        System.out.println("\n############# ==   APPLY   == ##############");
        Integer functionApply = intInt.apply(integer);
        System.out.println(functionApply);


        System.out.println("\n############ ==   COMPOSE ON STRING  == ##############");
        Integer composeStr = strInt.compose(strStr).apply("");
        System.out.println(composeStr);


        System.out.println("\n############# ==   COMPOSE ON INTEGER  == ##############");
        String composeInt = intStr.compose(intInt).apply(2);
        System.out.println(composeInt);

        System.out.println("\n############## ==   AndTHEN ON STRING  == ##############");
        String andThenStr = intStr.andThen(strStr).apply(22);
        System.out.println(andThenStr);


        System.out.println("\n############## ==   AndTHEN ON INTEGER  == ##############");
        Integer andThenInt = strInt.andThen(intInt).apply("");
        System.out.println(andThenInt);
    }

    public static void consumersEx() {
        System.out.println("############ ==   Accept   == ##############");
        Consumer<String> consumer = a -> {
            aaaString = a + " variable had been changed before";
            System.out.println("Consumer working");
        };
        consumer.accept(aaaString);

        System.out.println("\n############ ==   AndTHEN   == ##############");
        consumer.andThen(s -> System.out.println("New consumer is working")).accept("some str");
        System.out.println(aaaString);
    }

    public static void predicateEx() {
        System.out.println("\n############ ==   test   == ##############");
        Predicate<String> predicate = a -> integer > 11;
        Predicate<String> predicate2 = a -> integer > 5;
        boolean test = predicate.test("");
        System.out.println(test);
        System.out.println("\n############ ==   and   == ###########");
        /* It has run first predicate.test and second.test -> if any  predicate return false "AND" will return TRUE  */
        Boolean and = predicate.and(predicate2).test("");
        System.out.println(and);

        System.out.println("\n############ ==   or   == ###########");
        /* It has run first predicate.test and second.test -> if any  predicate return true "OR" will return TRUE  */
        boolean or = predicate.or(predicate2).test("");
        System.out.println(or);

        System.out.println("\n############ ==   negate   == ###########");
        /* return !test(false == true and true == false)*/
        boolean negate = predicate.negate().test(aaaString);
        System.out.println(negate);

        System.out.println("\n############ ==   isEqual   == ###########");
        /* No ones know why  */
        Predicate<Object> equal = Predicate.isEqual(predicate2);
        System.out.println (equal.test(""));
        System.out.println("\n############ ==   NOT   == ###########");
        /* It has run negate method on class, as it's STATIC  */
        boolean not = Predicate.not(predicate).test("");
        System.out.println(not);
    }

    public static void supplierEx() {
        System.out.println("############ ==   GET   == ##############");
        Supplier<String> supplier = () -> {
            aaaString = " variable has been changed";
            System.out.println("supplier working");
            return null;
        };
        String get = supplier.get();
        System.out.println(get);
    }

    public static void binaryOperationEx() {
        BinaryOperator<Integer> binaryOperator = (a, b) -> {
            System.out.println("BinaryOperator has been worked");
            return a + b;
        };
        System.out.println(binaryOperator.apply(118,88));

        System.out.println("############ ==   MinBy   == ##############");
        BinaryOperator<Integer> binaryOperator1 = BinaryOperator.minBy(Comparator.comparingInt((Integer o) -> o));
        System.out.println(binaryOperator1.apply(118,88));
        System.out.println("############ ==   MaxBy   == ##############");
        BinaryOperator<Integer> binaryOperator2 = BinaryOperator.maxBy(Comparator.nullsLast((o1, o2) -> o1 / o2));
        System.out.println(binaryOperator2.apply(0,8));
    }
}



@FunctionalInterface
interface FunctionalInterfaceEx {
    int applyEx( String a);
}

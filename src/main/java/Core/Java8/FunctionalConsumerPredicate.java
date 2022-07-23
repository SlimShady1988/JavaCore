package Core.Java8;

import java.util.Comparator;
import java.util.function.*;

public class FunctionalConsumerPredicate {
    public static Integer integer = 10;
    public static String bnv = "bnv";

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

        Function<String, Integer> lengthFunction = String::length;

        Function<Integer, String> andThenF = b -> {
            b = b * 2;
            return "Hello".toUpperCase() + b;
        };

        Function<Integer, String> composeF2 = b -> {
            System.out.println("Compose F2");
            System.out.println(b);
            b = b * 2;
            System.out.println(b);

            return b + "";
        };

        Function<String, String> composeF = b -> {
            System.out.println("Compose F");
            System.out.println(b);

            return "3 + b" + b;
        };

        System.out.println("\n############# ==   APPLY   == ##############");
        /* Виконується apply на lengthFunction:
        -> отримує параметр типу String
        ->  повертає значення типу Integer (згвідно "Закритих Дженереків") */
        System.out.println(lengthFunction.apply(bnv));

        System.out.println("\n############## ==   AndThan  == ##############");
        /* Виконується apply на lengthFunction
        -> результат записується в параметр для andThenF(де ми мали б з ним щось робити)
        -> повернеться те що поверне функція andThenF */
        System.out.println(lengthFunction.andThen(andThenF).apply(bnv));

        System.out.println("\n############ ==   COMPOSE  == ##############");
        /* Виконується apply() з вхідним параметром на composeF2
        -> результат записується в параметр для composeF(де ми мали б з ним щось робити)
        -> повернеться те що поверне функція composeF */
        System.out.println(composeF.compose(composeF2).apply(integer));

//        Function<String, Integer> strInt = a ->  {
//            System.out.println("STR - INT return INT Length");
//            return  a.length();
//        };
//        Function<Integer, String> intStr = a ->  {
//            System.out.println("INT - Str return Integer toString");
//            return  " Integer - " + a.toString();
//        };
//        Function<Integer, Integer> intInt = a ->  {
//            System.out.println("INT - INT return INT *22");
//            return 22;
//        };
//        Function<String, String> strStr = a ->  {
//            System.out.println("STR - STR return UpperCAse");
//            return  a.toUpperCase();
//        };
//
//
//        System.out.println("############ ==   FunctionInterface implementation   == ##############");
//        FunctionalInterfaceEx functionalInterfaceEx = String::length;
//        int iz = functionalInterfaceEx.applyEx(aaaString);
//        System.out.println(iz);
//
//
//        System.out.println("\n############# ==   APPLY   == ##############");
//        Integer functionApply = intInt.apply(integer);
//        System.out.println(functionApply);
//
//
//        System.out.println("\n############ ==   COMPOSE ON STRING  == ##############");
//        Integer composeStr = strInt.compose(strStr).apply("");
//        System.out.println(composeStr);
//
//
//        System.out.println("\n############# ==   COMPOSE ON INTEGER  == ##############");
//        String composeInt = intStr.compose(intInt).apply(2);
//        System.out.println(composeInt);
//
//        System.out.println("\n############## ==   AndThan ON STRING  == ##############");
//        String andThenStr = intStr.andThen(strStr).apply(22);
//        System.out.println(andThenStr);
//
//
//        System.out.println("\n############## ==   AndThan ON INTEGER  == ##############");
//        Integer andThenInt = strInt.andThen(intInt).apply("");
//        System.out.println(andThenInt);
    }

    public static void consumersEx() {
        Consumer<String> consumerTry = a -> {
            System.out.println(" consumerTry working");
            a = a + " variable had been changed before";
            System.out.println(a);
        };
        Consumer<String> consumerAndThen = a -> {
            System.out.println(" consumerAndThen working");
            a = a + " variable had been changed after";
            System.out.println(a);
        };

        System.out.println("############ ==   accept   == ##############");
        /* Виконується accept на consumerTry:
        -> отримує параметр типу String
        -> опрацьовує його та вертає VOID */
        consumerTry.accept(bnv);

        System.out.println("\n############ ==   andThen   == ##############");
        /* Виконується accept на consumerTry з параметром bnv
        -> виконується accept на consumerAndThen з параметром bnv
        -> повернеться VOID */
        consumerTry.andThen(consumerAndThen).accept(bnv);
    }

    public static void predicateEx() {
        Predicate<Integer> predicate = a -> {
            System.out.println("Predicate is running");
            return integer < a + 5;
        };
        Predicate<Integer> predicate2 = a -> {
            System.out.println("Predicate2 is running");
            return integer < a + 5;
        };
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> {
            System.out.println("BiPredicate is running");
            return integer < a + b;
        };

        System.out.println("\n############ ==   test   == ##############");
        /* Перевіряємо параметр який передано в test(не обовязково, можна будь що перевіряти)
        на задану умову в тілі функції
        та повертає boolean */
        System.out.println(predicate.test(5));

        System.out.println("\n############ ==   and   == ###########");
        /* Виконується test на predicate
        -> якщо predicate верне false то вернеться false
        -> якщо predicate верне true то виконується "and" з параметром -  predicate2
        -> повертає boolean результат predicate2 */
        System.out.println(predicate.and(predicate2).test(6));

        System.out.println("\n############ ==   or   == ###########");
        /* Виконується test на predicate
        -> якщо predicate верне true то вернеться true
        -> якщо predicate верне false то виконується "or" з параметром -  predicate2
        -> повертає boolean predicate2 */
        System.out.println(predicate.or(predicate2).test(2));

        System.out.println("\n############ ==   negate   == ###########");
        /* return !test(false == true and true == false)*/
        System.out.println(predicate.negate().test(2));

        System.out.println("\n############ ==   isEqual   == ###########");
        /* No ones know why  */
        System.out.println(Predicate.isEqual(predicate2).test(44));

        System.out.println("\n############ ==   NOT   == ###########");
        /* It has run negate method on class, as it's STATIC  */
        System.out.println(Predicate.not(predicate).test(2));

        System.out.println("\n############ ==   BiPredicate Example   == ##############");
        System.out.println("\n############ ==   BiPredicate test   == ##############");

        /* BiPredicate на відміну від Predicate отримує 2 параметра, які можнапорівнювати
          та повертає boolean */
        System.out.println(biPredicate.test(2,5));
    }

    public static void supplierEx() {
        System.out.println("############ ==   GET   == ##############");
        Supplier<String> supplier = () -> {
            bnv += " variable has been changed";
            System.out.println("supplier working");
            return bnv;
        };

        /* Виконується get на supplier
        -> без вхідних параметрів
        -> повертає будь який результат тупи який вказаний в Дженеріку */
        System.out.println(supplier.get());
        System.out.println(bnv);
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

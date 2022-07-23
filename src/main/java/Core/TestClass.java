package Core;

import java.io.Externalizable;

public class TestClass {
    public static void main(String[] args) {
        // Interface Implements
        ImplementInterfaceClass interfaceClassImpl = new ImplementInterfaceClass();
        interfaceClassImpl.mainInterfaceMethod();
        String mainInterfaceField = interfaceClassImpl.mainInterfaceField;
        System.out.println(mainInterfaceField);
        System.out.println("==================================");

        // Abstract Class Implements
        ImplementAbstractClass abstractClassExt = new ImplementAbstractClass();
        String mainAbstractField = abstractClassExt.mainAbstractField;
        System.out.println(mainAbstractField);
        abstractClassExt.mainAbstractMethod();
        abstractClassExt.mainNoAbstractMethod();
        abstractClassExt.simpleMethod();
        System.out.println("==================================");

        EnumClass monday = EnumClass.MONDAY;
        System.out.println(monday.days);

        String hello = "hello";
        String vic = "Victor";
        String concat = hello.concat(vic);

        System.out.println(hello + vic);
        System.out.println(concat);
        System.out.println(hello);

        System.out.println("================= Immutable Classes =================");
        Integer s1 = 11111;
        Integer s2 = 11111;

        boolean res = s1 == s2;
        boolean res2 = s1.equals(s2);
        System.out.println(res);
        System.out.println(res2);

                System.out.println("================= Immutable Classes =================");

        Object o = 1001L;

        var result = switch (o) {
            case Integer a  -> a;
            case null -> null;
            case String s -> Integer.parseInt(s);
            case Long l && l > 1000 && l < 10_000 -> {
                System.out.println("Hello from Long");
                yield 1000;

            }
            default -> "DEFAULT";
        };



    }
}

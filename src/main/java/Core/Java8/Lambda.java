package Core.Java8;

public class Lambda {
    public static void main(String[] args) {

        Operation operationSum = Integer::sum;
        Operation operationSub = (x, y) -> x - y;
        Operation operationDiv = (x, y) -> x / y;
        Operation operationMultiple = (x, y) -> x * y;

        int z = operationSum.calculate(20, 10);
        int s = operationSub.calculate(20, 10);
        int d = operationDiv.calculate(20, 10);
        int m = operationMultiple.calculate(20, 10);

        operationDiv.show();
        Operation.print();

        System.out.println(z);
        System.out.println(s);
        System.out.println(d);
        System.out.println(m);
    }
}

@FunctionalInterface
interface Operation {
    int calculate(int x, int y);

    default void show () {
        System.out.println("hello");
    }

    static void print () {
        System.out.println("world");
    }
}


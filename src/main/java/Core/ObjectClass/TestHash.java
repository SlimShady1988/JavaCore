package Core.ObjectClass;

import java.util.Collections;

public class TestHash {
    public static void main(String[] args) {
        Car1 car1 = new Car1(12);
        Car1 car2 = new Car1(12);
        Car1 car3 = new Car1(15);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
        System.out.println("############################");
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
        System.out.println(car2.equals(car3));
        System.out.println("############################");
        System.out.println(car1 == car2);
        System.out.println(car1 == car3);
        System.out.println(car2 == car3);

    }
}

class TestToString {
    public static void main(String[] args) {
        Car car = new Car(240, "black");

        System.out.println(car.getClass());
        System.out.println(car);
    }
}

class TestEquals {
    public static void main(String[] args) {
        Car1 car1 = new Car1(2);
        Car1 car2 = new Car1(2);
        Car1 car3 = car1;

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
//        System.out.println(car1 == car2);
//        System.out.println(car1 == car3);

        Object o = new Collections[2];
    }
}

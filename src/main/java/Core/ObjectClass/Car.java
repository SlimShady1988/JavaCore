package Core.ObjectClass;

import java.util.Objects;

public class Car {
    private int speed;
    private String color;

    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
class Car1 {
    private int id;

    public Car1(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car1 car1 = (Car1) o;
        if (id != car1.id) return false;
        return true;
//        return id == car1.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

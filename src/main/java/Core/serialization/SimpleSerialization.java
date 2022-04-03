package Core.serialization;

import java.io.*;
import java.util.Objects;

public class SimpleSerialization {
    public static void main(String[] args) {
        User user = new User(1, "Ivan");
        File file = new File("output.txt");
        try (
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        ) {
            outputStream.writeObject(user);
            user = (User)inputStream.readObject();
            System.out.println(user);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class User implements Serializable {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

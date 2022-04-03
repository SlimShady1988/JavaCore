package Core.serialization;

import java.io.*;
import java.util.Objects;

public class SimpleExternalizable {
    public static void main(String[] args) {
        User2 user = new User2(1, "Ivan");
        File file = new File("output.txt");
        try (
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        ) {
            outputStream.writeObject(user);
            user = (User2)inputStream.readObject();
            System.out.println(user);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class User2 implements Externalizable {
    private int id;
    private transient String name;

    public User2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User2() {}

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
        User2 user = (User2) o;
        return id == user.id && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeObject(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        name = (String)in.readObject();
    }
}

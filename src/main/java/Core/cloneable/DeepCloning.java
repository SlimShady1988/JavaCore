package Core.cloneable;

public class DeepCloning {
    public static void main(String[] args) {
        Group2 group = new Group2(1);
        User2 user = new User2(22, "John", group);
        User2 clone = new User2(user);

        System.out.println(user);
        System.out.println(clone);
        System.out.println(        );

        clone.setName("Robert");
        clone.group.id = 10;
//        clone.setGroup(new Group(3));
        System.out.println(user);
        System.out.println(clone);
        System.out.println(        );
    }
}

class Group2 {
    public int id;

    public Group2(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                '}';
    }
}

class User2 implements Cloneable {
    private int age;
    private transient String name;
    public Group2 group;

    public User2(int age, String name, Group2 group) {
        this.age = age;
        this.name = name;
        this.group = group;
    }

    public User2(User2 other) {
        this(other.age, other.name, other.group);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group2 getGroup() {
        return group;
    }

    public void setGroup(Group2 group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "User2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", group=" + group +
                '}';
    }

    @Override
    public User2 clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (User2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
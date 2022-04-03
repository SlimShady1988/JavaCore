package Core.cloneable;

public class ShallowCloning {
    public static void main(String[] args) {
        Group group = new Group(1);
        User user = new User(22, "John", group);
        User clone = user.clone();
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

class Group {
    public int id;

    public Group(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                '}';
    }
}

class User implements Cloneable {
    private int age;
    private transient String name;
    public Group group;

    public User(int age, String name, Group group) {
        this.age = age;
        this.name = name;
        this.group = group;
    }

    public User() {}

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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", group=" + group +
                '}';
    }

    @Override
    public User clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
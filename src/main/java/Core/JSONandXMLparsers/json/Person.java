package Core.JSONandXMLparsers.json;

import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
//    private Baggage baggage;
    List<String> languages;
    List<String> frameworks;

    private Role role;

    public Person() {
    }

    public Person(String firstName, String lastName, List<String> languages, List<String> frameworks, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
//        this.lastName = baggage;
        this.languages = languages;
        this.frameworks = frameworks;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", languages=" + languages +
                ", frameworks=" + frameworks +
                ", role=" + role +
                '}';
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getFrameworks() {
        return frameworks;
    }

    public void setFrameworks(List<String> frameworks) {
        this.frameworks = frameworks;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public Baggage getBaggage() {
//        return baggage;
//    }
//
//    public void setBaggage(Baggage baggage) {
//        this.baggage = baggage;
//    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

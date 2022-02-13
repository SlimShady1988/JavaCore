package Core;

public class ImplementInterfaceClass implements InterfaceClass {
    String mainInterfaceField = "Interface field";

    @Override
    public void mainInterfaceMethod() {
        System.out.println("ImplementInterfaceClass run override method implements InterfaceClass");
    }
}

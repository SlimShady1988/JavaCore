package Core;

abstract class AbstractClass extends SimpleClass {

    public String mainAbstractField = "Abstract field";

    public abstract void mainAbstractMethod();

    public  void mainNoAbstractMethod(){
        System.out.println("Run No  ABSTRACT METHOD FROM ABSTRACT CLASS");
    };
}

package Core;

public class SimpleClass {
    private final String privateString = "PrivateString";
    protected final String protectedString = "protectedString";
    protected static final String protectedStaticString = "protectedStaticString";
    public final String publicString = "publicString";
    final String localString = "localString";

    public void simpleMethod () {
        System.out.println("Simple String");
    }

    protected static String protectedMethod (){
        return "protectedMethod";
    }

}

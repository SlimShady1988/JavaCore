package Core;

import Core.Scops.InSamePackageClass;

public class SimpleClass extends InSamePackageClass {
    private static String privateString = "PrivateString";
    protected static String protectedString = "protectedString";
    public static String publicString = "publicString";

    static String localString = "localString";

    public void simpleMethod () {
        System.out.println("Simple String");
    }

    protected static String protectedMethod (){
        return "protectedMethod";
    }

}


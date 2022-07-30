package Core.Scops;

import Core.SimpleClass;

public class TestScopeClass extends SimpleClass{
    private String privateString2 = "PrivateString";
    private static String privateString = "PrivateString";
    protected static String protectedString = "protectedString";
    public static String publicString = "publicString";

    static String localString = "localString";



    public static void main(String[] args) {
        System.out.println("================  Scope example  ==================");
        // Scope example
        SimpleClass simpleClass = new SimpleClass();
        InSamePackageClass inSamePackageClass = new InSamePackageClass();
        // #############################################################################################################
        // ###########################################        Public      ##############################################
        // #############################################################################################################
        /*
        * Public змінні видно у всіх об'єктах класу та класі
        */
        System.out.println(simpleClass.publicString);
        System.out.println(publicString);


        // #############################################################################################################
        // ###########################################        Protected      ###########################################
        // #############################################################################################################
        /*
        * Protected змінні в межах класу
        */
        System.out.println(protectedString);
        /*
        * Protected змінні в межах одного пакету
        */
        System.out.println(inSamePackageClass.protectedString2);
        /*
        * Protected змінні видно ТАКОЖ тому що цей клас наслідує клас в якому це поле оголошене (extends SimpleClass)
        */
        System.out.println(simpleClass.protectedString);
        // #############################################################################################################
        // ###########################################        Local      ###############################################
        // #############################################################################################################
        /*
        * Local змінні в межах одного пакету
        */
        System.out.println(inSamePackageClass.localString);
        /*
        * Local змінні в межах класу
        */
        System.out.println(localString);
        // #############################################################################################################
        // ###########################################        Private        ###########################################
        // #############################################################################################################
        /*
        * Лише Private змінні цього класу можна використовувати.
        */
        System.out.println(privateString);
    }
}


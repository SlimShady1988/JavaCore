package Core.Scops;

import Core.SimpleClass;

public class SimpleClassInOtherPackage
        extends SimpleClassExt                              // Наслідує для  PROTECTED методів та полів
{
    public static void main(String[] args) {


        // Scope example
        SimpleClass simpleClass = new SimpleClass();
        System.out.println(simpleClass.publicString);

        // Local & protected поля не буде видно в  цьому пакеті, але якщо цей клас унаслідувати від SimpleClass чи його наслідника (SimpleClassExt) тоді PROTECTED буде видно
//        System.out.println(simpleClass.localString);
//        System.out.println(simpleClass.protectedString);
        System.out.println(SimpleClass.protectedMethod());
        System.out.println(SimpleClass.protectedStaticString);
        System.out.println("==================================");
    }
}

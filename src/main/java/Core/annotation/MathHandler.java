package Core.annotation;

import java.lang.reflect.Method;

public class MathHandler {
    @MathAnno(num1 = 10, num2 = 12)
    public void addTwoNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}

class RunAnno {
    public static void main(String[] args) throws NoSuchMethodException {
        MathHandler mh = new MathHandler();
        Class<?> cl = MathHandler.class;
        Method m = cl.getDeclaredMethod("addTwoNumbers", int.class, int.class);
        MathAnno mathAnno = m.getAnnotation(MathAnno.class);
        mh.addTwoNumbers(mathAnno.num1(), mathAnno.num2());
    }
}


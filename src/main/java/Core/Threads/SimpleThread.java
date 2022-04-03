package Core.Threads;

import java.util.ArrayList;

public class SimpleThread  extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
//        super.run();
    }
}

class Simple2Thread  implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
//        super.run();
    }
}

class RunThreads {

    public static void main(String[] args) {
        Thread thread = new Thread(new SimpleThread());
        thread.start();
        Thread thread2 = new Thread(new Simple2Thread());
        thread2.start();

        ArrayList<Object> al = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            al.add(new Object());
        }
        System.out.println("HELLO");
    }

}

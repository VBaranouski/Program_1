package Threads;

/**
 * Created by Vlad on 7/26/17.
 */
public class NewThreadFirst implements Runnable {
    public Thread t;
    String name;
    public NewThreadFirst(String threadname){
        name = threadname;
        t = new Thread (this, name);
        System.out.println("New Tread " + t + " is created");
        t.start();

    }

    @Override
    public void run() {
        synchronized (t) {
            counter(name);

        }
    }
    public static void counter(String name){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " :" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.print("Thread interrupted");
        }
        System.out.println(name + ": thread is completed ");

    }
}



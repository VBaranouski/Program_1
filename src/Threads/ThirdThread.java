package Threads;

/**
 * Created by Vlad on 7/27/17.
 */
public class ThirdThread implements Runnable{
    public Thread t;
    String name;
    public ThirdThread(String threadname) {
        name = threadname;
        t = new Thread (this, name);
        System.out.println("New Tread " + t + " is created");
        t.start();

    }

    @Override
    public void run() {

        try {
            for (int i = 10; i > 0; i--) {
                System.out.println(name + " :" + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.print("Thread interrupted");
        }
        System.out.println(name + ": thread is completed ");

    }
}

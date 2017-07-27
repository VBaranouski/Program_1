package Threads;

/**
 * Created by Vlad on 7/27/17.
 */
public class FourthThread implements Runnable {
    public Thread t;
    String name;
    public FourthThread(String threadname){
        name = threadname;
        t = new Thread (this, name);
        System.out.println("New Tread " + t + " is created");
        t.start();


    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println(t + " has started");
            for (int i = 10; i > 0; i--) {
                System.out.println(name + " :" + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.print("Thread interrupted");
        }
        System.out.println(name + ": thread is completed ");



    }
}

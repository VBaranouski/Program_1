package Threads.Synchronizer;

/**
 * Created by Vlad on 7/27/17.
 */
public class CallMe {

    void call (String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("] ");

    }

}
package Threads.Synchronizer;

/**
 * Created by Vlad on 7/27/17.
 */
public class Caller implements Runnable {
    protected String msg;
    protected CallMe target;
    public Thread t;


    public Caller(CallMe targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();

    }

    public void run (){
        synchronized (target){
            target.call(msg);
        }


    }
}

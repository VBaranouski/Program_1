package Threads;

/**
 * Created by Vlad on 7/26/17.
 */
public class SecondThread extends Thread{
    public SecondThread(){
        super("Second Thread Demo");
        System.out.println("Second Thread" + this);
        start();

    }
@Override
    public void run(){

        try {
            for (int i = 5; i>0; i--){
                System.out.println("Second thread: " + i);
                Thread.sleep(5000);
            }
        }
            catch (InterruptedException e){
                System.out.println("Second thread is interrupted");

        }
        System.out.println("Second thread is completed");

    }
}

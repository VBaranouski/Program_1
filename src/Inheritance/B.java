package Inheritance;

/**
 * Created by Vlad on 7/21/17.
 */
public class B extends A{
    public void showk(int k){
        System.out.println("k: " + k);
    }
    public void sum(int i, int j, int k){
        System.out.println("i+j+k: " + (k+j+i));
    }
}

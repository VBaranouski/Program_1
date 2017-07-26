package Inheritance;

/**
 * Created by Vlad on 7/21/17.
 */
public class A {
    int i,j;
    public A (A ob){
        i = ob.i;
        j = ob.j;

    }



    public void showij(int i, int j){
        System.out.println("i & J: " + i + j);
    }
}

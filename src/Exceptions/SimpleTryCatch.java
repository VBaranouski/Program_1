package Exceptions;

/**
 * Created by Vlad on 7/24/17.
 */
public class SimpleTryCatch {
    double a;
    public void devison(int b){
        try {
            a = 42 / b;
        }
        catch (ArithmeticException e){
            System.out.print("alarma!! ");
        }
        System.out.println(a);
    }

    public static void exThrowExample(){
        try {
            throw new NullPointerException(" yaahooo ");
        }
        catch (NullPointerException e) {
            System.out.print(" First catch ");
            throw e;
        }
    }


    public static void exThrowSecond() throws IllegalAccessException {
        System.out.print(" First catch ");
        throw new IllegalAccessException(" yaahooo ");


    }
}

package Recursion;

/**
 * Created by Vlad on 7/21/17.
 */
public class RecursionFactorial {

    public int factorial(int n){
        int result;
        if (n<=0) return 0;
        if (n==1) return 1;
        result = factorial(n-1)*n;
        return result;

    }
}

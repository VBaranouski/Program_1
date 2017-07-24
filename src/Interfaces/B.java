package Interfaces;

/**
 * Created by Vlad on 7/24/17.
 */
public class B implements A.NestedIF {
    public boolean isNotNegative(int x){
        return x < 0 ? false:true ;
    }
}

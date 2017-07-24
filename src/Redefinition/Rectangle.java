package Redefinition;

/**
 * Created by Vlad on 7/24/17.
 */
public class Rectangle extends Figure {
    public Rectangle (double a, double b){
        super (a,b);
    }

    public double area(){
        System.out.print("Aria of rectangle is: ");
        return dimention1*dimention2;
    }

}

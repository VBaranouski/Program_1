package Redefinition;

/**
 * Created by Vlad on 7/24/17.
 */
public class Triangle extends Figure {

    public Triangle(double a, double b){
        super(a,b);
    }

    public double area(){
        System.out.print("Aria of Triangle is: ");
        return dimention1+dimention2/2;
    }

}

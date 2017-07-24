package Redefinition;

/**
 * Created by Vlad on 7/24/17.
 */
public class Figure {
   public double dimention1;
   public double dimention2;

  public Figure(double a, double b){
        dimention1 = a;
        dimention2 = b;
    }

   public double area(){
        System.out.print("Not defined ");
        return 0;
    }

}

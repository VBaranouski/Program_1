/**
 * Created by Vlad on 7/18/17.
 */
public class Boxes {

    double width;
    double height;
    double leingth;

    public void setValues(double w, double h, double l){
        width = w;
        height = h;
        leingth = l;
    }

    public double volume() {
        return width*height*leingth;
    }

}

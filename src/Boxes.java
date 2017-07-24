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

    public Boxes(double width, double height, double leingth) {
        this.width = width;
        this.height = height;
        this.leingth = leingth;
    }

    public Boxes(){
        width = -1;
        height = -1;
        leingth = -1;
    }

    public Boxes(double len){
        width = height = leingth = len;
    }

    public Boxes(Boxes ob){
        width = ob.width;
        height = ob.height;
        leingth = ob.leingth;
    }
}

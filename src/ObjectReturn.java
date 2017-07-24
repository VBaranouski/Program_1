/**
 * Created by Vlad on 7/21/17.
 */
public class ObjectReturn {
    int a;
    ObjectReturn (int i){
        a = i;
    }

    ObjectReturn incrByTen(){
        ObjectReturn ob = new ObjectReturn(a+10);
        return ob;
    }

}

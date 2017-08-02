package StringStuff;

/**
 * Created by Vlad on 8/2/17.
 */
public class Stringer {
    public void stringCreator(){
        char c[] = {'a','b','c','d','e','f'};
        String s1 = new String(c);
        String s2 = new String(c,1,3);
        System.out.print(s1 + " " + s2);
    }
}

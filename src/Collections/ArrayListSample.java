package Collections;

import java.util.ArrayList;

public class ArrayListSample {



    public ArrayListSample(ArrayList<String> aL) {

    }

    public ArrayList ArrayListMaker(ArrayList aL) {

        aL.add("A");
        aL.add("B");

        aL.add(3,"D");
        System.out.println(aL);
        aL.remove(2);
        System.out.println(aL);
        System.out.println(aL.size());

        return aL;
    }


    public void ArrayListToArray(ArrayList aL){
        String arr[] = new String[aL.size()];
        aL.toArray(arr);

        for (String x: arr){
            System.out.println(x);
        }
        //String s = aL.get(1);
        //System.out.println(s);


    }
}

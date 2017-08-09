package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public void HashMapCreator(){
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("Test", 993.344);
        hm.put("No test", 8443.3);
        hm.put("N", 4343.3);

        Set<Map.Entry<String,Double>> set = hm.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + " " + me.getValue());
        }
        double balance = hm.get("Test");

        hm.put("Test", balance + 1000);
        System.out.println(hm.get("Test"));

    }

    public void HashMapNewCreator(){
        HashMap<String, Boolean> hmb = new HashMap<>();
        hmb.put("Autoplay", true);

        Set<Map.Entry<String,Boolean>> set = hmb.entrySet();
        for (Map.Entry<String, Boolean> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }

        Boolean autoPlay = hmb.get("Autoplay");

        if (autoPlay) {System.out.println(autoPlay);}


    }
}

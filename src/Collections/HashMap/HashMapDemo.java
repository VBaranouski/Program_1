package Collections.HashMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

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
}

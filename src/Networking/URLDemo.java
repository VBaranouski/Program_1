package Networking;
import java.net.MalformedURLException;
import java.net.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class URLDemo {
    String url = "http://wwww.HerbSchild.com/Articles";
    String url2 = "http://www.google.com";


    public void takeInfoFormURL() throws MalformedURLException {
        URL link = new URL(url);


        System.out.println("Protocol: " + link.getProtocol());
        System.out.println("Port: " + link.getPort());
        System.out.println("Host: " + link.getHost());
        System.out.println("\n");

    }

    public void httpRequestTaker() throws MalformedURLException,Exception {
        URL link = new URL(url2);
        HttpURLConnection hpCon = (HttpURLConnection) link.openConnection();
        HashMap<String, String> hmString = new HashMap();
        HashMap<String, Integer> hmInt = new HashMap();
        hmString.put("Request Method", hpCon.getRequestMethod());
        hmString.put("Response Message", hpCon.getResponseMessage());
        hmInt.put("Response code:", hpCon.getResponseCode());


        //Set<Map.Entry<String, String>> set1 = hmString.entrySet();
        for (Map.Entry<String, String> me : hmString.entrySet()) {
            System.out.println(me.getKey() + ": " + me.getValue());

        }

        //Set<Map.Entry<String, Integer>> set2 = hmInt.entrySet();
        for (Map.Entry<String, Integer> me2 : hmInt.entrySet()) {
            System.out.println(me2.getKey() + ": " + me2.getValue());
        }

        System.out.println("\n");

        Map<String, List<String>> headerMap = hpCon.getHeaderFields();
        Set<String> set3 = headerMap.keySet();
        for (String k: set3
             ) {System.out.println(k + ": " + headerMap.get(k));
            
        }



    }
}

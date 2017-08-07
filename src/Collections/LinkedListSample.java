package Collections;

import java.util.LinkedList;

public class LinkedListSample {

    public void LinkedListCreator() {
        LinkedList<String> ll = new LinkedList<String>();
        LinkedList<String> ll2 = new LinkedList<String>();
        ll.add("a");
        ll.add("b");
        ll.addLast("c");
        ll.addFirst("x");
        ll2.addAll(ll);
        System.out.println(ll2);
        String s = ll.get(1);
        System.out.println(s);
    }
}

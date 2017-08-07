package Collections;
import java.util.LinkedList;

public class MailList {
    public void createAddressList(){
        LinkedList<Address> ll = new LinkedList<>();
        Address ad1 = new Address("New York","John", "10035", "NY", " 123 Canal street");
        ll.add(ad1);
        ll.add(new Address("Jersey City","Mark", "07302", "NJ", "9 Erie street"));
        ll.add(ad1);
        System.out.println(ll);
        System.out.println();
    }

}

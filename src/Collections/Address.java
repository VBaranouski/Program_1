package Collections;

public class Address {
    protected String city;
    protected String name;
    protected String code;
    protected String state;
    protected String street;
    public Address(String c, String n, String cd, String s, String st){
        city = c;
        name = n;
        code = cd;
        state = s;
        street = st;
    }

    public String toString(){
        return "\n" + name + "\n" + street + "\n" + city + " " + state + " " + code + "\n";
    }

}

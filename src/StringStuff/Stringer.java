package StringStuff;

/**
 * Created by Vlad on 8/2/17.
 */
public class Stringer {
    public void stringCreator() {
        char c[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s1 = new String(c);
        String s2 = new String(c, 1, 3);
        System.out.println(s1 + " " + s2);
        System.out.println(s1.length() + " " + s2.length());
        String s3 = "one,two,three";
        System.out.println("one,two,three".length());
        int age = 20;
        String s4 = "She is " + age + " years" + " old";
        System.out.println(s4);

        //****Method charAt
        char ch;
        ch = "abcde".charAt(1);
        System.out.println(ch);
    }

    //****Method getChars
    public void getterChars() {
        String s = "Demo version of getChars method, yahhoooo";
        int start = 5;
        int end = 16;
        char ch[] = new char[end - start];
        s.getChars(start, end, ch, 0);
        System.out.print(ch);
    }

    public void twoStringsEquatioin() {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";
        String s4 = "Hi";

        if (s1.equals(s2)) {
            System.out.println(s1 + " is the same as " + s2);
        } else System.out.print(s1 + " is the not same as " + s2);

        if (s1.equalsIgnoreCase(s3)) {
            System.out.println(s1 + " is almost the same as " + s3);
        } else {
            System.out.print(s1 + " not " + s3);
        }

        if (!s1.equalsIgnoreCase(s4)) {
            System.out.println("That's right: " + s1 + " is not " + s4);
        }
        System.out.println("Hello".startsWith("Hell"));

        if (s1.compareTo(s4) < 0){
            System.out.print(s1 + " is bigger than " + s4);
        }
    }
}

package Readers;
import java.io.*;

/**
 * Created by Vlad on 8/2/17.
 */
public class BuffReader {
    static char c;
    static String str;

    public static void readBufferChar() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type symbol, q - for exit");
        do {
            c = (char) br.read();
            System.out.print(c);
        }
        while (c != 'q');
        System.out.print("   Exit");


    }

    public static void readBufferLine() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type symbol, q - for exit");
        do {
            str = br.readLine();
            System.out.print(str);
        }
        while (!str.equals("Stop"));
        System.out.print(" complete");

    }


    public static void readFile(String args[]){
        int i;
        FileInputStream fin = null;
        if (args.length !=1){
            System.out.println("Starting");
        }
        try {
            fin = new FileInputStream(args[0]);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);

            } while(i != 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
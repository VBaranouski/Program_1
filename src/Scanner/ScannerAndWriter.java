package Scanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerAndWriter {
    public void fileWriter() throws IOException {
       FileWriter writer = new FileWriter("Test.txt");
       writer.write("2, 3, 4,    7 abc 5 6 cde");
       writer.close();

    }

    public void scanAndRead() throws IOException{
        FileReader reader = new FileReader("Test.txt");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            scanner.useDelimiter(", *");
            String str = scanner.next();
            System.out.print(str);
        }
        scanner.close();
    }
}

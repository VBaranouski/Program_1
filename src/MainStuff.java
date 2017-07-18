import java.io.IOException;

/**
 * Created by Vlad on 7/17/17.
 */
public class MainStuff {
    public static void main(String args[]) throws IOException {

        Operations text = new Operations();
        Operations season = new Operations();
        Operations doWhileSwitch = new Operations();

        int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // in java use верблюжий стиль в написании пересенных типоВотТак =)

        Arrays array = new Arrays();//переменные с маленькой буквы обычно

        //Showing array
        array.showArray(monthDays);

        //Sorting
        array.bubbleSorting(monthDays);
        text.showMessage(" ");
        text.showMessage("After Sorting: ");

        //Show sorted array
        array.showArray(monthDays);

        //Calculate average
        text.showMessage(" ");
        text.showMessage("Average value is: ");
        array.calculateAverage(monthDays);

        //For-each
        array.calculatePartArray(monthDays);

        //Case & Switch
        season.seasonCheck(113);
        season.seasonCheckViaCase(10);

        //Do While Switch - input from console
        doWhileSwitch.selecFromConsoleDoWhile();


    }
}



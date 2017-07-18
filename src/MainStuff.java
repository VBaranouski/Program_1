/**
 * Created by Vlad on 7/17/17.
 */
public class MainStuff {
    public static void main(String args[]) {

        Operations text = new Operations();
        text.showMessage("Arrays");

        Operations season = new Operations();


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

        season.seasonCheck(113);
    }
}



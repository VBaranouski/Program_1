/**
 * Created by Vlad on 7/17/17.
 */
public class Operations{

    public void showMessage(String text) {
        System.out.println(text);
    }

    public void calculateAverage(int[] arr){
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++){ // better use foreach or use for with { logic into like yours sum =sum+arr[i]...}
        sum = sum + arr[i];}
        double result = sum/arr.length;
        System.out.print(result);
    }

    public void seasonCheck(int number){
        String season;
        if (number == 12 || number == 1 || number == 2)
            season = "Winter";
        else if (number == 3 || number == 4 || number == 5)
            season = "Spring";
        else if (number == 6 || number == 7 || number == 8)
            season = "Summer";
        else if (number == 9 || number == 10 || number == 11)
            season = "Autumn";
        else
            season = "Bad season";
        System.out.println(season);
    }
}

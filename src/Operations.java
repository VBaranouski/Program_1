import java.io.IOException;

/**
 * Created by Vlad on 7/17/17.
 */
public class Operations{

    public void showMessage(String text) {
        System.out.println(text);
    }

    public void calculateAverage(int[] arr){
        int sum = 0;
        for (int x : arr){ // better use foreach or use for with { logic into like yours sum =sum+arr[i]...}
        sum += x;}
        double result = sum/arr.length;
        System.out.print(result);
    }

    public void calculatePartArray(int[] arr){
        int sum = 0;
        for (int x : arr){
            sum += x;
            if(x == 31)
                break;
        }
        System.out.print(" Part sum is " + sum);
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

    public void seasonCheckViaCase(int number){
        String season;
        switch (number) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Bad Select";
        }
        System.out.println(season);
    }


    public void selectFromConsoleDoWhile() throws IOException {
        char choice;
        do {
            System.out.println("option 1");
            System.out.println("option 2");
            System.out.println("option 3");
            System.out.println("option 4");
            System.out.println("option 5");
            choice = (char) System.in.read();
        }
         while (choice < '1' || choice > '5');
        System.out.println("\n");
        switch (choice){
            case '1':
                System.out.println("selected option 1");
                break;
            case '2':
                System.out.println("selected option 2");
                break;
            case '3':
                System.out.println("selected option 3");
                break;
            case '4':
                System.out.println("selected option 4");
                break;
            case '5':
                System.out.println("selected option 5");
                break;
        }
    }
}

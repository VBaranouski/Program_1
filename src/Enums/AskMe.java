package Enums;

/**
 * Created by Vlad on 7/27/17.
 */
public class AskMe {

    public static void answer (Answers result){
        switch(result){
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case NEVER:
                System.out.println("Never");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
            break;
        }
    }
}

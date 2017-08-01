package Enums;
import java.util.Random;

/**
 * Created by Vlad on 7/27/17.
 */

enum Answers{NO, YES, MAYBE, LATER, SOON, NEVER}

public class Question {
    Random rand = new Random();
    public Answers ask() {
        int prob = (int) (100 * rand.nextDouble());
        System.out.print(prob + " ");

        if (prob < 15)
            return Answers.MAYBE;
        else if (prob < 30)
            return Answers.NO;
        else if (prob < 60)
            return Answers.YES;
        else if (prob < 90)
            return Answers.LATER;
        else if (prob < 98)
            return Answers.SOON;
        else
            return Answers.NEVER;
    }

}

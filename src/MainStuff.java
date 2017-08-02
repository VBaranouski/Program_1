import StringStuff.Stringer;

import java.io.IOException;

/**
 * Created by Vlad on 7/17/17.
 */


enum Apple {
    Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);
    private int price;

    Apple(int p) {
        price = p; }
    Apple(){
        price = 0;}

    int getPrice() {
        return price; }
}


public class MainStuff {
    public static void main(String args[]) throws IOException {

      //  Arrays text = new Arrays();
      //  Arrays season = new Arrays();
      //  Arrays doWhileSwitch = new Arrays();

     /*  int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        Arrays array1 = new Arrays();
        //Showing array
        array1.showArray(monthDays);

        //Sorting
        array1.bubbleSorting(monthDays);
        text.showMessage(" ");
        text.showMessage("After Sorting: ");

        //Show sorted array
        array1.showArray(monthDays);

        //Calculate average
        text.showMessage(" ");
        text.showMessage("Average value is: ");
        array1.calculateAverage(monthDays);

                                                 //*********For-each
        array1.calculatePartArray(monthDays);

        //Case & Switch
        season.seasonCheck(113);
        season.seasonCheckViaCase(10);

        //Do While Switch - input from console
        //doWhileSwitch.selectFromConsoleDoWhile();



                                        //**************Boxes
        Boxes firstBox = new Boxes();
        Boxes secondBox = new Boxes();

        firstBox.setValues(4,3.4,8);
        secondBox.setValues(2.3,4,9);

        double vol1,vol2;
        vol1 = firstBox.volume();
        vol2 = secondBox.volume();

        System.out.println(vol1 + " " + vol2);

       */

       /*
                                          //***********Return object
        ObjectReturn ob1 = new ObjectReturn(2);
        ObjectReturn ob2;

        ob2 = ob1.incrByTen();
        System.out.println(ob1.a + " " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println(ob1.a + " " + ob2.a);

                                     //****************Recursion - get factorial value
        RecursionFactorial rf = new RecursionFactorial();
        System.out.print(rf.factorial(10));

                                             //*************inheritance
        A superObj = new A();
        B obj = new B();

        superObj.showij(4,19);
        obj.showk(3);
        obj.sum(1,5,10);

        */


        /*
                                        //************Redifinition of methonds - area()
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle (3,5);
        Triangle t = new Triangle(3,4);

        Figure reference;

        reference = r;
        System.out.println(reference.area());

        reference = t;
        System.out.println(reference.area());

        reference = f;
        System.out.println(reference.area());


                                            //****************Interfaces
        A.NestedIF nif = new B();
        if(nif.isNotNegative(10))
            System.out.println("Not negative");
        if(nif.isNotNegative(-12))
            System.out.println("not visible");


        */

        /*

         /*
                            //******************Execptions

        SimpleTryCatch smc = new SimpleTryCatch();
        smc.devison(0);

        //Try / Catch / New Exception
        try {
            exThrowExample();
        }
        catch (NullPointerException e){
            System.out.println(" second catch " + e);
        }

        //Throws in method
        try {
            exThrowSecond();
        }
        catch (IllegalAccessException e){
            System.out.println(" second catch " + e);
        }
        */



                            //****************Thread

        /*
        Thread t = Thread.currentThread();
        //t.setName("Vlad first Thread");
        t.getName();
        t.setPriority(3);
        System.out.println(t);
        try {
            for (int i = 3; i > 0; i--) {
                System.out.println(i);
                t.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        */

        /*
                                //************Multi-threads

        NewThreadFirst threadOne = new NewThreadFirst("First");
        NewThreadFirst threadTwo = new NewThreadFirst("Second");
        ThirdThread threadThree = new ThirdThread("Third");
        FourthThread threadFour = new FourthThread("Fourth");

        System.out.println("Thread One has started? : " + threadOne.t.isAlive());
        System.out.println("Thread Two has started? : " + threadTwo.t.isAlive());
        System.out.println("Thread Three has started? : " + threadThree.t.isAlive());
        System.out.println("Thread Four has started? : " + threadFour.t.isAlive());

        try {
            System.out.println("Waiting for finish");
            threadOne.t.join();
            threadTwo.t.join();
            threadThree.t.join();
            threadFour.t.join();
            }

        catch (InterruptedException e) {
            System.out.print("Main thread is interrupted");
        }
        System.out.println("Main Thread is completed");


                         //*************Synchronized
        /*
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target, "Welcome");
        Caller ob2 = new Caller(target, "World");
        Caller ob3 = new Caller(target, "To synchronized");

        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();

        } catch (InterruptedException e) {

            System.out.print("Interrupted");
        }
        */


        /* Enum
        //Apple ap;
        //ap = Apple.RedDel;
        //ap = Apple.valueOf("Winesap");
        //Apple allapples[] = Apple.values();

        for (Apple a: Apple.values()){
            System.out.print(a.ordinal()+1 + " " + a + ": " + a.getPrice() + "; ");
        }
        */

                         //***************Enum + switch
        /*
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        */


                            //***********Annotations
        //myMeth();
       //mySecondMeth();
       // showAnno();

                             //***********BUFFER READER
        //readBufferChar();
        //readBufferLine();


                            //************Srting

        Stringer s = new Stringer();
        s.stringCreator(); //cool

    }


}



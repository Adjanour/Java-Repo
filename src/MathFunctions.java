import java.util.Date;
import java.util.Random;

public class MathFunctions {
    static boolean isStudent;
    //explore math methods and develop simple programs with each
    public static void main(String[] args) {
        //Constants
        System.out.println(Math.PI);
        System.out.println(Math.E);

        //Take note of value of PI wanting to be used
        System.out.println(2*Math.PI);

        //TRIG FUNCTIONS
        System.out.println((int)Math.cos(Math.toRadians(90)));
        System.out.println((int)Math.sin(Math.toRadians(90)));

        //ASSIGNMENT asin, acos , atan
        //Showing the periodic nature of trig functions
        System.out.println(Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45)))));

        System.out.println(Math.exp(5));
        System.out.println(Math.log(15));//natural log of 15
        //find out what log1p means
        //Returns the natural logarithm of the sum of the argument and 1
        Math.log1p(5);
        //find out how to find log to any base (base 2)

        //play with the syntax and possibilities

        //use pow for roots
        System.out.println("Roots greater than 3");
        System.out.println(Math.pow(25,(double)1/7));

        //ROUNDING METHODS
        System.out.println("Rounding Methods");
        System.out.println("Ceil: "+ Math.ceil(89.7952));
        System.out.println("Floor: "+ Math.floor(89.7952));
        System.out.println("Round: "+ Math.round(89.7952));
        System.out.println("Rint: "+ Math.round(89.7952));
        System.out.println(" ");

        System.out.println("Ceil: "+ Math.ceil(89.1952));
        System.out.println("Floor: "+ Math.floor(89.1952));
        System.out.println("round: "+ Math.round(89.1952));
        System.out.println("Rint: "+ Math.round(89.1952));

        System.out.println(String.format("%.3f",1.0/3.0));

        //Why round calls floor adding 0.5
        System.out.printf("%.3f",1.0/3.0);
        System.out.println("");

        double x = 1.0/3;
        // incorect
//        double x1 = (x * 100)/100;
//        System.out.println(x1);
        //there are a lot of gotchas in java
        double x1 = Math.round(x*100)/100.0;
        System.out.println(x1);

        //Investigate ways to find to any decimal place
        System.out.println();

        //Random Number Generator
        double randNum = Math.random();
        System.out.println(randNum*3.0);

//        Random number = new Random();

        //pay attention to datatypes returned by methods and operations
        System.out.println(Utils.toDecimalPlace(1.0/3.0, 5));
        Date date = new Date();
        System.out.println(date);
        System.out.println(isStudent);


        timeConversion.getIndividualDates(date.getTime()*100);
    }

}

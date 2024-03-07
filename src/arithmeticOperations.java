import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class arithmeticOperations {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        double dec1 = 2.3;
        double dec2 = 3.5;

        System.out.println("Int + Int: "+(num1+num2));//=> Integer
        System.out.println("Dec + Dec: "+(dec1+dec2));//=> Decimal
        System.out.println("Dec + Int: "+(dec1+num2));//=> Decimal

        System.out.println("Int - Int: "+(num1-num2));//=> Integer
        System.out.println("Dec - Dec: "+(dec1-dec2));//=> Decimal
        System.out.println("Dec - Int: "+(dec1-num2));//=> Decimal


        System.out.println("Int * Int: "+(num1*num2));//=> Integer
        System.out.println("Dec * Dec: "+(dec1*dec2));//=> Decimal
        System.out.println("Dec * Int: "+(dec1*num2));//=> Decimal


        //Whatever value after the decimal place is truncated
        System.out.println("Int / Int: "+(num1/num2));//=> Integer
        System.out.println("Dec / Dec: "+(dec1/dec2));//=> Decimal
        System.out.println("Dec / Int: "+(dec1/num2));//=> Decimal

        System.out.println("Int % Int: "+(num1%num2));//=> Integer
        System.out.println("Dec % Dec: "+(dec1%dec2));//=> Decimal
        System.out.println("Dec % Int: "+(dec1%num2));//=> Decimal

        System.out.println(3 * 6 % 5 + 6 / 3 - 8 );

        //standard output device is the monitor or console (System.out)
        //standard input device is the keyboard (System.in)
        //Scanner / BufferedReader helps create objects from System.in to allow capture input from the kwyboard
        //Read on BufferedReader
        //6 numeric datatype
        //5 operators



    }
}
//Can a String be converted into a numeric datatype => Yes

import java.util.Scanner;

public class Selections {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numToTest;

        System.out.print("Enter an integer: ");
        numToTest = input.nextInt();
        input.nextLine();

       if (numToTest % 2 == 0) {
           if (numToTest > 0) {
               System.out.println("The number is even and positive.");
           } else {
               System.out.println("The number is odd and negative.");
           }
       } else {
           System.out.println("The number is odd.");
       }


        input.close();
    }
}

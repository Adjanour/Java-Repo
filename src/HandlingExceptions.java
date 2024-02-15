import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingExceptions {

    public static void main(String[] args) {
        //Scanner to read input
        Scanner input = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;

        int tries = 3;
        while (true) {
            System.out.println("You have "+tries+ (tries == 1 ? " try ":" tries ")+"left");

            if (tries == 0)
                break;

            tries--;

            while (true) {
                try {
                    System.out.print("Enter Value for x: ");
                    x = input.nextInt();

                    //Why cant u use false here
                    break;
                } catch (InputMismatchException e) {
                    input.nextLine();
                    System.out.println("Value entered is not an int");
                }
            }

            while (true) {
                try {
                    System.out.print("Enter Value for y: ");
                    y = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    input.nextLine();
                    System.out.println("Value entered is not an int");
                }
            }

            try {
                z = x/y;
                System.out.println(x+"/"+y+" = "+z);
                break;
            } catch (Exception e) {
                System.out.println("Division by zero not allowed");
            }
        }




    }
}

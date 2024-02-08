import java.util.Scanner;

public class SumOfDoubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double thirdNumber = scanner.nextDouble();

        // Add the numbers
        double sum = firstNumber + secondNumber + thirdNumber;

        // Convert to integer
        int sumAsInteger = (int) sum;

        System.out.println("Sum as integer: " + sumAsInteger);
    }
}

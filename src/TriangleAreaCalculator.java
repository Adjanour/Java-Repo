import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the length of the triangle
        System.out.print("Enter the length of the triangle: ");
        int length = scanner.nextInt();

        // Ask the user for the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Compute the area of the triangle using the formula: area = 0.5 * base * height
        double area = 0.5 * length * height;

        // Display the computed area of the triangle
        System.out.println("The area of the triangle with length " + length +
                " and height " + height + " is: " + area);

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}

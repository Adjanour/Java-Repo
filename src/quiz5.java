import java.util.Scanner;

public class quiz5 {
    public static void main(String[] args) {
        double s = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of side of the hexagon: ");
        s = input.nextDouble();
        double Area = (6*Math.pow(s, 2))/(4*Math.tan(Math.PI/6));

        System.out.println("The area of the hexagon is: "+Area);

        input.close();
    }
}

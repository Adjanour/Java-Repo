public class LogarithmExample {
    public static void main(String[] args) {
        // Define the base and the number for which you want to find the logarithm
        double base = 2.0;
        double number = 8.0;

        // Calculate the logarithm to the specified base
        double result = Math.log(number) / Math.log(base);

        // Print the result
        System.out.println("Logarithm to the base " + base + " of " + number + " is: " + result);
    }
}

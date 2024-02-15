public class DivisionResult {
    public static void main(String[] args) {
        int dividend = 2;
        int divisor = 6;

        // Perform division
        double result = (double) dividend / divisor;
        String resultString = String.valueOf(result);
        resultString.substring(0, 4);

        // Format the result to two decimal places
        String formattedResult = String.format("%.2f", result);

        System.out.println("Result of division: " + formattedResult);
    }
}

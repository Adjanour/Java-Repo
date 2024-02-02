import java.util.Scanner;

//Using Integer.parseInt on a double:
//
//        No, you cannot directly use Integer.parseInt on a double. This method is designed to parse strings that represent integer values. If you try to parse a string containing a decimal point into an integer, it will throw a NumberFormatException.
//        Use of String.valueOf() on an int or double:
//
//        The String.valueOf() method is used to convert different types of values, including integers and doubles, into their string representations. It's a convenient way to convert numerical values to strings so that you can concatenate them with other strings or display them in a user interface.
import java.util.Scanner;

public class Calculator {

    // Enum for arithmetic symbols with corresponding string representations
    enum Symbols {
        ADD("+"), SUB("-"), MUL("*"), DIV("/"), MOD("%");

        private final String SYMBOL;

        // Constructor to associate the string representation with each symbol
        Symbols(String symbol) {
            this.SYMBOL = symbol;
        }

        // Getter method to retrieve the string representation of the symbol
        public String getSymbol() {
            return SYMBOL;
        }
    }

    public static void main(String[] args) {
        int count = 0;
        int count2 = 0;
        double num1 = 0;
        double num2 = 0;
        double result;
        String outputResult = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Calculator");

        // Input validation for the first number
        while (count < 1) {
            try {
                System.out.print("Enter the first number: ");
                num1 = Double.parseDouble(input.nextLine());
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // Input validation for the second number
        while (count2 < 1) {
            try {
                System.out.print("Enter the second number: ");
                num2 = Double.parseDouble(input.nextLine());
                count2++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        System.out.println("These are the arithmetic symbols you can use: ADD, SUB, MUL, DIV, MOD");
        System.out.print("Enter the symbol: ");

        // Handling invalid input for the symbol
        Symbols symbol;
        try {
            symbol = Symbols.valueOf(input.nextLine().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid symbol. Please enter a valid arithmetic operation.");
            return;
        }

        // Performing the selected arithmetic operation
        switch (symbol) {
            case ADD -> result = num1 + num2;
            case SUB -> result = num1 - num2;
            case MUL -> result = num1 * num2;
            case DIV -> result = num1 / num2;
            case MOD -> result = num1 % num2;
            default -> {
                System.out.println("Unexpected error occurred. Please try again.");
                return;
            }
        }

        // Formatting and displaying the result
        outputResult = String.format("Result: %.2f %s %.2f = %.2f", num1, symbol.getSymbol(), num2, result);
        System.out.println(outputResult);

        // Closing the Scanner to avoid resource leaks
        input.close();
    }
}


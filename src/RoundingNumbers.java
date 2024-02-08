public class RoundingNumbers {
    public static void main(String[] args) {
        double num1 = 4.53;
        double num2 = -3.1;

        // Using ceil method
        double ceilNum1 = Math.ceil(num1);
        double ceilNum2 = Math.ceil(num2);

        // Using floor method
        double floorNum1 = Math.floor(num1);
        double floorNum2 = Math.floor(num2);

        // Using round method
        long roundNum1 = Math.round(num1);
        long roundNum2 = Math.round(num2);

        System.out.println("Original number 1: " + num1);
        System.out.println("Ceil of number 1: " + ceilNum1);
        System.out.println("Floor of number 1: " + floorNum1);
        System.out.println("Round of number 1: " + roundNum1);

        System.out.println("\nOriginal number 2: " + num2);
        System.out.println("Ceil of number 2: " + ceilNum2);
        System.out.println("Floor of number 2: " + floorNum2);
        System.out.println("Round of number 2: " + roundNum2);
    }
}

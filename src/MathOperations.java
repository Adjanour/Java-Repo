public class MathOperations {
    public static void main(String[] args) {
        // Absolute value
        int absoluteValue = Math.abs(-10);
        System.out.println("Absolute Value: " + absoluteValue);

        // Square root
        double squareRoot = Math.sqrt(25);
        System.out.println("Square Root: " + squareRoot);

        // Power (exponential)
        double powerResult = Math.pow(2, 3);
        System.out.println("Power: " + powerResult);

        // Ceil (round up)
        double ceilValue = Math.ceil(7.3);
        System.out.println("Ceil Value: " + ceilValue);

        // Floor (round down)
        double floorValue = Math.floor(7.8);
        System.out.println("Floor Value: " + floorValue);

        System.out.println(Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45)))));

        Character.isDigit('A');
        String myName = "  John  ";
        myName = myName.concat(" Smith");
        myName.trim();
        System.out.println(myName);
        double acos = Math.acos(Math.cos(Math.toRadians(45)));
        System.out.println(acos);
        System.out.println(Utils.toDecimalPlace(acos,5));
        // When to use next and nextLine()
        // Learn to compare two strings based on the above table
        // When to use the various string methods


    }
}

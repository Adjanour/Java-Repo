public class NumericTypeCasting {
    public static void main(String[] args) {
        int age= 18;
        double height = 23.998;

        //String data types
        String weight = "1.34567";
        String weight1 = "28394";

        //CONVERSION
        int newHeight = (int) height;
        double newAge = (double) age;
        System.out.println(newAge+" "+newHeight);

        int newWeight = Integer.parseInt(weight);
        double newWeight1 = Double.parseDouble(weight);
    }
}
// InputMismatchException
// NumberFormatException

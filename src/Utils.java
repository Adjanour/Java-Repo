public class Utils {
    /**
     * Returns the given number rounded to the specified decimal place.
     *
     * @param number the number to round
     * @param decimalPlaces the decimal place to round to
     * @return the rounded number
     */
     public static double  toDecimalPlace(double number, double decimalPlaces) {
        return (double) Math.round(number * Math.pow(10, decimalPlaces)) / Math.pow(10, decimalPlaces);
    }

}

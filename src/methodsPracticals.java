import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class methodsPracticals {
    public static void main(String[] args) {

        ArrayList<Double> stdMarks = new ArrayList<>();
        multiplesOfThreeAndFour(stdMarks);
        System.out.println(stdMarks);
        print(stdMarks);

        System.out.println(multiply(99,98,77));
        System.out.println(sumOfElements(stdMarks));
        System.out.println(sumWithinRange(45,60));
        System.out.println(sumWithinRangeWithCondition(45,60));

        System.out.println(sumWithinRange(0,100));

    }

    private static void multiplesOfThreeAndFour(ArrayList<Double> array) {
        for (int i = 1; i < 100; i++) {
            if ((i%3==0) && (i%4==0)) {
                array.add((double) i);
            }
        }
    }
    //passing by reference or value

    public static void print(ArrayList<Double> arrayList){
        for (double element : arrayList){
            System.out.println(element);
        }
    }

    /**
     * Calculates the sum of all the elements in an arraylist
     * @param arrayList the array list
     * @return the sum of the elements in the array
     */
    public static double sumOfElements (ArrayList<Double> arrayList){
        double sum = 0;
        for(double element: arrayList){
            sum += element;
        }
        return sum;
    }

    public static int multiply(int num1,int num2,int num3){
        return num1 * num2 * num3;
    }

    /**
     * Reads the content of a file
     * @param file
     * @param filePath
     */
    public static void readFromFile(File file, String filePath){
        File inputFile = new File(filePath);
        if (!inputFile.exists()){
            System.out.println("File does not exist");
        }
        try {
            Scanner input = new Scanner(inputFile);

            while (input.hasNext()){
                System.out.println(input.nextLine());
            }

            input.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public  static  void  writeToFile(String filePath,String content){
        try {
            try(PrintWriter outputFile = new PrintWriter(filePath)){
                outputFile.println(content);
            };
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Calculates the sum of numbers within a specified range
     * @param start number to begin from
     * @param end number to end at
     * @return sum of numbers
     */
    public  static  int sumWithinRange(int start, int end){
        int sum = 0;
        int temp = 0;
        if (start > end){
            temp = start;
            start = end;
            end = temp;
        }
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static  int sumWithinRangeWithCondition(int start, int end){
        int sum = 0;
        int temp = 0;
        if (start > end){
            temp = start;
            start = end;
            end = temp;
        }
        for (int i = start; i <= end; i++) {
            if (checkIfMultipleOfThree(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static boolean checkIfMultipleOfThree(int num){
        return (num % 3 == 0) && (num % 4 == 0);
    }

}

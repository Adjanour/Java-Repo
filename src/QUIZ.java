import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QUIZ {
    public static void main(String[] args) throws FileNotFoundException {
        
        double[] arr = new double[8];
        File quizFile = new File("C:\\CE-277-JAVA\\Java2024\\quiz.txt");
        Scanner input = new Scanner(quizFile);
        PrintWriter output = new PrintWriter("C:\\CE-277-JAVA\\Java2024\\quizDone.txt");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }

        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            output.println(arr[i]);
        }
        ArrayList<String> a = new ArrayList<>();
        a.clear();
        a.add(0,"Hello");

        System.out.println();

        input.close();
        output.close();
    }
}

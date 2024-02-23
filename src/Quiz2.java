import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) throws FileNotFoundException {
        File quizFile = new File("C:\\CE-277-JAVA\\Java2024\\quiz.txt");
        Scanner input = new Scanner(quizFile);
        PrintWriter output = new PrintWriter("C:\\CE-277-JAVA\\Java2024\\quizDone.txt");

        ArrayList<Integer> newArray = new ArrayList<>();

        while(input.hasNext()){
            newArray.add(input.nextInt());
        }
        // Arrays.sort(newArray.toArray());

        for (Integer number : newArray) {
            output.println(number);
        }

        output.close();
        input.close();


    }
}

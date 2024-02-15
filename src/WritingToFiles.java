import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class WritingToFiles {
    public static void main(String[] args) throws FileNotFoundException {
//        File outputFile = new File("output.txt");
        File inputFile = new File("text.txt");

        Scanner input = new Scanner(inputFile);
        //creates the file if not exists
        PrintWriter output = new PrintWriter("output.txt");

        //we can not read and write concurrently
        while (input.hasNextLine()){
            output.println(input.nextLine().toUpperCase());
        }

        input.close();
        output.close();
    }
}

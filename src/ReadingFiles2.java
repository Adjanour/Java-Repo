import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFiles2 {
    public static void main(String[] args) throws IOException {

        File inputFile = new File("text.txt");
        Scanner input = null;

        try {
            input = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        while (input.hasNext()){
            if(input.hasNextInt()){
                int x = input.nextInt();
                System.out.println(x+" : is an int");
            } else if (input.hasNextDouble()) {
                double x = input.nextDouble();
                System.out.println(x+" : is a double");
            } else if (input.hasNextBoolean()) {
                boolean x = input.nextBoolean();
                System.out.println(x+" : is a boolean");
            }else
                System.out.println(input.next()+" : is a string");

        }
        //Study how to manipulate pdf's , csv, excel and word files

        input.close();
    }
}

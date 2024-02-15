import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.*;
import java.util.Scanner;

public class FileClasses {
    public static void main(String[] args) throws FileNotFoundException {
        FileSystem fs = FileSystems.getDefault();
        Path filePath = Paths.get("C:\\Users\\Desktop\\text.txt");
        File inputFile = new File("C:\\CE-277-JAVA\\Java2024\\text.txt");

        Scanner input = new Scanner(inputFile);


//        while(input.hasNext()){
//            String [] characters = input.nextLine().split("\n");
//            for (String character : characters) {
//                System.out.println("working2");
//                System.out.println(character);
//            }
////            System.out.println(characters.length);
////            System.out.println("working");
////            String line = input.nextLine();
////            System.out.println(line);
//        }

        while (input.hasNext()){
            String line = input.nextLine();
            System.out.println(line);
        }

        input.close();
    }
}

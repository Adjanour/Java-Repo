import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFIles {
    public static void main(String[] args) throws IOException {

        File inputFile = new File("text.txt");
        File desktopFIle = new File("C:\\Users\\Desktop\\text.txt");
        File filetoDelete = new File("textdelete.txt");
        //Check possible methods we can use to manipulate the file
        System.out.println(inputFile.exists());
        System.out.println(desktopFIle.exists());
        System.out.println(filetoDelete.exists());
        System.out.println(inputFile.getTotalSpace());
        //diff between absolute and cannonical path
        System.out.println(inputFile.getAbsolutePath());
        System.out.println(inputFile.getCanonicalPath());


        //check size
        System.out.println(inputFile.length() < 1 ? "bytes":"byte");

        //delete
        System.out.println(filetoDelete.delete() ? "file deleted successfully":"file not deleted");

        //Scanner helps access contents of the file
        Scanner input = new Scanner(inputFile);

        while (input.hasNextLine()){
            System.out.println(input.nextLine().toUpperCase());
            System.out.println("run");
//            String line = input.nextLine();
////            System.out.printf("%s , %d",text,text.length());
//            System.out.println(line);
        }

        input.close();
    }
}

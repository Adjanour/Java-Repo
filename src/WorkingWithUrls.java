import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WorkingWithUrls {
    public static void main(String[] args) throws IOException {
        String content = "";
        URL web = null;
        try {
             web = new URL("https://adjarnor.tech/");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        Scanner input = null;
        try {
            input = new Scanner(web.openStream());

        }catch (Exception e){
            System.out.println("Do nothing");
        }

        while (input.hasNextLine()){
            content = content.concat(input.nextLine());
        }

        WorkingWithUrls.writeToFile("out.html",content);
        input.close();
    }

    public static void writeToFile(String filePath, String Content) throws FileNotFoundException {
        try (PrintWriter output = new PrintWriter(filePath)) {
            output.println(Content);
        }


    }
}

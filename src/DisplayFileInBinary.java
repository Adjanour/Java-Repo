import java.io.FileInputStream;
import java.io.IOException;

public class DisplayFileInBinary {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Kirk\\Pictures\\_9f2996d8-c13c-449a-b989-7babd29ee1a4.jpeg";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                String binaryString = Integer.toBinaryString(byteRead);
                // Ensure each byte is represented by 8 bits
                binaryString = String.format("%8s", binaryString).replace(' ', '0');
                System.out.print(binaryString + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

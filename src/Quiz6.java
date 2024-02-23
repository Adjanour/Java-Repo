import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = "";


        System.out.print("Enter word: ");
        userInput = input.nextLine();

        char[] arr = userInput.toCharArray();

        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i]);
        }

    }
}

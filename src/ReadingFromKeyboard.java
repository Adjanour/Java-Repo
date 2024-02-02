import java.util.Scanner;

public class ReadingFromKeyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //create variable to store username
        //can be initialized to null
        String username;
        String hostelName;
        int userAge;

        //ask user to enter name
        System.out.print("Please enter your name: ");
        //read text typed by user
        username = input.nextLine();

        //ask user to enter age
        System.out.print("Enter your age as a number: ");
        //read user age
        userAge = input.nextInt();
        //read from next line of input
        input.nextLine();

        //ask user to enter hostel
        System.out.print("Hostel: ");
        hostelName = input.nextLine();

        //display welcome message
        System.out.println(username+":"+userAge+":"+hostelName);

        //close scanner variable
        input.close();
    }
}

//diff btn next() and nextLine()
//with next a space acts as a delimiter where the next reads only the first input before the empty space

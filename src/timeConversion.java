import java.util.Scanner;

public class timeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long timeEntered;

        System.out.print("Enter the time in seconds: ");
        timeEntered = input.nextLong();
        input.nextLine();


        getIndividualDates(timeEntered);

        input.close();
    }

    public static void getIndividualDates(long timeEntered) {
        // extract total mins from time entered
        int totalMins = (int) (timeEntered / 60);

        // extract remaining seconds
        int remSeconds = (int) (timeEntered % 60);

        // extract total hours from remaining minutes
        int totalHours = totalMins / 60;

        // extract remaining minutes
        int remMinutes = totalMins % 60;

        // extract total days from remaining hours
        int totalDays = totalHours / 24;

        // extract remaining hours
        int remHours = totalHours % 24;

        // extract total years from remaining days
        int totalYears = totalDays / 365;

        // extract remaining days
        int remDays = totalDays % 365;

        // display results to users
        System.out.println("Years: " + totalYears);
        System.out.println("Days: " + remDays);
        System.out.println("Hours: " + remHours);
        System.out.println("Minutes: " + remMinutes);
        System.out.println("Seconds: " + remSeconds);
    }
}

import java.util.Scanner;

public class UMaTGrades {
    //Double + float = Double
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mark = 0;

        float mark1 = 0.1F;
        double mark2 = 2;
        float result = (float) (mark2 + mark1);
        System.out.println(result);
        System.out.println(mark1);


        System.out.print("Enter your mark: ");
        mark = input.nextDouble();
        input.nextLine();

        if (mark >= 80.0 ){
            System.out.println(mark + " is first class");
        }else if ( (mark >= 70.0) && (mark < 80.0)){
            System.out.println(mark + " is second class upper");
        }else if ((mark >= 60.0) && (mark < 70.0)){
            System.out.println(mark + " is  second class lower");
        }else if ((mark >= 50.0) && (mark < 60.0)){
            System.out.println(mark + " is pass");
        }else {

        }



        input.close();
    }
}

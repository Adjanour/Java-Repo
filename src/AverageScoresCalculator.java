import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AverageScoresCalculator {
    public static void main(String[] args) {
        int numberOfScores = 0;
        int count = 0 ;
        double score = 0;
        double total = 0.0;
        String userName = "";
        final double QUIT = 999 ;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name >> ");
        userName = input.nextLine();
        System.out.println("How many scores are you entering >> ");
        numberOfScores = input.nextInt();

        final int MAX_SCORES = numberOfScores ;
        double[] scores = new double[MAX_SCORES];

        System.out.print("Enter quiz score or " + QUIT + " to quit >> ");

        score = input.nextDouble();

        while(score != QUIT){
            scores[count] = score;
            total += score;
            ++count;
            if (count == MAX_SCORES){
                score = QUIT;
            }else{
                System.out.println("Enter next quiz score or " + QUIT + " to quit >> ");
                score = input.nextDouble();
            }
        }
        ArrayList list = new ArrayList();
        Collections.sort(list);
        

    }
}

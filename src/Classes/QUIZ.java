package Classes;

import java.util.Scanner;

public class QUIZ {
    public static void main(String[] quiz) {

        extracted();


        int[][] content = {{3,80},{2,93},{1,75},{3,82}};

            double semesterSum = 0;
            int totalCredit = 0;

            for (int[] ints : content) {
                    semesterSum += ints[0] * ints[1];
                    totalCredit += ints[0];
            }
        Result result = new Result(semesterSum, totalCredit);

        System.out.println("Total Credit is "+ result.totalCredit());

            System.out.println("Total sum " + result.semesterSum());

            double average =  result.semesterSum() / result.totalCredit();

            System.out.println("Semester Average is "+average);




    }

    private static void extracted() {
        for (int i = 10; i < 501 ; i++) {
            if ((i%3==0)&&(i%4==0)&&(i%5 != 0)){
                System.out.println(i);
            }
        }
    }

    private record Result(double semesterSum, int totalCredit) {
    }
}

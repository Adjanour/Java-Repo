// Created: 2024-21-02T20:00:00
// Leaning Java Arrays
import java.util.Arrays;

public class StudentGradeTracker {

    public static void main(String[] args) {
        
        //Declare a jagged array with 5 rows of arrays each with different number of columns
        double[][]  grades = {
            { 90, 85, 95, 100, 100, 100},
            { 100, 100, 100, 100, 100 },
            { 80, 85, 90, 95, 100 },
            { 70, 75, 80, 85, 90 },
            { 60, 65, 70, 75, 80 }
        };

        // Declare an array of subjects
        String[] subjects = {"Math", "English", "Kiswahili", "Science", "Social Studies"};

    //     double[][] grades2 = new double[5][2];

    //    System.out.println(Arrays.deepToString(grades));
    //    System.out.println(Arrays.deepToString(grades2));
    //    System.out.println(grades[4].length);

       for (int sub = 0; sub < grades.length; ++sub){
        
        for (double[] stdGrades : grades) {
            double total = 0;
            for (double stdGrade : stdGrades) {
                total += stdGrade;
            }
            System.out.println("Total for subject " + subjects[sub] + " is " + total);
            System.out.println("Average for subject " + subjects[sub] + " is " + total/grades[sub].length);
            System.out.println(" ");
        }
       
       }
       
        
    }
}
// Created: 2024-21-02T20:00:00
// Leaning Java Arrays
import java.util.Arrays;
import java.util.Scanner;

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

       // Main task
       int noOfStudents = 0;
       int noOfSubjects = 0;
    //    int noOfTotals = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
            noOfStudents = input.nextInt();
        System.out.print("Enter the number of subjects: ");
            noOfSubjects = input.nextInt();
        
            input.nextLine();
        
        double[][] stdGrades = new double[noOfStudents][noOfSubjects];
        double[] stdTotals = new double[noOfStudents];
        double[] stdAverages = new double[noOfStudents];
        String[] subjectNames = new String[noOfSubjects];
        String[] studentNames = new String[noOfStudents];

        // for (int std = 0; std < noOfStudents; ++std) {
        //     for (int sub = 0; sub < noOfSubjects; ++sub) {
        //         System.out.println("Enter the grade for student " + (std + 1) + " in subject " + (sub + 1) + ": ");
        //         stdGrades[std][sub] = input.nextDouble();
        //     }
        // }
        final int MAX_SUBJECTS = noOfSubjects;
        final int MAX_STUDENTS = noOfStudents;
        int count = 1;
        int count2 = 1;

        System.out.print("Enter the " + count + (count == 1 ? "st" : count == 2 ? "nd" : count == 3 ? "rd" : "th") + " subject name: ");
            subjectNames[count - 1] = input.nextLine();
            ++count;
        while (true) {
            System.out.print("Enter the " + count + (count == 1 ? "st" : count == 2 ? "nd" : count == 3 ? "rd" : "th") + " subject name: ");
            subjectNames[count - 1] = input.nextLine();
            ++count;
            if (count - 1 == MAX_SUBJECTS) {
                break;
            }
        }

        System.out.println(" ");

        System.out.print("Enter the " + count2 + (count2 == 1 ? "st" : count2 == 2 ? "nd" : count2 == 3 ? "rd" : "th") + " student's name: ");
            studentNames[count2 - 1] = input.nextLine();
            ++count2;
        while (true) {
            System.out.print("Enter the " + count2 + (count2 == 1 ? "st" : count2 == 2 ? "nd" : count2 == 3 ? "rd" : "th") + " student's name: ");
            studentNames[count2 - 1] = input.nextLine();
            ++count2;
            if (count2 - 1 == MAX_STUDENTS) {
                break;
            }
        }
        System.out.println(" ");
        for (int std = 0; std < noOfStudents; ++std) {
            for (int sub = 0; sub < noOfSubjects; ++sub) {
                System.out.print("Enter the grade for student " + studentNames[std] + " in subject " + subjectNames[sub] + ": ");
                stdGrades[std][sub] = input.nextDouble();
            }
        }

        System.out.println(" ");

        for (int std = 0; std < noOfStudents; ++std) {
            double total = 0;
            for (int sub = 0; sub < noOfSubjects; ++sub) {
                total += stdGrades[std][sub];
            }
            stdTotals[std] = total;
            stdAverages[std] = total / noOfSubjects;
        }

        System.out.println("Student Name\t\tTotal\t\tAverage");
        for (int std = 0; std < noOfStudents; ++std) {
            System.out.println(studentNames[std] + "\t\t" + stdTotals[std] + "\t\t" + stdAverages[std]);
        }
        System.out.println("Total for all students: " + Arrays.stream(stdTotals).sum());
        System.out.println("Average for all students: " + Arrays.stream(stdAverages).average().getAsDouble());

        input.close();
        
    }
}
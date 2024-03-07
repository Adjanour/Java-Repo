import java.util.Arrays;

public class PracticalArrays {
    public static void main(String[] args) {

        // Learning about Arrays
        double marks[] = new double[5];
        double[] otherMarks = new double[8];
        int[] ages = new int[6];

        String[] stdNames = new String[10];
        boolean[] verification = new boolean[10];

        double[] scores = { 3.0, 4.5, 6.2, 5.6, 5.3, 2, 4.0, 7.98, 0.0 };


        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(stdNames));
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(verification));
        System.out.println(Arrays.toString(otherMarks));
        System.out.println(Arrays.toString(ages));

        System.out.println("\nAfter Updating the arrays");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = Utils.toDecimalPlace(Math.random() * 10, 2);
        }
        for (int i = 0; i < stdNames.length; i++) {
            stdNames[i] = "student" + " " + i;
        }

        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println(" ");
        for (String student : stdNames) {
            System.out.print(student + " ");
        }

        // COPY A SINGLE DIMENSIONAL ARRAY
        // Using reference
        System.out.println("\n\nBefore copying - Pointing to same array");
        System.out.println(Arrays.toString(marks));
        double[] copyMarks = marks;
        System.out.println(Arrays.toString(copyMarks));
        System.out.println("\nMaking changes to copy");
        copyMarks[0] = 1000;
        System.out.println(Arrays.toString(copyMarks));
        System.out.println(Arrays.toString(marks));

        double[] clonemarks = marks.clone();
        // Sorting an array
        System.out.println("\n\nBefore sorting");
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(clonemarks));
        System.out.println("After sorting");
        Arrays.sort(marks);
        Arrays.sort(clonemarks, 4, 9);
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(clonemarks));

    }
}

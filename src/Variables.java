import static java.lang.String.valueOf;

public class Variables {
    float height;
    //enums are created as constants(ie. final)
    enum Course {CE,CY,IS}

    public static void main(String[] args) {
        int  studentAge = 46;
        double hostelDistance = 9.45;
        float height;
        height = 20;
        String studentName = "Selasi";
        
        String studentHostel = "Camp City";
        System.out.println(studentAge);
        System.out.println(hostelDistance);
        System.out.println(height);


        System.out.println(studentName + studentHostel);

        //Constants
        //Constant values have to be initialized
        final int YearOfBirth = 1974;
        int age  = 2024 - YearOfBirth;
        Course studentCourse = Course.CE;
        System.out.println(studentCourse);
        System.out.println(age);

    }
}
// Memory is allocated during initialization
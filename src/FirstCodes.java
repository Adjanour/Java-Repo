
import Classes.Student;

import java.util.ArrayList;
import java.util.List;


public class FirstCodes {
    //CREATE MAIN METHOD FOR OUR PROGRAM
    //psvm + TAB KEY
    // public static void main(String[] args) {
    //     //sout + TAB KEY
    //     System.out.println("It works!");
    // }
    // byte l = 5;
    // int a = 1;
    // String b = "2";
    // int j, k = 3 ;
    // String studentName="Him",personnelName="",staffName="";
     public static void main(String[] args) {
        rectangular r1 = new rectangular(20.0,10.0);
        System.out.println(r1.Area());

        Student s1 = new Student("Kirk Katamanso", 2005, "CE", "Agomeda",
         "Computer Science and Engineering", 2, "Castle Gate", 89.54, "male", "FOE.41.008.088.22");

        Student s2 = new Student("Deborah Katamanso", 2005, "CE", "Agomeda","Computer Science and Engineering", 2, "Castle Gate",80.5,"female","FOE.41.008.089.22");
        Student s3 = new Student("Jessica Katamanso",2007,"CE","Agomeda","Computer Science and Engineering",2,"Castle",95.6,"female",
        "FOE.41.008.056.22");

        List<Student> studentList = new ArrayList<>();
            
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

         System.out.println(s1.calculateAge());
         System.out.println(s1.calculateRemainingYears(4));
         System.out.println(s1.generateStudentID());
         s1.displayInfo();
         
         System.out.println(Student.calculateGenderRatio(studentList));
    }
};
//To tell the compiler to allocate an appropriate memory allocation (Why initialize)
//Default 0 assigned to initialize int or double
//Local variable - inside a method
//Instance variable - inside class, outside method and not static
// variable - declared as static
// 8 data types ( primitve and non-primitive)
//STRING ARRAY CLASSES INTERFACES
// "final" is used to denote constants in java
//BY CONVENTION constants are denoted using UPPERCASE
// ENUMS are types used to restrict a variable to a set of values, eg. (CE,CY,IS)
// enum Course {CE, CY , IS } - can only be defined inside a top-level class, interface or static context
// e.g. Course studentCourse = Course.CE
// Assignment Statement , AssignmentExpression (Computation occurs on other hand of variable initialization )
//Five operators for arithmetic
//Evaluation is from left to right
// - Multiplication
// - Division
// - Remainder
// - Addition
// - Subtraction




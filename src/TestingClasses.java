import Classes.Student;

public class TestingClasses {
    public static void main(String[] args) {
        rectangular r1 = new rectangular(20.0,10.0);
        System.out.println(r1.Area());

        Student s1 = new Student("Kirk Katamanso", 2005, "CE", "Agomeda",
         "Computer Science and Engineering", 2, "Castle Gate", 89.54, "male", "FOE.41.008.088.22");

         System.out.println(s1.calculateAge());
         System.out.println(s1.calculateRemainingYears(4));
         System.out.println(s1.generateStudentID());
         s1.displayInfo();
    }
}
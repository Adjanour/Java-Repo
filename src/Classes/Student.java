package Classes;

import java.util.List;

public class Student {
    private String name;
    private int yearOfBirth;
    private String department;
    private String hometown;
    private String programme;
    private int yearOfStudy;
    private String hostel;
    private double cwa;
    private String gender;
    private String indexNumber;


    // Constructor
    public Student(String name, int yearOfBirth, String department, String hometown, String programme,
                       int yearOfStudy, String hostel, double cwa, String gender, String indexNumber) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.department = department;
        this.hometown = hometown;
        this.programme = programme;
        this.yearOfStudy = yearOfStudy;
        this.hostel = hostel;
        this.cwa = cwa;
        this.gender = gender;
        this.indexNumber = indexNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getHostel() {
        return hostel;
    }

    public void setHostel(String hostel) {
        this.hostel = hostel;
    }

    public double getCwa() {
        return cwa;
    }

    public void setCwa(double cwa) {
        this.cwa = cwa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    // Method to change programme
    public void changeProgramme(String newProgramme) {
        this.programme = newProgramme;
    }

    // Method to change department
    public void changeDepartment(String newDepartment) {
        this.department = newDepartment;
    }

    // Method to change CWA (Cumulative Weighted Average)
    public void changeCWA(double newCWA) {
        this.cwa = newCWA;
    }

    /**
     * Displays information about the student
     */
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Department: " + department);
        System.out.println("Hometown: " + hometown);
        System.out.println("Programme: " + programme);
        System.out.println("Year of Study: " + yearOfStudy);
        System.out.println("Hostel: " + hostel);
        System.out.println("CWA: " + cwa);
        System.out.println("Gender: " + gender);
        System.out.println("Index Number: " + indexNumber);
    }

    /**
     * Calculates the age of the student
     * @return age of the student
     */
    public int calculateAge() {
        return java.time.LocalDate.now().getYear() - yearOfBirth;
    }

    /**
     * Promote student to the next level
     */
    public void promoteStudent() {
        yearOfStudy++;
    }
    
    /**
     * 
     * @param newHostel
     */
    public void updateHostel(String newHostel) {
        hostel = newHostel;
    }
       
    /**
     * 
     * @return
     */
    public String generateStudentID() {
        return name.substring(0, 3) + yearOfBirth + indexNumber.substring(indexNumber.length() - 3);
    }
    
    /**
     * Calculate the remaining years os study of the student
     * @param totalYears
     * @return remaing years of study
     */
    public int calculateRemainingYears(int totalYears) {
        return totalYears - yearOfStudy;
    }
    
    /**
     * 
     * @param newHometown
     */
    public void updateHometown(String newHometown) {
        hometown = newHometown;
    }
    
    /**
     * Calculates the Gender ratio of all the students
     * @param students List of students
     * @return the gender ratio 
     * @author Bernard Kirk Katamanso
     */
    public static double calculateGenderRatio(List<Student> students) {
        int maleCount = 0;
        int femaleCount = 0;
        for (Student student : students) {
            if (student.getGender().equalsIgnoreCase("male")) {
                maleCount++;
            } else if (student.getGender().equalsIgnoreCase("female")) {
                femaleCount++;
            }
        }
        return (double) maleCount / (maleCount + femaleCount);
    }
}

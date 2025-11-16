package javaOOPSCodingChallengeTest2;

//Implement a class "Student" with
// attributes "name", "rollNo", and "section". Add a method to print student details.
//Input:
//Create student with name="Bob", rollNo=101, section="A"
//Output:
//Student: Bob, Roll No: 101, Section: A
public class Q2__Student_Management_System {
    static void main(String[] args) {

        Student s = new Student("Bob", 101, "A");
        s.printDetails();
    }
}
class Student
{
    private String name;
    private int rollNo;
    private String section;

    public Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Section: " + section);
    }
}

package ex_30__Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab233_ArrayList_class_element {
    static void main(String[] args) {
        Student s1 = new Student("Amit","1");
        Student s2 = new Student("Abhi","2");
        Student s3 = new Student("Shrayashi","3");

        List<Student> myStudent = new ArrayList<>();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
}
class Student
{
    private String name;
    private String rollNo;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void printDetails()
    {
        System.out.println("Student name: " +this.name);
        System.out.println("Student roll no: "+this.rollNo);
    }
}

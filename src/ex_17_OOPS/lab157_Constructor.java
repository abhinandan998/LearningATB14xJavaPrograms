package ex_17_OOPS;

public class lab157_Constructor {
    static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Abhinandan");

    }
    static class Student
    {
        String name;

        //DC
        Student()
        {
            System.out.println("DC-> Hi, I am called. " );
        }
        //PC
        Student(String name)
        {
            System.out.println("PC-> Hi, "+name);
        }

        void sleep(){

        }
        void study()
        {

        }
        void eat()
        {

        }
    }
}

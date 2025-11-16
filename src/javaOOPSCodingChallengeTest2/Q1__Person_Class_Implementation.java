package javaOOPSCodingChallengeTest2;

//Create a class "Person"
// with attributes "name" and "age". Create two instances and print their details.
//Input:
//Create Person objects with names "John" (25) and "Alice" (30)
//Output:
//Name: John, Age: 25 Name: Alice, Age: 30
public class Q1__Person_Class_Implementation {

    static void main(String[] args) {

        Person person1 = new Person("John", 25);
        Person person2 = new Person("Alice", 30);

        person1.printDetails();
        person2.printDetails();
    }

}
class Person
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;

    }
    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

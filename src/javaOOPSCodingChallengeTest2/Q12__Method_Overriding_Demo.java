package javaOOPSCodingChallengeTest2;

//Write a program to demonstrate method overriding by creating parent
// and child classes with the same method signature.
//Input:
//Parent and Child objects calling display() method
//Output:
//Parent class display method Child class display method
public class Q12__Method_Overriding_Demo {
    static void main(String[] args) {

        Parent parent = new Parent();
        Child child = new Child();

        parent.display();
        child.display();
    }
}
class Parent {
    public void display() {
        System.out.println("Parent class display method");
    }
}
class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child class display method");
    }
}

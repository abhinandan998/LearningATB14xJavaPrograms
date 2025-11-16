package javaOOPSCodingChallengeTest2;

//Create interfaces "Flyable" and "Swimmable" with appropriate methods.
// Implement both in a "Duck" class.
//Input:
//Create Duck object and call fly() and swim() methods
//Output:
//Duck is flying in the sky! Duck is swimming in the water!
public class Q10__Multiple_Interface_Implementation {

    static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
interface Flyable{
    void fly();
}
interface Swimmable
{
    void swim();
}
class Duck implements Flyable, Swimmable
{

    @Override
    public void fly() {
        System.out.println("Duck is flying in the sky!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the water!");
    }
}

package javaOOPSCodingChallengeTest2;

//Create a class "Animal"
// and subclasses "Dog" and "Cat". Override a method to make each animal make a sound.
//Input:
//Create Dog and Cat objects and call makeSound()
//Output:
//Dog says: Woof! Woof! Cat says: Meow! Meow!
public class Q5__Animal_Sound_Polymorphism {
    static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
//Base class
class Animal
{
    public void makeSound()
    {
        System.out.println("Animal makes a sound");
    }

}
class Dog extends Animal
{
    public void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}
class Cat extends Animal
{
    public void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}


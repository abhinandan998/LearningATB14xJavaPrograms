package javaOOPSCodingChallengeTest2;

//Create a Vehicle base class with start() method.
// Create Car and Bike subclasses that override the start() method.
//Input:
//Vehicle[] vehicles = {new Car(), new Bike()}; call start() on each
//Output:
//Car engine starts with a roar! Bike engine starts with a purr!
public class Q6__Vehicle_Inheritance_Hierarchy {

    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bike()};
        for (Vehicle v : vehicles) {
            v.start();
        }

}
//Base class
static class Vehicle
{
    public void start()
    {
        System.out.println("Vehicle starts.");
    }
}
static class Car extends Vehicle
{
    public void start()
    {
        System.out.println("Car engine starts with a roar!");
    }
}
static class Bike extends Vehicle {
    public void start() {
        System.out.println("Bike engine starts with a purr!");
    }
}
}
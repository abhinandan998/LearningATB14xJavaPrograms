package ex_23_OOPS_SuperAbstraction.Abstraction;

import javax.swing.*;

public class Lab173_Better_Abstract_Class {
    static void main(String[] args) {

        Alto a = new Alto();
        a.drive();
        //Car1 c = new Car1();

    }
}
class Alto extends Car1 implements tyre, Gear, Engine
{
    void drive()
    {
        rubberTyre();
        blackColorDoToTyre();
        this.startCar();
        startEngine();
        changeGear();
        this.stopCar();
    }

    @Override
    void startCar() {
        System.out.println("Starting the car.");
    }

    @Override
    void stopCar() {
        System.out.println("Stopped the car.");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Engine");
    }

    @Override
    public void changeGear() {
        System.out.println("Changing the Gear");
    }

    @Override
    public void rubberTyre() {
        System.out.println("rubberTyre the car.");
    }

    @Override
    public void blackColorDoToTyre() {
        System.out.println("blackColorDoToTyre the car");
    }
}
interface tyre
{
    abstract void rubberTyre();
    void blackColorDoToTyre();
}
interface Gear
{
    void changeGear();
}
interface Engine
{
    void startEngine();
}
abstract class Car1
{
    abstract void startCar();
    abstract void stopCar();
}
abstract class A
{

}

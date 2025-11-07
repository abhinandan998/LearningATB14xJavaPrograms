package ex_23_OOPS_SuperAbstraction.Abstraction;

public class Lab174_Interface_P1 {
    static void main(String[] args) {
        Car2 car2 = new Car2();
        car2.drive();

       // Brake i = new Brake();

    }
}
class Car2 implements Brake, Engine1
{
    void drive()
    {
        startEngine();
        applyBrake();
        startEngine();
    }
    public void testEngine()
    {
        System.out.println("Override by the car");
    }
    public void applyBrake()
    {
        System.out.println("Apply Brake");
    }
    public void startEngine()
    {
        System.out.println("Start Engine");
    }
    public void stopEngine()
    {
        System.out.println("Stop Engine");
    }
}
interface Brake
{
    void applyBrake();
}
interface Engine1
{
    void startEngine();
    void stopEngine();

    default void testEngine()
    {
        System.out.println("concrete complete");
    }
    default void testEngine1()
    {
        System.out.println("concrete complete");
    }
}
package ex_23_OOPS_SuperAbstraction.Abstraction;

public class lab171_ {
    static void main(String[] args) {
        //Car
        Car testa = new Car(300);
        testa.drive();
    }

}
class Vehicle
{
    public int maxSpeed=100;
    void noTest()
    {
        System.out.println("Empty");
    }
    Vehicle()
    {
        System.out.println("default constructor");
    }
    Vehicle(int a )
    {
        System.out.println("parameter constructor");
    }
    Vehicle(int a, int b)
    {
        System.out.println("parameter constructor");
    }


    //Method Overloading - same, same name function with different arguments.
    void Message(){
        System.out.println("No return, No argument");
    }
    void message(int a )
    {
        System.out.println("PC - argument");
    }
    void drive()
    {
        System.out.println("Vehicle Parent");
    }
}
class Car extends Vehicle
{
    private int maxSpeed = 281;
    Car()
    {
        super(100);
    }
    Car(int a)
    {
        System.out.println("PC Car");
    }
    void test()
    {

    }
    void drive()
    {
        System.out.println("Over ridden the vehicle");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.test();
    }
}

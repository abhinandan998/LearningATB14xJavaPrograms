package javaOOPSCodingChallengeTest2;

//Implement an abstract class "Shape" with an abstract method "getArea()".
// Create subclasses "Rectangle" and "Circle" and implement "getArea()" for each.
//Input:
//Rectangle: length=5, width=3; Circle: radius=4
//Output:
//Rectangle Area: 15.0 Circle Area: 50.26548245743669
public class Q8__Abstract_Shape_Implementation {
    static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Circle Area: " + circle.getArea());
    }
}
abstract  class shape
{
    public abstract double getArea();
}
class Rectangle extends shape
{
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        this.length=length;
        this.width=width;
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
class Circle extends shape
{
    private double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }

    @Override
    public double getArea() {

        return Math.PI*radius*radius;
    }
}

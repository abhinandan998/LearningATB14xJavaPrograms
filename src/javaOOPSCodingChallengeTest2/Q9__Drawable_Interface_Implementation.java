package javaOOPSCodingChallengeTest2;

//Create an interface "Drawable" with a method "draw()".
// Implement this interface in classes "Circle" and "Rectangle".
//Input:
//Create Circle and Rectangle objects, call draw() method
//Output:
//Drawing a Circle Drawing a Rectangle
public class Q9__Drawable_Interface_Implementation {
    static void main(String[] args) {
        Drawable circle = new circle();
        Drawable rectangle = new rectangle();

        circle.draw();
        rectangle.draw();

    }
}
interface Drawable
{
    void draw();
}
class circle implements Drawable
{


    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
class rectangle implements Drawable
{

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

package javaOOPSCodingChallengeTest2;

//Create a class "Outer" with an inner class "Inner".
// Access the inner class from the outer class and demonstrate their interaction.
//Input:
//Outer class with variable x=10, Inner class accessing x
//Output:
//Outer class variable x: 10 Inner class accessing outer variable: 10
public class Q13__Outer_and_Inner_Class_Implementation {
    static void main(String[] args) {

        Outer outer = new Outer();
        outer.show();
    }
}
class Outer
{
    private int x =10;
   class Inner
    {
        public void display() {
            System.out.println("Inner class accessing outer variable: " + x);
        }
    }
    public void show() {
        System.out.println("Outer class variable x: " + x);
        Inner inner = new Inner();
        inner.display();
    }
}

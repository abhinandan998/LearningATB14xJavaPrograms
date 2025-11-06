package ex_20_OOPs_polymorphism.methodoverriding;

public class Lab167_MOverriding {
    static void main(String[] args) {

        //RunTime polymorphism

        Abhi a1 = new Abhi();
        a1.home();

        Father f1 = new Father();
        f1.home();

        Father f2 = new Abhi();  //Dynamic dispatch
        f2.home();

        // Abhi a1 = new Father();   //cannot exists

    }

}
class Father
{
    void home()
    {
        System.out.println("2BHK");
    }
}

class Abhi extends Father
{
    @Override //annotation
    void home()
    {
        System.out.println("3BHK");
    }

}
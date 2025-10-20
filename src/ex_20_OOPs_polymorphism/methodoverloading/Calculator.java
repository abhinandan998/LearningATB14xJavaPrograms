package ex_20_OOPs_polymorphism.methodoverloading;

public class Calculator {

    static void main(String[] args) {

        calc c1 = new calc();
        c1.add(3,4);
        c1.add(3.45, 4.78);


    }
}
class calc{                         //method overloading
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b, int c)
    {
        return a+b+c;
    }
    double add(double a, double b)
    {
        return  a+b;
    }
    long add(long a , long b)
    {
        return a+b;
    }

}

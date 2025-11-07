package ex_23_OOPS_SuperAbstraction.Abstraction;

public class Lab172_Abstract {
    static void main(String[] args) {

        Son s1 = new Son();
        s1.loan50k();
        s1.loan10k();
    }
}
abstract class AbhiFather
{
    abstract void loan50k();
    void loan10k()
    {
        System.out.println("Given");
    }
}

class Son extends AbhiFather
{

    @Override
    void loan50k() {
        System.out.println("Ok, I am Abhi, I will give Father loan of 50k");
    }
}

package ex_23_OOPS_SuperAbstraction;

public class Lab179_Multiple_Inheritance_solved {

}
class Child1 implements father1,father2
{
    public void money()
    {
        System.out.println("Child Money!");
    }
}
interface father1
{
    final int a =10;
    void money();
}
interface father2
{
    void money();
}

package ex_23_OOPS_SuperAbstraction;

public class Lab178_Private {

}
class XYZ
{
    XYZ()
    {

    }
    protected int my_gold=10;
}
class CAB extends XYZ{
    void display()
    {
        System.out.println(super.my_gold);
    }
}

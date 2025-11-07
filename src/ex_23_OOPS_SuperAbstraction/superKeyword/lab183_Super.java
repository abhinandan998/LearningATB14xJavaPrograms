package ex_23_OOPS_SuperAbstraction.superKeyword;

public class lab183_Super {

}
class Father{

    Father()
    {
        System.out.println("DC Father");
    }
    int gold=10;
    void home()
    {
        System.out.println("Home Father");
    }
}
class  son extends Father
{
    son()
    {
        super();
    }
    int gold_c = 100;
    void bike()
    {

    }
    void newHome()
    {
        System.out.println(super.gold);
        super.home();// used for father class
        this.bike(); //used for current class
        System.out.println(this.gold_c);
    }
}




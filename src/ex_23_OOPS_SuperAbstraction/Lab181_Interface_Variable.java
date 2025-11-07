package ex_23_OOPS_SuperAbstraction;

public class Lab181_Interface_Variable {
    static void main(String[] args) {

    }
}
interface Abhinandan
{
    final int a =10;
    void display();
}
class Basu implements Abhinandan
{
    int aa =10;
    @Override
    public void display() {
        //System.out.println(super.a);
        System.out.println(a);
        System.out.println(this.aa);
    }
}
class Somya implements TTA
{

    @Override
    public void practice() {

    }
}
class Abhinandan1 implements TTA
{

    @Override
    public void practice() {

    }
}
interface TTA{
    void practice();
}

class Abhinandan_Mentor implements TTA_Mentor
{

    @Override
    public void teach() {

    }
}
class Dipak implements TTA_Mentor

{

    @Override
    public void teach() {

    }
}
interface TTA_Mentor
{
    void teach();
}
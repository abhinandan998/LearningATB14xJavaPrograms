package ex_22_OOPS_accessmodifier.Police;

public class Cop {

    public int gun;
    private String iCard;

    public Cop(int bullet)
    {
        this.gun = bullet;
    }

    //Method and Behaviour

    protected void canIShoot()
    {
        System.out.println("Yes you can !!");
    }
    void thisDefault()
    {
        System.out.println("Hi, Cop!");
    }
}

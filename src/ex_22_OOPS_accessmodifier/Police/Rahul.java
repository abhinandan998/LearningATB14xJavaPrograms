package ex_22_OOPS_accessmodifier.Police;

public class Rahul extends Cop{

    public Rahul(int bullet) {
        super(bullet);
    }

    static void main(String[] args) {
        Cop p = new Cop(100);
        p.thisDefault();
    }
}

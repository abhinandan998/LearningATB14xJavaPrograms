package ex_21_OOPs_Encapsulation;

public class Lab_REAL_BANK {
    static void main(String[] args) {

        ICICIBank abhi = new ICICIBank("Abhi", 10000);
        long bal = abhi.getBal();
        System.out.println(bal);



    }

}
class ICICIBank{
    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        this.bal = bal;
    }
}

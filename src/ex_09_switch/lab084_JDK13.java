package ex_09_switch;

public class lab084_JDK13 {
    static void main(String[] args) {
        int i =006;
        switch (i)
        {
            case 001,002,005:
                System.out.println("all of them are electro");
                break;
            case 004,006,007:
                System.out.println("this is mech");
            break;
            default:
                System.out.println("default");
        }
    }
}

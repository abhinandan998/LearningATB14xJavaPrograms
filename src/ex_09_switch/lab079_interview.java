package ex_09_switch;

public class lab079_interview {
    static void main(String[] args) {
        char ch='A';
        switch (ch)
        {
            case 65:
                System.out.println("Match Ascii");
                break;
            default:
                System.out.println("No match");
        }
    }
}

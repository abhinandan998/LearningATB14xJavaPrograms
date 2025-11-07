package ex_24__Static;

public class Lab188_Static {
    static void main() {
        Automation1 t1 = new Automation1();
        System.out.println(t1.driver);
        System.out.println(Automation1.driver);
        Automation1.driver = "FireFox";
        System.out.println(Automation1.driver);
        System.out.println(Automation1.driver2);
    }
}
class Automation1{
    static String driver = "Chrome";
    static String driver2;
}
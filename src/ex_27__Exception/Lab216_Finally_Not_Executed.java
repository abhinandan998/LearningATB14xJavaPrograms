package ex_27__Exception;

public class Lab216_Finally_Not_Executed {
    public static void main(String[] args) {
        try {
            int a =  10/10;
            System.out.println("Try Executed");
            System.exit(0);
//            return;
        } catch (Exception e) {
            System.out.println("Catching the exception");
        } finally {
            System.out.println("I will be always executed!");
        }

    }
}

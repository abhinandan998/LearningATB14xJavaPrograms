package ex_06_Ternary_operator;


//Q2. Interview - Zeta → (AT)
// Ter nested → Max between 3 numbers →  int n1 = 2; int n2 = 9;  int n3 = -11;
public class Task20thSept_Q2_ {
    static void main(String[] args) {

        int n1= 2;
        int n2= 9;
        int n3=-11;

        int max = (n1>n2)?(n1>n3? n1 :n3): n2;
        System.out.println(max);


    }
}

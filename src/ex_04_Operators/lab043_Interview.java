package ex_04_Operators;

public class lab043_Interview {
    static void main(String[] args) {
        int abhi_salary = 12000;
        boolean b = !(abhi_salary >10000 || abhi_salary<5000);
        System.out.println(b);

        //Divide and conquer
        // A-> abhi_salary>10000 - >12000>10000 -> true;
        //B-> abhi_salary< 5000 -> 12000<5000 -> false
        //(A||B) -> true
        //!(true) -> false

    }
}

package ex_05_TypeCasting;

public class lab053_TypeCasting_Narrowing {
    static void main(String[] args) {

        int val = 300;
        //byte b= val; //narrowing - implicit casting -valid? no
        byte b = (byte) val; //Narrowing - explicit cast - valid - yes
        System.out.println(b);
    }
}

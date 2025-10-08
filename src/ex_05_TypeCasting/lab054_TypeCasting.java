package ex_05_TypeCasting;

public class lab054_TypeCasting {
    static void main(String[] args) {

        long ph = 452452345235L;
        //short s = ph; //Narrowing - implicit

        short s = (short) ph; //Narrowing - explicit
        System.out.println(s);
    }
}

package ex_15_String_Buffer_builder;

public class lab130_SB {

    static void main() {
        StringBuffer stringBuffer = new StringBuffer("Abhinandan");

        stringBuffer.append("Basu");
        System.out.println(stringBuffer);

        String s1 ="Abhinandan";
        s1 = s1+ "Basu";
        System.out.println(s1);

    }
}

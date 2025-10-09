package ex_15_String_Buffer_builder;

public class lab129_StringBuilder_vs_StringBuffer {

    static void main() {

        String s0= "Abhinandan";
        String s1 = new String("Abhinandan");

        //less than <10% used.
        StringBuilder stringBuilder = new StringBuilder("Abhinandan");//not thread safe
        StringBuffer stringBuffer = new StringBuffer("Abhinandan"); //tread safe

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}

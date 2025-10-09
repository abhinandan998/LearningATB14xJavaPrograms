package ex_15_String_Buffer_builder;

public class lab132_SBuilder {

    static void main() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world");
        sb.reverse();
        System.out.println(sb);

    }
}

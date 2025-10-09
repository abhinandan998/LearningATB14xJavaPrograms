package ex_15_String_Buffer_builder;

public class lab133_SB {

    static void main() {

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);

        sb.replace(0,4,"C++");
        System.out.println(sb);
    }
}

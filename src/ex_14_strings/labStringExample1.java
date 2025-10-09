package ex_14_strings;

public class labStringExample1 {
    static void main(String[] args) {

        String s ="Java";
        char c =s.charAt(2);
        System.out.println(c);

        int res = "abc".compareTo("ABC");
        System.out.println(res);

        int idx = "Java".indexOf("a");
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a");
        System.out.println(idx2);

        boolean b ="".isEmpty();
        System.out.println(b);

        String s11 = String.join("- ","java", "python");
        System.out.println(s11);

        String s12 = "Java".replace('a', 'o');
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1);

        String b2 = "Java".concat("MAva");
        System.out.println(b2);

    }
}

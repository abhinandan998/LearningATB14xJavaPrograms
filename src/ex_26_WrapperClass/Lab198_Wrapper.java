package ex_26_WrapperClass;

public class Lab198_Wrapper {
    static void main(String[] args) {


        int a = 10;
        Integer b = a;
        //Boxing  - primitive - Wrapper - AutoBoxing - jvm will do it
        System.out.println(b.intValue());
        System.out.println(b);
        System.out.println(a);

        //UnBoxing(Wrapper -> primitive)
        Integer aa = 43;
        int a1 = aa; //UNBOXING
        System.out.println(a1);
    }
}


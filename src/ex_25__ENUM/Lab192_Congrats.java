package ex_25__ENUM;

public class Lab192_Congrats {
    static void main(String[] args) {
        System.out.println(Env.PROD.getBaseUrl());
        System.out.println(Env.DEV.getBaseUrl());
    }
}

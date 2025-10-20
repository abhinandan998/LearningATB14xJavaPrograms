package ex_19_OOPS_Inhertance.multilevel;

public class Lab163_Multilevel {
    static void main(String[] args) {
        Son pramod = new Son();
        pramod.home();
        pramod.bhk3();
        pramod.gf();
        pramod.extra();

        Father f = new Father();
        f.gf();
        f.home();
        f.extra();

        Grandfather gf =  new Grandfather();
        gf.gf();
        gf.home();

        // Dynamic Dispatch
        Grandfather g1 = new Son();
        Father f1  = new Son();
        //Son s1 = new GrandFather();
        //Son s2 = new Father();
    }


}

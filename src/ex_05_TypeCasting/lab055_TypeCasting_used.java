package ex_05_TypeCasting;

public class lab055_TypeCasting_used {
    static void main(String[] args) {

        int course = 100;
        float gst = 18.45f;

        //int total1 = course+gst; //narrowing -implicit
        int total = course +(int) gst; //narrowing - explicit
        System.out.println(total);

        float total2 =course+gst; //widening - auto - implicit
        //float total3 = (float) course + gst; //widening - explicit

        System.out.println(total2);

    }
}

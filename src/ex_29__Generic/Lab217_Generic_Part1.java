package ex_29__Generic;

public class Lab217_Generic_Part1 {
    static void main(String[] args) {
        temp_sum_t(10,10);
        temp_sum_t(10.34,10.56);
        temp_sum_t("Abhinandan", "Basu");
    }
//    static Integer temp_sum(Integer a, Integer b)
//    {
//        return a+b;
//    }
//    static Double temp_sum(Double a, Double b)
//    {
//        return a+b;
//    }
    static <T> T temp_sum_t(T a, T b)
    {
        return null;
    }
}


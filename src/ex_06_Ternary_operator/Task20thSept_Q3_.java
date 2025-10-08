package ex_06_Ternary_operator;

//Q3. Real_Age_Classification (  age → 59 ) →  Minor, Adult (Adult , Sr Senior) -
// Ternary Operator
public class Task20thSept_Q3_ {
    static void main(String[] args) {

        int age = 59;

        String age_classify = (age>18)?(age<60 ? "Adult" : "Sr Senior"): "Minor";
        System.out.println(age_classify);
    }
}

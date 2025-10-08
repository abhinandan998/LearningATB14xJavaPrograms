package ex_06_Ternary_operator;

public class lab058_Interview_Ready_question {
    static void main(String[] args) {

        int age =21;

        //Nested ternary
        //res = condition1 ? expression1 :(condition2 ? expression2:expression 3);

        String res = (age > 18)?(age > 25 ? "can drink": "you can go but can't drink"): "no";
        System.out.println(res);
    }
}

package ex_13_functions;

public class lab116_user_defined_one {
    static void main(String[] args) {
        int res= sum_of_two_no(3,4);
        int res1=sum_of_two_no(10,20);
        System.out.println(res);
        System.out.println(res1);


    }
    static  int sum_of_two_no(int a , int b){
        return a+b;
    }
}

package ex_16_arrays;

public class lab144_Arrays_SUM_OF_Arrays {
    static void main(String[] args) {
        int[] num ={12,34,10};

        int sum =0;
        for (int i = 0; i <  num.length;i++) {
            sum=sum+num[i];

        }
        System.out.println(sum);

    }
}

package ex_16_arrays;

public class lab143_Arrays_reverse {
    static void main(String[] args) {
        int[] num ={1,2,3,4,5};
        //5,4,3,2,1

        for (int i = num.length-1; i >=0 ; i--) {
            System.out.println(num[i]);
        }

    }
}

package ex_16_arrays;

import java.util.Arrays;

public class lab145_Interview_2nd_High_Number_Array {
    static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);

    }
}

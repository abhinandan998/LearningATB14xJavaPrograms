package ex_16_arrays;

public class lab137_Arrays {
    static void main(String[] args) {

        int a =10;
        int[] marks ={91, 92,65,34,234, 23};

        boolean[] is_married ={true, false, true};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);

        //System.out.println(marks[-1]);//exception out of bound


        String name ="Abhi";
        String[] name_of_each_element_char = name.split("");
        for(String  s: name_of_each_element_char)
        {
            System.out.println(s);
        }
    }
}

package Program_ForLoop_WhileLoop_Task.WhileLoop;

//5️⃣ Print the multiplication table of 7
public class Q5__Multiplication_Table_Of_7 {

    static void main(String[] args) {

        int number = 7;

        System.out.println("Multiplication Table of 5:");
        int i =1;
        while(i<=10)
        {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }
}

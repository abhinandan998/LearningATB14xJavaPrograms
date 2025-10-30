package Program_ForLoop_WhileLoop_Task.ForLoop;

//5️⃣ Print the multiplication table of 5
public class Q5__Multiplication_Table_Of_5 {

    static void main(String[] args) {

        int number = 5;

        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

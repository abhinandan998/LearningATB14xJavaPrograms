package Program_ForLoop_WhileLoop_Task.ForLoop;

//2️⃣ Print even numbers from 1 to 20
public class Q2__Print_even_no_1_To_20 {
    static void main(String[] args) {

        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.print(" " +i);
            }
        }
    }
}

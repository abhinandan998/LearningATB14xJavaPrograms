package Program_ForLoop_WhileLoop_Task.ForLoop;

//4️⃣ Print the sum of first 10 natural numbers
public class Q4__Sum_first_10_Natural_number {
    public static void main(String[] args) {

        int sum =0;
        for(int i=1;i<=10;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of 1st 10 natural number: "+ sum);
    }
}

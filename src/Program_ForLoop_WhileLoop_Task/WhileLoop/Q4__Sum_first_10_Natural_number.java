package Program_ForLoop_WhileLoop_Task.WhileLoop;

//4️⃣ Print the sum of first 10 natural numbers
public class Q4__Sum_first_10_Natural_number {
    public static void main(String[] args) {

        int sum =0;
        int i =1;
        while(i<=10)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of 1st 10 natural number: "+ sum);
    }
}

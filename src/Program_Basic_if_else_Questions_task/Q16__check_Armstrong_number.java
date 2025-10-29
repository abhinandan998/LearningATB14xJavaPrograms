package Program_Basic_if_else_Questions_task;

//16) Check if a Number is an Armstrong Number.
import java.util.Scanner;

public class Q16__check_Armstrong_number {
    //to count number of digits
    public  static  int order(int n)
    {
        int t=0;
        while(n!=0)
        {
            t++;
            n=n/10;

        }
        return t;
    }
    public static int power(int x, int y)
    {
        if(y==0)
            return 1;
        if(y%2==0)
        {
            return power(x,y/2)*power(x,y/2);
        }
        return x* power(x,y/2)*power(x,y/2);
    }
    public static boolean isArmstrong(int n)
    {
        int x = order(n);
        int temp = n, sum =0;
        while(temp!=0)
        {
           int r = temp%10;
           sum = sum+ power(r,x);
           temp = temp/10;
        }
        return  sum==n;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (isArmstrong(n))
        {
            System.out.println(n +" is Armstrong number");
        }
        else {
            System.out.println(n + " is not a Armstrong number");
        }

    }
}

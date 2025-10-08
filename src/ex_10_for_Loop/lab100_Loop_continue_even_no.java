package ex_10_for_Loop;

public class lab100_Loop_continue_even_no {
    static void main(String[] args) {

        for(int i= 0;i<50;i++)
        {
          //  System.out.println(i);
            if(i%2!=0)
            {
                continue;
            }
            System.out.println(i);
        }
        }
    }


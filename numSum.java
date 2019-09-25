/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Calvin Goodman
   Date Due:   9/11/2019
 ******************************************************************************/
import java.util.Scanner;

public class numSum
{
    public static void main(String[] args)
    {

        Scanner KB = new Scanner(System.in);
        int a;
        int c = 0;
        int s = 0;
        int l = 0;
        int small = 0;


            System.out.println("Give me a positive number to keep me going; negatives stop me");
            a = KB.nextInt();
            

            while (a > 0)
            {
                s += a;
                if (a > l)
                {
                    l = a;
                }
                c++;
                System.out.println("Give me a positive number to keep me going; negatives stop me");
                a = KB.nextInt();

                if (a < small || c == 0)
                {
                    small = a;
                }


            }

            if (c > 1)
            {
                System.out.printf("You entered %d positive numbers\n", c);
                System.out.printf("All your numbers added together = %d\n", s);
                System.out.println("The largest number you gave was " + l);
                System.out.printf("The smallest number you gave was %d",small);
            }



            

    }
}
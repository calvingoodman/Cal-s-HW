/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Calvin Goodman
   Date Due:   9/11/2019
 ******************************************************************************/
import java.util.Scanner;

public class division
{
    public static void main(String[] args)
    {

        Scanner KB = new Scanner(System.in);


        int divisor;
        int dividend;

        System.out.println("Give number");
            dividend = KB.nextInt();
        System.out.println("What do you want to divide it by?");
            divisor = KB.nextInt();
        
        if (divisor > 0 && divisor != 0) 
        {
            System.out.printf("%d / %d = %d", dividend, divisor, dividend/divisor);
        }

        else
        {
            System.out.println("You can't divide by 0");
        }
    }
}

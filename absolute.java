/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Caitlyn Brown
   Date Due:   8/20/2019
 ******************************************************************************/
import java.util.Scanner;

public class absolute
{
    public static void main(String[] args)
    {

        Scanner KB = new Scanner(System.in);

        int a;
        System.out.println("Need help with algebra class??");
        System.out.println("This program gives the absolute value of ANY number!!");
        System.out.println("PLease give me a number");
        a = KB.nextInt();

        if (a >= 0) {
            System.out.println("The absolute value of " + a + " is " + a);
        }
        
        else  {
                System.out.println("The absolute value of " + a + " is: " + -a);

        }
        
        
    }
    
}
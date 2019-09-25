/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Calvin Goodman
   Date Due:   9/11/2019
 ******************************************************************************/
import java.util.Scanner;

public class between
{
    public static void main(String[] args)
    {

        Scanner KB = new Scanner(System.in);
        int a;

         System.out.print("Give me a number: ");
         a = KB.nextInt();

         if (a < 24 && a > 14) 
         {
             System.out.print("You got it ");
         }

        else 
        {
            System.out.println("Try again next time");
        }






    }
}
/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Calvin Goodman
   Date Due:   9/11/2019
 ******************************************************************************/
import java.util.Scanner;

public class leapYear
{
    public static void main(String[] args)
    {

        Scanner KB = new Scanner(System.in);

        int y;

        System.out.printf("Give me a year and I'll tell you if it's a leap year or not:");
        y = KB.nextInt();


        
        if (y%4 == 0 && y%100 != 0 || y%400 == 0)
        {
            System.out.println("Yes! " + y + " is a leap year");
        }
        
        else
        {
            System.out.println("No! " + y + " is not a leap year");
        }   
    }
}
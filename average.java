/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Calvin Goodman
   Date Due:   9/25/2019
 ******************************************************************************/
import java.util.Scanner;

public class average
{
    public static void main(String[] args)
    {
        Scanner KB = new Scanner(System.in);
        int a;
        int b;
        float sum = 0;
        float average;
        String yes;

        System.out.println("Please tell how many numbers you'll be entering");
        a = KB.nextInt();

        for(int i=1; i<=a; i++)
        {
            System.out.println("Enter # " +i);
            b = KB.nextInt();
            sum += b;
        }
        System.out.println("The sum of your number is: " + sum);
        System.out.println("Do you want to know the average?");
            yes = KB.next();

            if (yes.equals("yes"))
            {
                average = sum/a;
                System.out.printf("The average of your numbers is: %f", average);   
            }
            else
            {
                System.out.println("Bye!!");
            }

        
    }
}
/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Caitlyn Brown
   Date Due:   8/20/2019
 ******************************************************************************/
import java.util.Scanner;

public class lowest
{
    public static void main(String[] args)
    {

        Scanner KB = new Scanner(System.in);

        int a;
        int b;
        System.out.println("This program tells you the lowest of any two numbers");


        System.out.println("Give me a number:");
        a = KB.nextInt();
        System.out.println("Give me another number:");
        b = KB.nextInt();

        if (a < b)
        {
            System.out.println("The lower of the two is " + a);
        }
        else
        {
            System.out.println("The lower of the two is" + b);
        }





    }
}











/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Calvin Goodman
   Date Due:   9/25/2019
 ******************************************************************************/
import java.util.Scanner;

public class shapes
{
    public static void main(String[] args)
    {
        Scanner KB = new Scanner(System.in);
        
        int a;
        int b = 0;
        System.out.println("Tell me how long you want the line to be");
         a = KB.nextInt();
        
         for (int i=1;i <= a; i++)
         {
            System.out.print("*");
         }

           
    }
}
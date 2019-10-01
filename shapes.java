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
        System.out.println("Tell me how big you want the base of the triangle to be");
         a = KB.nextInt();
        
        for (int i= 1; i <= a; i++)
        { 
          for (int x = 1; x<=i; x++)
          { 
           System.out.print("* ");
          }
        System.out.println();
        }
    }
}
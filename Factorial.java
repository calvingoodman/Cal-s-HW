/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Caitlyn Brown
   Date Due:   8/20/2019
 ******************************************************************************/
import java.util.Scanner;

public class Factorial
{
  public static void main(String[] args)
  { 
      Scanner KB = new Scanner(System.in);
      int input;
      long factorial = 1;

      System.out.printf("Enter a number to find the factorial of it: ");
      input = KB.nextInt();
    
      for (long i = 1; i <= input; i++)
      {
        factorial *= i;
      }

      System.out.println("The factorial of " + input + " = " + factorial);
  
  
  }
}

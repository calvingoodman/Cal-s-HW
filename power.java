/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Calvin Goodman
   Date Due:   9/11/2019
 ******************************************************************************/
import java.util.Scanner;


public class power
{

public static void main(String[] args)   

    {  
        Scanner KB = new Scanner(System.in);
        String again;
        do 
        {    
        int a;
        int b;
        long answer = 1;
        


        
        System.out.printf("Give me a number: ");
            a = KB.nextInt();
        
        System.out.print("Now, by what exponent do you want to raise " + a + " : ");
            b = KB.nextInt();
        
        for (int i = 1; i <= b; i++)
        {
            answer *= a;
        }
            if (b == 1)
            {
            System.out.printf("%d to the first equals: %d",a, answer);   
            }
            else if (b == 2)
            {
            System.out.printf("%d squared equals: %d",a, answer);   
            }
            else if (b == 3)
            {
            System.out.printf("%d cubed equals: %d",a, answer);   
            }
            else
            {
            System.out.printf("%d raised to the power of %d equals: %d",a,b,answer);   
            }
        System.out.printf("\nDo you want to run a new calculation (y/n): ");
                again = KB.next();
        } while (again.equals("y"));
    }
}

/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Caitlyn Brown
   Date Due:   8/20/2019
 ******************************************************************************/
import java.util.Scanner;

public class Numbers2
{
    public static void main(String[] args)
    {

        Scanner KB = new Scanner(System.in);

        int a;
        int b;
        String op;
        
        //Majic Calculator;)
        System.out.println("Type a number for a:");
        a = KB.nextInt();
        System.out.println("Type in an operator: +, -, *, or /");
        op = KB.next();
        System.out.println("Now, type a number for b:");
        b = KB.nextInt();
        System.out.println("Now it's time for math majic!!");


        if (op.equals("+")) 
        {
            System.out.printf("%d + %d = %d\n", a,b,a+b);
        }
        
        else if(op.equals("-") )
        {
         System.out.printf("%d - %d = %d\n", a,b,a-b); 
        }
        
        else if(op.equals("*"))
        {
        System.out.printf("%d * %d = %d\n", a,b,a*b);  
        }
        
        else if (op.equals("/")) 
        {
        System.out.printf("%d / %d = %d\n", a,b,a/b);
        }
        
    }
}
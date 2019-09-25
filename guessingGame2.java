/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Calvin Goodman
   Date Due:   9/11/2019
 ******************************************************************************/
import java.util.Scanner;
import java.util.Random;


public class guessingGame2
{

public static void main(String[] args)   

    {
        
        Scanner KB = new Scanner(System.in);
        int a;
        int b = 22;
        

        String pa;

        do
        { 
        int c = 1;
        b++;
        System.out .printf("I'm thinking of a number between 1 - 100\n Guess it:");
        a = KB.nextInt();


            while (a != b)
            {

            if (a < b)
            {
                System.out.println("Too low");
            }

            else 
            {
                System.out.println("Too high");
            }

            
            System.out.println("Guess again");
            a = KB.nextInt();
            c ++;
            }
        
            System.out.printf("Congrats!!!!\n It only took you %d tries!!\n", c);

            if (c < 5)
            {
                System.out.println("i think you hacked the program!");
            }

            else if (c < 10)
            {
                System.out.println("You're rad smart!!");
            }
        
            else if (c < 15)
            {
                System.out.println("Not too bad");
            }
        
            else if (c < 20)
            {
                System.out.printf("You're pretty...\n average (ha ha)\n");
            }

            else
            {
                System.out.printf("U dum!!");
            }

            System.out.printf("Do you want to play again (yes/no):");
                pa = KB.next();


        } while (pa.equals("yes"));
            




    }
}
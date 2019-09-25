/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Calvin Goodman
   Date Due:   9/11/2019
 ******************************************************************************/
import java.util.Scanner;

public class guessingGame
{
    public static void main(String[] args)
    {

        Scanner KB = new Scanner(System.in);

        int a = 7777;
        int b;
        String name;
        String hint;
        String yes = "yes";

        System.out.println("Please give me your name");
            name = KB.nextLine();
        
        System.out.println("        ............................................................");  
        System.out.println("                  Hey " + name + ", let's play a game!               ");
        System.out.println("        |..All you have to do is guess the number I'm thinking of..| ");
        System.out.println("        |        Here's a hint: it's between 1 & 10,000            | ");
        System.out.println("        ............................................................");
        System.out.println("Your guess:");
        b = KB.nextInt();

        while (b != a)
        {
    
            if (b > a) 
            {
                System.out.println("Sorry " +name+ ", you're too high :(");
                System.out.println("Do you want a hint?");
                hint = KB.next();
                if (hint.equals("yes"))
                {
                    System.out.println("It's a 'holy number'");
                }
                System.out.printf("Try again:");
            }
        
        
            else 
            {
                System.out.printf("\nSorry %s, you guessed too low :(\n", name);
                System.out.println(" Do you want a hint?");
                hint = KB.next();
                if (hint.equals("yes"))
                {
                    System.out.println("This number could be considered 'holy'");
                }
                System.out.printf("Try again:");
            }
            b = KB.nextInt();
        }


        if (b == a) 
            {
                System.out.printf("\nCongrats %s!! You guessed it!\n You must be some sort of physic!\n", name);
                System.out.println("  []  []  ");
                System.out.println("    {}    ");
                System.out.println("  _    _  ");
                System.out.println("   -__-   ");
            }
    }
}
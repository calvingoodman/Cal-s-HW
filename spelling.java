/******************************************************************************
 CLASS INFORMATION                                    * Score: __________ *
 -----------------                                    *************************
   Programmer: Calvin Goodman
   Date Due:   9/11/2019
 ******************************************************************************/
import java.util.Scanner;


public class spelling
{

public static void main(String[] args)   

    {
        Scanner KB = new Scanner(System.in);

        String [] spellingWords;
        String [] definitions;
        int number;

        // Setting up word list w/ definitions

        System.out.println("How many spelling words do you have?");
                number = KB.nextInt();

        spellingWords = new String [number + 1];

        for (int i=1; i <= number; i++)
        {
            System.out.println("Enter word number " + i + ": ");
                spellingWords [i] = KB.next();
        }

        definitions = new String [number + 1];

        for (int i=1; i <= number; i++)
        {
            System.out.printf("Now, enter the definition of " + spellingWords [i] + ": ");
                definitions [i] = KB.next() + KB.nextLine(); //This solved the problem
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        // Preliminaries out of the way!
        // Actual 'game' starts now
        String answer;


        System.out.println("Alright, you're all set!");


        for (int i=1;i<=number;i++)
        {
        System.out.println("What is: " + definitions [i] + "?");
            answer = KB.next();
            if (answer.equals(spellingWords [i]))
            {
                System.out.println("Well done!");
            }
            else 
            {
                System.out.println("Incorrect");
                System.out.println("The correct way to spell it is: " + spellingWords [i]);
            }


        }
        
        

            




    }
}
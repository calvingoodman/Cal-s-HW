/******************************************************************************
 CLASS INFORMATION                                    * Score: __________ *
 -----------------                                    *************************
   Programmer: Calvin Goodman
   Date Due:   9/11/2019
 ******************************************************************************/
// Spelling Review Helper - user gives spelling words w/ definitions. 
//  Definitions given back randomly - user must then spell word correctly.
import java.util.Scanner;
import java.io.*;

public class spelling
{

public static void main(String[] args)   

    {
        Scanner KB = new Scanner(System.in);

        Process  exitCode;
        int number; 
        String [] spellingWords;
        String [] definitions;
        String answer;
        String da;

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
        
//Attempting to clear screen
        try {

        if (System.getProperty("os.name").startsWith( "Window" ) ) {
            exitCode = Runtime.getRuntime().exec( "cls" );
        } else {
        exitCode = Runtime.getRuntime().exec( "clear" );
        }

        } catch (java.io.IOException e) {
            for (int i = 0; i < 1000; i++)  {
                System.out.println();
            }
        }

// It's not working!!! ;(
    // It is trying, but the catch is running instead, giving 1000 empty print lines





        // Preliminaries out of the way!
        // Actual 'game' starts now
       System.out.println("Alright, you're all set!"); 
       
       do
        {
        

        for (int i=1;i<=number;i++)
        {
        System.out.println("What is: " + definitions [i] + "?"); //Here is where i think the randomization is needed
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
            System.out.printf("Do you want to keep reviewing? (y/n): ");
                da = KB.next();

        } while (da.equals("y"));
            




    }
}
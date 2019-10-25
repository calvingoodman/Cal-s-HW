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
import java.util.Random;

public class spelling2
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
                Random rand = new Random();
        }

        definitions = new String [number + 1];

        for (int i=1; i <= number; i++)
        {
            System.out.printf("Now, enter the definition of " + spellingWords [i] + ": ");
                definitions [i] = KB.next() + KB.nextLine();  //This solved the line problem
                Random rand = new Random(); 
        }

        System.out.println(var rand = definitions[Math.floor(Math.random() * definitions.length)]);
    }
}
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
            System.out.printf("Now, enter the definition for word number " + i + ": \n"); 
                definitions [i] = KB.nextLine();
        }
        



        System.out.println(spellingWords [1]);
        System.out.println(definitions [2]);
        

            




    }
}
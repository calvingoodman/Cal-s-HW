/******************************************************************************
 CLASS INFORMATION                                    * Score: __________ *
 -----------------                                    *************************
   Programmer: Calvin Goodman
   Date Due:   9/11/2019
 ******************************************************************************/
import java.util.Scanner;


public class array
{

public static void main(String[] args)   

    {Scanner KB = new Scanner(System.in);
        int [] numbers;
        numbers = new int [3];

        numbers[0] = 4;
        numbers[1] = KB.nextInt();
        numbers[2] = 9;

        System.out.println("The second number you entered was " + numbers[1]);

    }
}
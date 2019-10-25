/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Calvin Goodman
   Date Due:   9/25/2019
 ******************************************************************************/
import java.util.Scanner;

public class array
{
    public static void main(String[] args)
    {
        Scanner KB = new Scanner(System.in);

        int howMany;
        int sum = 0;
        int [] grades;

        System.out.println("How many grade do u want me to get the sum and average of??");
            howMany = KB.nextInt();

            System.out.printf("grades\n", howMany);
                
                grades = new int [howMany];

            for (int i = 0; i < howMany; i++)
            {
            System.out.printf("Please enter grade number %d\n", i);
                grades [i] = KB.nextInt();
            }

            for (int i = 0; i < howMany; i++)
            {
                sum += grades [i];
            }

            System.out.println("The sum of your numbers is " + sum);
            System.out.println("The average is " + sum/howMany);
    }
}
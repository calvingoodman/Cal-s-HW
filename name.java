/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Calvin Goodman
   Date Due:   9/11/2019
 ******************************************************************************/
import java.util.Scanner;

public class name
{
    public static void main(String[] args)
    {

        Scanner KB = new Scanner(System.in);

        String a;
        System.out.println("Give me a name");
            a = KB.next();
        
        if (a.equals("calvin")) 
        {
            System.out.println("That's my favorite name");
        }
        else if (a.equals("bobby")) 
        {
            System.out.println("That's my second favorite name!!");
        }
        else 
        {
            System.out.println("I hate that name!!!");
        }

    }
}
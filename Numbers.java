/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Caitlyn Brown
   Date Due:   8/20/2019
 ******************************************************************************/
import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {

    Scanner KB = new Scanner(System.in);

      int a;
      int b;
      String d;
      String yes = "yes";
      String square = "square";
      String cube = "cube";
      String halve = "halve";
      String playAgain = KB.next();
      String no = "no";
      


        System.out.println("      Pick a number, any number!");
          a = KB.nextInt();
        System.out.println("      Now, give me another number, and we'll add them together");
          b = KB.nextInt();
      int c = a + b;
        System.out.println("Your number is now " + c);
  

        System.out.printf("       So, do you want to square, cube, or halve your number?:");
          d = KB.next();
            if (d.equals(square)) {
              System.out.println("Your new number is " + c*c);
        }
            
            if (d.equals(cube)) {
              System.out.println("Your new number is " + c*c*c);
        }
            
          
          if (d.equals(halve)) {
              System.out.println( "Your new number is " + c/2);
          }
              
          System.out.println("Do you want to play again??");
                
        

          if (playAgain.equals(yes)) {
            System.out.println("Joke's on you, I don't know how loops work yet!!;)");
          }
          if (playAgain.equals(no)) {

            System.out.println("OK, thanks for playing!!");
              System.out.println("  []  [] ");
              System.out.println("    {}    ");
              System.out.println("  _    _  ");
              System.out.println("   -__-   ");
          }

        

    }   

}


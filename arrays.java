/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Calvin Goodman
   Date Due:   9/25/2019
 ******************************************************************************/
import java.util.Scanner;

public class arrays
{
    public static void main(String[] args)
    {
        Scanner KB = new Scanner(System.in);

        int howMany;
        int sum = 0;
        int [] grades;
        int average;

        System.out.println("How many grade do u want me to get the average of??");
            howMany = KB.nextInt();

            System.out.printf("Please enter %d grades\n", howMany);
                
                grades = new int [howMany];

            for (int i = 0; i < howMany; i++)
            {
            System.out.printf("Grade:");
                grades [i] = KB.nextInt();
            }

            for (int i = 0; i < howMany; i++)
            {
                sum += grades [i];
            }

            System.out.println("The average is " + sum/howMany);
                average = sum/howMany;

        if (average >= 100) {
            System.out.println("You got an A+");
            System.out.println("                                       AA      +                              ");
            System.out.println("                                      AAAA    +++                              ");
            System.out.println("                                     A    A    +                             ");
            System.out.println("                                   :::::::::::::::                                    ");
            System.out.println("                                   : Well done!! :                                    ");
            System.out.println("                                   :::::::::::::::                                    ");
        }
        else if (average < 100 && average >89) {
            System.out.println("You got an A");
            System.out.println("                                          AA                                   ");
            System.out.println("                                         AAAA                                 ");
            System.out.println("                                        A    A                                 ");
            System.out.println("                                   :::::::::::::::                                    ");
            System.out.println("                                   :    Nice!    :                                    ");
            System.out.println("                                   :::::::::::::::                                    ");
        }
        else if (average < 90 && average >79) {
            System.out.println("You got a B");
            System.out.println("                                        BBBB                                 ");
            System.out.println("                                        B   B                           ");
            System.out.println("                                        B B                               ");
            System.out.println("                                        B   B                          ");
            System.out.println("                                        BBBB                             ");
            System.out.println("                                    ::::::::::::                                   ");
            System.out.println("                                    : Good job :                                    ");
            System.out.println("                                    ::::::::::::                                   ");
        }
        else if (average < 80 && average >69) {
            System.out.println("You got a C");
            
            System.out.println("                                       CCCCC                      ");
            System.out.println("                                       C                          ");
            System.out.println("                                       C                          ");
            System.out.println("                                       CCCCC                      ");
            System.out.println("");
            System.out.println("Did you forget to study?");
        }
        else if (average < 70 && average >59) {
            System.out.println("You got a D");


            System.out.println("                                       DDDD                        ");
            System.out.println("                                       D   D                       ");
            System.out.println("                                       D   D                       ");
            System.out.println("                                       DDDD                        ");
            System.out.println("");
            System.out.println("Never expect to preform well if you don't put the work in first");
            }



        else {
            System.out.println("You FAILED!!!!");
            System.out.println("                                        FFFF                        ");
            System.out.println("                                        F                           ");
            System.out.println("                                        FFF                         ");
            System.out.println("                                        F                           ");
            System.out.println("                                        F                           ");
            System.out.println("");
            System.out.println("Laziness is no excuse for poor grades");
        }





    }




}
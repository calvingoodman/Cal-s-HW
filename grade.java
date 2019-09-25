/******************************************************************************
 CLASS INFORMATION                                    * Score: ______________ *
 -----------------                                    *************************
   Programmer: Caitlyn Brown
   Date Due:   8/20/2019
 ******************************************************************************/
import java.util.Scanner;

public class grade
{
    public static void main(String[] args)
    {

    Scanner KB = new Scanner(System.in);

    int g;
    System.out.println("         ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~    ");
    System.out.println("         **  This program will tell you what grade you recieved, based on your score  **    ");
    System.out.println("         **                 Please enter the score that you recieved:                 **    ");
    System.out.println("         ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~    ");
    


        g = KB.nextInt();

        if (g >= 100) {
            System.out.println("A+");
            System.out.println("                                       AA      +                              ");
            System.out.println("                                      AAAA    +++                              ");
            System.out.println("                                     A    A    +                             ");
            System.out.println("                                   :::::::::::::::                                    ");
            System.out.println("                                   : Well done!! :                                    ");
            System.out.println("                                   :::::::::::::::                                    ");
        }
        else if (g < 100 && g >89) {
            System.out.println("A");
            System.out.println("                                          AA                                   ");
            System.out.println("                                         AAAA                                 ");
            System.out.println("                                        A    A                                 ");
            System.out.println("                                   :::::::::::::::                                    ");
            System.out.println("                                   :    Nice!    :                                    ");
            System.out.println("                                   :::::::::::::::                                    ");
        }
        else if (g < 90 && g >79) {
            System.out.println("B");
            System.out.println("                                        BBBB                                 ");
            System.out.println("                                        B   B                           ");
            System.out.println("                                        B B                               ");
            System.out.println("                                        B   B                          ");
            System.out.println("                                        BBBB                             ");
            System.out.println("                                    ::::::::::::                                   ");
            System.out.println("                                    : Good job :                                    ");
            System.out.println("                                    ::::::::::::                                   ");
        }
        else if (g < 80 && g >69) {
            System.out.println("C");
            
            System.out.println("                                       CCCCC                      ");
            System.out.println("                                       C                          ");
            System.out.println("                                       C                          ");
            System.out.println("                                       CCCCC                      ");
            System.out.println("");
            System.out.println("Did you forget to study?");
        }
        else if (g < 70 && g >59) {
            System.out.println("D");


            System.out.println("                                       DDDD                        ");
            System.out.println("                                       D   D                       ");
            System.out.println("                                       D   D                       ");
            System.out.println("                                       DDDD                        ");
            System.out.println("");
            System.out.println("Never expect to preform well if you don't put the work in first");
            }



        else if (g <= 60) {
            System.out.println("F");
            System.out.println("                                        FFFF                        ");
            System.out.println("                                        F                           ");
            System.out.println("                                        FFF                         ");
            System.out.println("                                        F                           ");
            System.out.println("                                        F                           ");
            System.out.println("");
            System.out.println("Laziness is no excuse for poor grades");
        }

        else {
            System.out.println("Sorry, that's not a valid entry");
        }





    }
}
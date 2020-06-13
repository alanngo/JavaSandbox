import java.util.*;
import static java.lang.System.*;
public class Main //RandomNumberGuessingGame
{
    static void log(Object o){out.println(o);}
    static void score(int x)
    {
        if (x>0 && x<=3)
            log("Great work! You are a mathematical wizard.");
        else
            log("Not Too bad! You got some potential");
    }

    static int getIntWithinRange(int min, int max)
    {
        log("I am thinking of a number from "+min+"to +" +max+"\n Try to guess it.");
        out.print("Enter a number");
        return new Scanner(in).nextInt();
    }


    public static void main (String [] args)
    {

        /**
         * System.in: keyboard
         * Scanner(): Scanner constructor
         * next() ~cin: reads up to the first space
         * nextLine() ~getline(cin, var): reads up to the first \n character (includes spaces)
         * */
        Random ro = new Random();
        int randomNumber = ro.nextInt(101);

        int numberOfGuesses = 0;
        String again ="y";
        while(again.equalsIgnoreCase("y"))
        {
            while (numberOfGuesses < 7)
            {
                int num = getIntWithinRange(0, 100);
                //edge cases
                if (num <randomNumber)
                    log("Too low");
                else if (num > randomNumber)
                    log("Too high");

                //main case
                else
                {
                    log("correct guess ");
                    break;
                }
                numberOfGuesses++;
            }
            log("Number is: "+ randomNumber);
            log("Number of guesses: "+ numberOfGuesses);
            score(numberOfGuesses);
            out.print("Try again y/n? ");
            numberOfGuesses = 0;
            again = new Scanner(in).next();
        } //end of while loop
        log("Bye Come back soon");
    }
}


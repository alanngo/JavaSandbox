package exception;

import java.util.*;
import static java.lang.System.*;

public class Sandbox
{
    static void log(Object o) { out.println(o); }

    //checked exceptions
    void fn0() throws Exception
    {
        throw new Exception();
    }

    void fn1() throws Exception {fn0();}

    static void unhandled(int x, int y)
    {
        log(x/y);
        log("end of function");
    }

    static void tryCatch(int x, int y)
    {
        try
        {
            log(x/y);
            log("end of try block"); //never goes here
        }
        catch (ArithmeticException e)
        {
            log("inside catch block");
            log(e);
        }
        log("end of try-catch");
    }

    static void tryCatchFinally(int x, int y)
    {
        try //possible exception thrown
        {
            log("");
            log(x/y);
            log("end of try block");
        }
        catch (ArithmeticException e) //handling exception
        {
            log("inside catch block");
            log(e);
        }
        finally //always runs whether exception is thrown or not
        {
            log("executed whether exception is thrown or not");
        }
        log("end of try-catch-finally");
    }

    static void tryFinally(int x, int y)
    {
        try //possible exception thrown
        {
            log("");
            log(x/y);
            log("end of try block");
        }
        finally //always runs whether exception is thrown or not
        {
            log("executed whether exception is thrown or not");
        }
        log("end of finally");
    }
    public static void main(String[] args)
    {

        for (int i =0; i<100; i++)
        {
            out.print("enter choice");
            int choice = new Scanner(in).nextInt();

            out.print("enter x ");
            int x = new Scanner(in).nextInt();

            out.print("enter y ");
            int y = new Scanner(in).nextInt();

            switch(choice)
            {
                case 0:
                    unhandled(x, y);
                    break;
                case 1:
                    tryCatch(x, y);
                    break;
                case 2:
                    tryCatchFinally(x, y);
                    break;
                case 3:
                    tryFinally(x, y);
                    break;
            }
        }
    }


}

package oop.animal;

import static java.lang.System.out;

public class Driver
{
    static void log(Object o){out.print(o);}
    static void logLn(Object o){out.println(o);}

    public static void main(String [] args)
    {
        logLn("Wolf");

        Animal a = new Wolf(); //cannot instantiate interfaces
        a.walk();
        a.speak();
        a.eat();

        logLn("Bear");
        Animal b = new Bear(); //cannot instantiate interfaces
        b.walk();
        b.speak();
        b.eat();
    }

}

package oop.override;

public class Main
{
    public static void main(String [] args)
    {
        Base b = new Base();
        b.print0();
        b.print1();

        System.out.print("\n");
        Derived d = new Derived();
        d.print0();
        d.print1();
    }


}

package oop.override;

public class Derived extends Base
{
    @Override
    public void print0()
    {
        System.out.println("Inside Derived print0 function");
    }

    @Override
    public void print1()
    {
        super.print1();
        System.out.println("Inside Derived print1 function");
    }
}

package oop.car;

public class Mustang extends Car
{
    public Mustang()
    {
        super(); //calling the base constructor
        System.out.println("calling Mustang constructor");
    }

    public void brake() {System.out.println("braking mustang");}

    @Override
    public void drive(String destination)
    {
        System.out.println("Mustang is driving to "+destination);
    }

}

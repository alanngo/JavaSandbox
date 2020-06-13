package oop.car;

public class Car //base car
{
    private int miles;

    public Car()
    {
        System.out.println("calling car constructor");
        miles = 0;
    }

    public void drive()
    {
        System.out.println("calling car drive");
        miles++;
    }

    public void drive(String destination)
    {
        System.out.println("Car driving to "+destination);
    }


    public int getMiles(){return miles;}
}

package oop.animal;

public class Bear implements Animal
{

    @Override
    public void walk() {
        System.out.println("Bear walking");
    }

    @Override
    public void eat() {
        System.out.println("Bear eating");
    }

    @Override
    public void speak() {
        System.out.println("Bear speaking");
    }


}

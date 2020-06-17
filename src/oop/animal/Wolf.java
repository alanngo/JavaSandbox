package oop.animal;

public class Wolf implements Animal {
    @Override
    public void walk() {
        System.out.println("Wolf walking");
    }

    @Override
    public void eat() {
        System.out.println("Wolf eating");
    }

    @Override
    public void speak() {
        System.out.println("Wolf speaking");
    }
}

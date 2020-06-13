package oop.car;

public class Main
{
    public static void main(String [] args)
    {
        //static bind to car
        Car c = new Car();
        c.drive();
        c.drive("Houston");
        //c.brake(); part of Mustang, illegal
        System.out.println(c.getMiles());

        System.out.println();
        //static bind mustang
        Mustang m = new Mustang();
        m.drive();
        m.brake();
        m.drive("Ft Worth");
        System.out.println(m.getMiles());

        System.out.println();
        //dynamic bind to car
        Car m1 = new Mustang();
        m1.drive("Dallas");
        ((Mustang) m1).brake();
    }
    /*
    * private: class only
    * ________inherited__________
    * default: package
    * protected: subclass
    * public: global
    * */
}

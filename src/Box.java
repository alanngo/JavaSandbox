import java.util.ArrayList;

import static java.lang.System.*;
public class Box <E>
{
    private E obj;

    public Box(E o)
    {
        obj = o;
    }
    public E get(){return obj;}
    public void print(){out.println(obj);}


    //
    public static void main(String [] args)
    {
        Box<String> b0 = new Box<>("keivn"); //contains a string b0: Object, Box: class
        String value = b0.get(); //string value
        out.println(value);

        Box<Integer> b1 = new Box<>(123456); //contains a string
        Integer value1 = b1.get(); //integer value
        out.println(value1);

        ArrayList<Integer> ints;
        ArrayList<String> blah;
        ArrayList<Object> objs;
    }

}

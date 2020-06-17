import static java.lang.System.out;

class Range
{
    int start;
    int end;

    Range(int s, int e)
    {
        start = s;
        end = e;
    }

    boolean contains(int x)
    {
        return end - start >=0;
    }

}

class Finder implements Runnable
{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run()
    {

    }
}




public class ThreadTest implements Runnable
{
    static void log(Object o){out.print(o);}
    static void logLn(Object o){out.println(o);}
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run()
    {
        logLn("Running main");
    }

    static Range myRange = new Range(100, 500);


    public static void main(String[] args)
    {
        if (myRange.contains(300))
        {
            System.out.println ("You\'re within the correct range.");
        }

        Finder fc = new Finder();
        Thread t1= new Thread(fc);
        t1.start();

        Thread t2= new Thread(fc);
        t2.start();

        Thread t3 = new Thread(fc);
        t3.start();

        Thread t4 = new Thread(fc);
        t4.start();

        Runnable myRunnable = new Runnable(){
            public void run(){
                System.out.println("Runnable running");
            }
        };
        myRunnable.run();
    }


}


/**
 * 1. Add a class named Finder to the Runnable interface.
 *         2. In the Main class, add a code to the method to create and start the four Finder threads.
 *         3. Threads should check the outlined ranges.
 *         4. Modify the Finder class so its run method utilizes the sleep method.
 *
 *
 *         This is what I am working on
 *
 *
 *         Can you use a for loop on Threads?
 *
 *
 *         or a For Each
 *
 * */

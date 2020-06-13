package dp;
import java.util.*;
import static java.lang.System.*;

public class Fib
{
    static void log(Object o) { out.println(o); }
    static Map<Long, Long> cache = new HashMap<>(); //key->x, value ->fib(x)

    //optimized fibbonaci
    static long fib(long x)
    {
        long zero = 0;
        long one = 1;
        long two = 2;
        cache.put(zero,zero);
        cache.put(one, one);
        cache.put(two, one);

        if (cache.containsKey(x))
            return cache.get(x);

        cache.put(x, fib(x-1)+fib(x-2));
        return cache.get(x);
    }

    public static void main(String[] args)
    {
        for( long i=0; i< 100; i++)
        {
            log(i+" "+fib(i));
        }
    }


}

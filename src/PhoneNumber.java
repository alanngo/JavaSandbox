
import java.util.*;
import java.util.Map.*;
import static java.lang.System.*;

public class PhoneNumber
{
    private static Map<String, Integer> cache = new HashMap<>();

    private static String generatePhoneNumber()
    {
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<10; i++)
        {
            int randDigit = new Random().nextInt(10);
            sb.append(randDigit);
        }
        return sb.toString();
    }

    private static void dial(String phoneNumber)
    {
        int success = new Random().nextInt(50); //did the caller answer
        out.println("dialing "+phoneNumber);
        cache.put(phoneNumber, success);
    }

    private static void dialFromCache()
    {
        out.println("dialing people who answered");
        int cnt =0;
        for (Entry<String, Integer> e : cache.entrySet())
        {
            if (e.getValue()%2==0) //successful answer
            {
                dial(e.getKey());
                cnt++;
            }
        }
        out.println("Number of people who answered: "+ cnt);
    }
    private static void dialRandom(int sampleSize)
    {
        out.println("dialing random");
        for (int i =0; i<sampleSize; i++)
        {
            String phoneNumber = generatePhoneNumber();
            dial(phoneNumber);
        }
    }


    public static void main(String [] args)
    {
            dialFromCache();

            int sampleSize = 100;
            dialRandom(sampleSize);
            dialFromCache();
    }
}

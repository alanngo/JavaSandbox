package payroll.resource;
import java.util.*;
/**
 * Resources class
 *
 * getMonth(String month): static method
 *
 * The method should receive a short form of month in String format and return the corresponding month number.
 *
 * For an invalid month, 0 should be returned.
 *
 * month received will contain 3 characters starting with uppercase character.
 *
 * E.g. -
 *  If the month value received is Sep, 9 should be returned
 *  If the month value received is sep, 0 should be returned
 * */
public class Resources
{
    private static final String[] months ={"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                                            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static int getMonth(String month)
    {
        Map<String, Integer> calender = new HashMap<>();

        // populate calender
        for (int i = 0; i<months.length; i++)
            calender.put(months[i], i+1);

        if (calender.containsKey(month))
            return calender.get(month);

        return 0;
    }
}

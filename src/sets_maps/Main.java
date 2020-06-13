package sets_maps;
import java.util.*;
import static java.lang.System.*;
public class Main
{
    static void log(Object o) { out.println(o); }

    static void populate(Map<String, Integer> m)
    {
        String [] names = {"Alan", "Waleed", "Connor", "Josh", "Angela",
                "Smruti", "Kevin", "Lyndon", "Manisha", "Shreya"};
        for (String n: names)
            m.put(n, new Random().nextInt(100));
    }

    static void populate(Set<String> s)
    {
        String [] names = {"Ben", "Omar", "Kate", "Zach", "Colin",
                "Hannah", "Catrina", "Sheetal", "Stacey", "Neha", "Omar"};
        s.addAll(Arrays.asList(names));
    }

    public static void main(String [] args)
    {
        log("NO DUPLICATES");
        log("sets_maps");

        log("Regular HashMap, no particular order");
        Map<String, Integer> m0 = new HashMap<>();
        populate(m0);
        log(m0);

        log("LinkedHashMap, insertion order");
        Map<String, Integer> m1 = new LinkedHashMap<>();
        populate(m1);
        log(m1);

        log("TreeMap, sorted order");
        Map<String, Integer> m2 = new TreeMap<>();
        populate(m2);
        log(m2);

        log("Sets: maps w/o value, just key");

        log("Regular HashSet, no particular order");
        Set<String> s0 = new HashSet<>();
        populate(s0);
        log(s0);

        log("Linked HashSet, insertion order");
        Set<String> s1 = new LinkedHashSet<>();
        populate(s1);
        log(s1);

        log("TreeSet, sorted order");
        Set<String> s2 = new TreeSet<>();
        populate(s2);
        log(s2);
    }

}

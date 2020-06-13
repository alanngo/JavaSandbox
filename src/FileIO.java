import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class FileIO
{
    static void log(Object o){out.print(o);}
    static void logln(Object o){out.println(o);}

    static Set<String> readFile(Set<String>type, File f) throws Exception
    {
        Set<String> ret = type;
        Scanner sc = new Scanner(f); //read file from scanner
        while (sc.hasNextLine())
        {
            String line = sc.nextLine();
            ret.add(line);
        }
        sc.close();

        return ret;
    }

    public static void main(String[] args) throws Exception
    {
        Set<String> resturaunts = readFile(new LinkedHashSet<>(),new File("src/resturaunts.txt"));
        logln(resturaunts);
        log("done");
    }

}

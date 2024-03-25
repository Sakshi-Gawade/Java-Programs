import java.io.*;
import java.util.*;

public class p74
{
    public static void main(String args[])throws IOException, FileNotFoundException
    {
        FileInputStream f = new FileInputStream("t1.txt");
        BufferedInputStream b = new BufferedInputStream(f);

        System.out.println("Reversed contents are:");
        int s = f.available();

        for(int i=s-1; i>=0; i--)
        {
            b.mark(i);
            b.skip(i);
            System.out.print((char)b.read());
            b.reset();
        }
        b.close();

        FileReader r = new FileReader("t1.txt");
        String result = "";
        int d;
        int d1;

        while((d=r.read())!=-1)
        {
            d1 = Character.toUpperCase(d);
            result += (char)d1;
        } 
        r.close();

        FileWriter w = new FileWriter("t1.txt");
        w.write(result);
        w.close();
    }
}
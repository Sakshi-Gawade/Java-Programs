/*Write a program to accept a text file from user and display the contents of a file in
reverse order and change its case */
import java.io.*;
import java.util.*;

public class p85
{
    public static void main(String a[])throws IOException, FileNotFoundException
    {
        FileInputStream f = new FileInputStream("s2.txt");
        BufferedInputStream b = new BufferedInputStream(f);

        System.out.println("Reverse contents of the file:");
        int s = f.available();

        for(int i=s-1; i>=0; i--)
        {
            b.mark(i);
            b.skip(i);
            System.out.print((char)b.read());
            b.reset();
        }
        b.close();

        FileReader r = new FileReader("s2.txt");
        String result="";
        int d;
        int d1;

        while((d=r.read())!=-1)
        {
            d1 = Character.toUpperCase(d);
            result += (char)d1;
        }
        r.close();

        FileWriter w = new FileWriter("s2.txt");
        w.write(result);
        w.close();
    }
}
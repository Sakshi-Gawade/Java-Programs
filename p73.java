/*Write a program to accept a text file from user and display the contents of a file in
reverse order and change its case */

import java.io.*;
import java.util.Iterator;

public class p73
{
    public static void main(String args[])throws IOException, FileNotFoundException
    {
        FileInputStream f = new FileInputStream("s1.txt");
        BufferedInputStream b = new BufferedInputStream(f);

        System.out.println("The content in reverse order are:");
        int s = f.available();

        for(int i=s-1; i>=0; i--)
        {
            b.mark(i);
            b.skip(i);
            System.out.print((char)b.read());
            b.reset();
        }
        b.close();
        System.out.println();

        FileReader r = new FileReader("s1.txt");
        String result="";
        int d;
        int d1;

        while((d=r.read())!=-1)
        {
            d1 = Character.toUpperCase(d);
            result += (char)d1;
        }

        r.close();
        FileWriter w = new FileWriter("s1.txt");
        w.write(result);
        w.close();
    }
}
import java.util.*;
import java.io.*;

class p86
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first file name:");
        String f1 = sc.next();
    
        System.out.println("Enter second file name:");
        String f2 = sc.next();

        FileReader r = new FileReader(f1);
        FileWriter w = new FileWriter(f2,false);

        int c ;
        while((c=r.read())!=-1)
        {
            w.write(c);
        }

        w.write("\nEnd of the file");
        System.out.println("Copy has done");

        r.close();
        w.close();


    }
}
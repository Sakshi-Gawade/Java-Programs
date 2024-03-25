//Create file 

import java.lang.*;
import java.util.*;
import java.io.*;

class p6
{
    public static void main(String args[])
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter filename");
            String filename = sc.next();
            File fobj = new File(filename);
            if(fobj.createNewFile())
            {
                System.out.println("File  is successfully created");
            }
            else
            {
                System.out.println("File is already existing");
            }
        }
        catch(IOException obj)
        {
            System.out.println(obj);
        }
        
    }
}
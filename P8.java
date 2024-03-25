//Write a program which accept string from user and display small characters from that string.
import java.lang.*;
import java.util.*;

class StringX
{
    public void strSmall(String Str)
    {
        char []arr = Str.toCharArray();
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>='a' && arr[i]<='z')
            {
                System.out.print(arr[i]);
            }
        }
    }
}

class P8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        StringX sobj = new StringX();
        sobj.strSmall(str);
    }
}
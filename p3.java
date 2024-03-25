//Write a java program which accepts 2 strings from user and concat N characters of second string after first string. Value of N should be accepted from user.

import java.lang.*;
import java.util.*;

class StringDemo
{
    public  void StrNCatX(String src, String dest, int iCnt)
    {
        for(int i=0; i<iCnt; i++)
        {
            src = src + dest.charAt(i);
        }
        System.out.println("\nFirst string after concatenation: \"" +src+ "\"");
    }
}

class p3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string");
        String str2 = sc.nextLine();
        System.out.println("Enter the number");
        int no = sc.nextInt();
        StringDemo obj = new StringDemo();
        obj.StrNCatX(str1,str2,no);
    }
}
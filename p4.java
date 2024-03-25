//write a program which accept string from user and return difference between frequency of small characters and frequency of capital character.

import java.lang.*;
import java.util.*;

class Character
{
   public int Frequency(String Str)
   {
      int chap = 0, small = 0, Diff = 0;
      char[] arr = new char[Str.length()];
      for(int i=0; i<Str.length(); i++)
      {
         arr[i]=Str.charAt(i);
         if(arr[i]>='A'&& arr[i]<='Z')
         {
            chap++;
         }
         else if(arr[i]>='a' && arr[i]<='z')
         {
            small++;
         }
      }
      Diff = chap - small;
      return Diff;
   }
}

class p4
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string");
      String str = sc.next();
      Character obj = new Character();
      int iRet = obj.Frequency(str);
      System.out.println("Difference is:"+iRet);
   }
}
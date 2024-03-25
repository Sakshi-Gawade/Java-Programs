/*Write java program which accept string from user and display below pattern.

Input:  Hello

Output:  H  e   l   l   o
         H  e   l   l   *
         H  e   l   *   *
         H  e   *   *   *   
         H  *   *   *   *
*/

import java.lang.*;
import java.util.*;

class Display
{
    public void Pattern(char arr[])
    {
        int i=0, j=0;
        for(i=0; i<arr.length; i++)
        {
            for(j=0; j<arr.length; j++)
            {
                if(i>=j)
                {
                    System.out.print(arr[j]+"     ");
                }
                else
                {
                    System.out.print("#"+"     ");
                }
            }
                System.out.println(); 
        }
    }
}

class P40
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next();

        char arr[] = new char[str.length()];

        for(int i=0; i<str.length(); i++)
        {
            arr[i] = str.charAt(i);
        }
        
        Display obj = new Display();
        obj.Pattern(arr);
    }
}

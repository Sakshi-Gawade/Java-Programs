/*Write java program which accept string from user and display below pattern.

Input:  Hello

Output:  H  e   l   l   o
         H  e   l   l   o
         H  e   l   l   o
         H  e   l   l   o
         H  e   l   l   o
*/

import java.lang.*;
import java.util.*;

class Display
{
    public void Pattern(char arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                System.out.print(arr[j]+"     ");
            }
            System.out.println();
        }
    }
}

class P33
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

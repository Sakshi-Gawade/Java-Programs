/*Write java program which accept string from user and display below pattern.

Input:  Hello

Output:  H  *   *   *   *   
         H  e   *   *   *
         H  e   l   *   *   
         H  e   l   l   *
         H  e   l   l   o
*/

import java.lang.*;
import java.io.*;

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
                    System.out.print("*"+"     ");
                }
            }
                System.out.println(); 
        }
    }
}

class P38
{
    public static void main(String args[])throws Exception
    {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter the string:");
        String str = br.readLine();

        char arr[] = new char[str.length()];

        for(int i=0; i<str.length(); i++)
        {
            arr[i] = str.charAt(i);
        }
        
        Display obj = new Display();
        obj.Pattern(arr);
    }
}

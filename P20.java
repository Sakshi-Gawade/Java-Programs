// Write java program whcih accept array of characters from user and return difference between frequency of capital characters and frequency of small characters.

import java.lang.*;
import java.util.*;

class MyArray
{
    public int Difference(char arr[])
    {
        int capital = 0, small = 0, Diff = 0; 
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>='A' && arr[i]<='Z')
            {
                capital++;
            }
            else if(arr[i]>='a' && arr[i]<='z')
            {
                small++;
            }
        }
        Diff = capital - small;
        return Diff;
    }
}

class P20
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of charcters:");
        int n = sc.nextInt();

        char arr[] = new char[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter character"+" "+i+":");
            arr[i] = sc.next().charAt(0);
        }

        MyArray obj = new MyArray();
        int iRet = obj.Difference(arr);
        System.out.println("Difference is:"+iRet);
    } 
}
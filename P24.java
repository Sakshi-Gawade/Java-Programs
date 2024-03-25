// Write java program which accept array from user and return count of capital characters

import java.lang.*;
import java.util.*;

class MyArray
{
    public int CountCapital(char arr[])
    {
        int capital = 0; 
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>='A' && arr[i]<='Z')
            {
                capital++;
            }
        }
        return capital;
    }
}

class P24
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
        int iRet = obj.CountCapital(arr);
        System.out.println("Captal characters are:"+iRet);
    } 
}
// Write a java program which accept array of characters from user and accept one character. Return occurrence of that character without considering the case.

import java.lang.*;
import java.util.*;

class MyClass
{
    public int Search(char arr[], char Ch)
    {
        int iCnt = 0;
        for(iCnt=0; iCnt<arr.length; iCnt++)
        {
            if(arr[iCnt]==Ch)
            {
                break;
            }
        }
        return iCnt;
    }
}

class P19
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many characters:");
        int Size = sc.nextInt();

        System.out.println("Enter the character:");
        char ch = sc.next().charAt(0);

        char arr[] = new char[Size];

        System.out.println("Enter the array elements:");
        for(int i=0; i<Size; i++)
        {
            arr[i] = sc.next().charAt(0);
        }

        MyClass obj = new MyClass();
        int Ret = obj.Search(arr,ch);
        System.out.println("Occurance of character is:"+Ret);
        
    }
}
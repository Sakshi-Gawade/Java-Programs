// Write a Java program which accept array from user and reverse each number of that array.

import java.lang.*;
import java.util.*;

class MyArray
{
    public void Reverse(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            while(arr[i]!=0)
            {
                int iDigit = arr[i] % 10;
                System.out.print(iDigit);
                arr[i] = arr[i] / 10;
            }
            System.out.print("      ");
        }
    }
}

class P22
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many elements:");
        int Size = sc.nextInt();

        int arr[] = new int[Size];

        System.out.println("Enter the array elements:");
        for(int i=0; i<Size; i++)
        {
            arr[i] = sc.nextInt();
        }

        MyArray obj = new MyArray();
        obj.Reverse(arr);
    }
}
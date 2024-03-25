//Write java program which accept array from user and replace each number with summation of its digit.

import java.lang.*;
import java.util.*;

class MyArray
{
    public void SumArray(int arr[])
    {
        int Sum = 0;
        System.out.println("Addition of digits in each number:");
        for(int i=0; i<arr.length; i++)
        {
            while(arr[i]!=0)
            {
                int Digit = arr[i]%10;
                Sum = Sum + Digit;
                arr[i]=arr[i]/10; 
            }
            System.out.println(Sum);
            Sum=0;
        }
    }
}

class P23
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many numbers:");
        int Size = sc.nextInt();

        int arr[] = new int[Size];
        System.out.println("Enter the array elements:");
        for(int i=0; i<Size; i++)
        {
            arr[i] = sc.nextInt();
        }

        MyArray obj = new MyArray();
        obj.SumArray(arr);
    }
}
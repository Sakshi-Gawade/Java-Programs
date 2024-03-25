//write java program which accept marks of N students from user and display class of each student.

import java.lang.*;
import java.util.*;

class MyArray
{
    public void Percentage(float arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>0 && arr[i]<=35)
            {
                System.out.println(arr[i]+"="+"Fail");
            }
            else if(arr[i]>35 && arr[i]<=50)
            {
                System.out.println(arr[i]+"="+"Pass class");
            }
            else if(arr[i]>50 && arr[i]<=60)
            {
                System.out.println(arr[i]+"="+"second class");
            }
            else if(arr[i]>60 && arr[i]<=70)
            {
                System.out.println(arr[i]+"="+"First class");
            }
            else
            {
                System.out.println(arr[i]+"="+"First class with distinction");
            }
        }
    }
}

class P25
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many marks you want to enter:");
        int Size = sc.nextInt();

        float arr[] = new float[Size];

        System.out.println("Enter the marks:");
        for(int i=0; i<Size; i++)
        {
            arr[i] = sc.nextFloat();
        }

        MyArray obj = new MyArray();

        obj.Percentage(arr);
    }
}
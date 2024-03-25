/* Write Java program which accept array from user and display below pattern.

Input : 8   9   7   6   4   2   4
Output : *   *   *   *   *   *   *   *
         *   *   *   *   *   *   *   *   *
         *   *   *   *   *   *   *   
         *   *   *   *   *   *   
         *   *   *   *   
         *   *   
         *   *   *   *
*/

import java.lang.*;
import java.util.*;

class MyArray
{
    public void Pattern(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i]; j++)
            {
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }
}

class P21
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
        obj.Pattern(arr);
    }
}
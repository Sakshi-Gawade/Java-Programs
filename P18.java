//Write java program which accept array of charcters from user and replace each capital character with its corresponding small characters.

import java.lang.*;
import java.util.*;

class MyArray
{
    public void ArrayReplace(char arr[])
    {
       
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>='A' && arr[i]<='Z')
            {
                arr[i]+=32;
                System.out.println(arr[i] +"   ");
            }
        }
        
    }
}

class P18
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many characters:");
        int Size = sc.nextInt();

        char arr[] = new char[Size];

        System.out.println("Enter the elements of array");
        for(int i=0; i<Size; i++)
        {
            arr[i] = sc.next().charAt(0);
        }

        MyArray obj = new MyArray();
        obj.ArrayReplace(arr);
    }
}
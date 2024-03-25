//Write a Java program which accept two arrays from user and return difference between summation of arrays.

import java.io.*;
import java.lang.*;
class P26
{
    public static void main(String args[])throws Exception
    {
        InputStreamReader r = new InputStreamreader(System.in);
        BufferedReader br = new Bufferedreader(r);
        System.out.println("How many elements you waant enter in first array:");
        int Size1 = br.readLine();

        int arr[] = new int[Size];
        system.out.println("Enter the elements for first array");
        for(int i=0; i<Size1; i++)
        {
            arr[i] = br.readline();
        }
    }
}
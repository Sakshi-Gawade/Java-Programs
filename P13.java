//Accept one number from user and print that number of * on the screen

import java.lang.*;
import java.util.*;

class Display
{
    public void DisplayStar(int iNo)
    {
        for(int i=0; i<iNo; i++)
        {
            System.out.print("*" +" ");
        }
    }
}

class P13
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iValue = sc.nextInt();
        Display obj = new Display();
        obj.DisplayStar(iValue); 
    }
}
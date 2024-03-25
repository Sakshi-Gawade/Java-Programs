//Accept two numbers from user and display first number in second number of times.

import java.lang.*;
import java.util.*;

class Display
{
    public void DisplayNum(int iNo1, int iNo2)
    {
        while(iNo1!=0)
        {
            System.out.print(iNo2 +"  ");
            iNo1--;
        }
    }
}

class P14
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int iValue1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int iValue2 = sc.nextInt();
        Display obj = new Display();
        obj.DisplayNum(iValue1, iValue2);
    }
}
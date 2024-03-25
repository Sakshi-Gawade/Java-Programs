//Write program which accept one number from user and print that number of even numbers on screen.

import java.lang.*;
import java.util.*;

class EvenNum
{
    public void Even(int iNo)
    {
        iNo = iNo*2;
        for(int i=1; i<=iNo; i++)
        {
            if(i % 2==0)
            {
                System.out.println(i);
            }
        }
    }
}

class P16
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int Value1 = sc.nextInt();
        EvenNum obj = new EvenNum();
        obj.Even(Value1);
    }
}


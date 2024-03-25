//Program to divide two numbers.
import java.lang.*;
import java.util.*;

class Divide
{
    public int DivideNum(int no1, int no2)
    {
        int Ans = no1 / no2;
        return Ans;
    }
}

class p9
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int No1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int No2 = sc.nextInt();
        Divide obj = new Divide();
        int iRet = obj.DivideNum(No1,No2);
        System.out.println("Result is:"+iRet); 
    }
}
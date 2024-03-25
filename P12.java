//Accept one number from user and check whether it is divisible by 5 or not.

import java.lang.*;
import java.util.*;

class CheckNo
{
    public boolean DivisibleByFive(int No)
    {
        if(No%5==0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
class P12
{
    public static void main(String args[])
    {
        boolean bRet = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int iValue = sc.nextInt();
        CheckNo obj = new CheckNo();
        bRet = obj.DivisibleByFive(iValue);
        if(bRet==true)
        {
            System.out.println("Number is divisible by 5");
        }
        else
        {
            System.out.println("Number is not divisible by 5");
        }

    }
}
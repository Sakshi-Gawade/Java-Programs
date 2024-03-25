/*Write a Program to print all Prime numbers in an array of "n" elements.
(use command line arguments*/

import java.lang.*;

class p62
{
    public static void main(String[] args)
    {
        if(args.length<2)
        {
            System.out.println("Invalid number of arguments");
            return;
        }

        for(int i=0;i<args.length; i++)
        {
            int num = Integer.parseInt(args[i]);
            if(isPrime(num))
            {
                System.out.println(num+" ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num)
    {
        if(num <= 1)
        {
            return false;
        }
        for(int i=2; i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
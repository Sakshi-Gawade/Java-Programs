//Write a program to print all prime numbers in an array of 'n' elements(Use command line arguments)
import java.util.Scanner;
public class p43
{
    public static void main(String args[])
    {
        int iCnt = 0;
        int[] a = new int[5];
        for(int i=0; i<5; i++)
        {
            a[i]=Integer.parseInt(args[i]);
        }

        for(int i=0; i<a.length; i++)
        {
            boolean isPrime = true;
            for(int j=2; j<a[i]; j++)
            {
                if(a[i]%j==0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)

            System.out.println(a[i] + " is the prime numbers in the array ");
        }
    }
}


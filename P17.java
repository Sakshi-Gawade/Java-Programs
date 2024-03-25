//Write a program which accept number from user and print even factors of that number.

import java.lang.*;
import java.util.*;

class Factors
{
    public int iNo;

    public Factors(int no)
    {
        this.iNo = no;
    }

    public void EvenFactors()
    {
        for(int i=1; i<iNo; i++)
        {
            if((iNo%i==0) && (i%2==0))
            {
                System.out.print(i +"    ");
            }
        }
        System.out.println();
    }

    public void OddFactors()
    {
        for(int i=1; i<iNo; i++)
        {
            if((iNo%i==0) && (i%2!=0))
            {
                System.out.print(i +"    ");
            }
        }
    }

}

class P17
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iValue = sc.nextInt();
        Factors obj = new Factors(iValue);
        obj.EvenFactors();
        obj.OddFactors();
    }
}
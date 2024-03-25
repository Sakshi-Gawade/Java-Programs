//Decimal to binary
import java.lang.*;
import java.util.*;

class BitWise
{
    public void DisplayBinary(int no)
    {
        while(no!=0)
        {
            int iDigit=no%2;
            System.out.println(iDigit);
            no = no/2;
        }
        System.out.println();
    }
}

class p5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int iNo = sc.nextInt();
        BitWise bobj = new BitWise();
        bobj.DisplayBinary(iNo);
    }
}
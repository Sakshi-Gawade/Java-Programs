import java.lang.*;

class p96
{
    public static void main(String args[])
    {
        int i=0,j=0;
        int[] a = new int[5];
        for(i=0; i<5; i++)
        {
            a[i] = Integer.parseInt(args[i]);
        }

        for(i=0; i<a.length; i++)
        {
            boolean isprime = true;
            for(j=1; j<a[i]; j++)
            {
                if(a[i]%j==0)
                {
                    isprime = false;
                    break;
                }
                if(isprime)
                    System.out.println(a[i]+"is prime number");
            }
        }
    }
}
/*Define a class MyNumber having one private int data member. Write a default constructor to
initialize it to 0 and another constructor to initialize it to a value (Use this). Write methods
isNegative, isPositive, isZero, isOdd, isEven. Create an object in main.Use command line
arguments to pass a value to the Object */

class MyNumber
{
    private int num;
    MyNumber()
    {
        num=0;
    }
    MyNumber(int num)
    {
        this.num=num;
    }

    public boolean isNegative()
    {
        if(num<0)
            return true;
        else 
            return false;
    }

    public boolean isPositive()
    {
        if(num>0)
            return true;
        else 
            return false;
    }

    public boolean isZero()
    {
        if(num==0)
            return true;
        else 
            return false;
    }

    public boolean isEven()
    {
        if(num%2==0)
            return true;
        else 
            return false;
    }

    public boolean isOdd()
    {
        if(num%2!=0)
            return true;
        else 
            return false;
    }

    public static void main(String args[])throws ArrayIndexOutOfBoundsException
    {
        int x = Integer.parseInt(args[0]);
        MyNumber obj = new MyNumber(x);

        if(obj.isNegative())
        {
            System.out.println("Number is negative");
        }
        if(obj.isPositive())
        {
            System.out.println("Number is positive");
        }
        if(obj.isZero())
        {
            System.out.println("zero");
        }
        if(obj.isEven())
        {
            System.out.println("Number is even");
        }
        if(obj.isOdd())
        {
            System.out.println("Number is odd");
        }
    }    
}
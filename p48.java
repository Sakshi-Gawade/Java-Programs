/* Define a class MyNumber having one private int data member. write a default constructor to initialize it to zero another constructor to intialize it to value(Use this).
Write methods isNegative, isPositive, isZero, isOdd, isEven. Create an object in main. Use command line arguments to pass a value to the object.
*/

class MyNumber
{
    private int data;
        public MyNumber()
        {
            data = 0;
        }
        public MyNumber(int x)
        {
            this.data = x;
        }
        public boolean isNegative()
        {
            if(data<0)
                return true;
            else 
                return false;   
        }
        public boolean isPositive()
        {
            if(data>0)
                return true;
            else 
                return false;   
        }
        public boolean isEven()
        {
            if(data%2==0)
                return true;
            else 
                return false;   
        }
        public boolean isOdd()
        {
            if(data%2!=0)
                return true;
            else 
                return false;   
        }
        public boolean isZero()
        {
            if(data==0)
                return true;
            else 
                return false;   
        }
}

class p48
{
    public static void main(String args[])
    {
        int x = Integer.parseInt(args[0]);
        MyNumber obj= new MyNumber(x);
        if(obj.isNegative())
        {
            System.out.println("Number is Negative");
        }
        if(obj.isPositive())
        {
            System.out.println("Number is Positive");
        }
        if(obj.isEven())
        {
            System.out.println("Number is Even");
        }
        if(obj.isOdd())
        {
            System.out.println("Number is Odd");
        }
        if(obj.isZero())
        {
            System.out.println("Number is Zero");
        }
    }
}
/*) Define a class MyDate(Day, Month, year) with methods to accept and display a MyDateobject.
Accept date as dd,mm,yyyy. Throw user defined exception "InvalidDateException" if the date
is invalid.*/
import java.util.*;

class InvalidDateException extends Exception
{}

class Mydate
{
    int day,mon,yr;
    void accept(int d, int m, int y)
    {
        day=d;
        mon=m;
        yr=y;
    }
    void display()
    {
        System.out.println("Date is Valid:"+day+"/"+mon+"/"+yr);
    }
}

class p88
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Date:dd mm yyyy");
        int day = sc.nextInt();
        int mon = sc.nextInt();
        int yr = sc.nextInt();
        int flag=0;

        try
        {
            if(mon<=0 || mon>12)
                throw new InvalidDateException();
            else
            {
                if(mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12)
                {
                    if(day>=1 && day<=31)
                        flag = 1;
                    else
                        throw new InvalidDateException();
                }
                else if(mon==2)
                {
                    if(yr%4==0)
                    {
                        if(day>=1 && day<=29)
                            flag = 1;
                        else
                            throw new InvalidDateException(); 
                    }
                    else
                    {
                        if(day>=1 && day<=28)
                            flag = 1;
                        else
                            throw new InvalidDateException();
                    }
                }
                else
                {
                    if(mon==2||mon==4||mon==6||mon==9||mon==11)
                    {
                        if(day>=1 && day<=30)
                            flag = 1;
                        else
                            throw new InvalidDateException(); 
                    }
                }
            }
            if(flag==1)
            {
                Mydate obj = new Mydate();
                obj.accept(day,mon,yr);
                obj.display();
            }
        }
        catch(InvalidDateException mm)
        {
            System.out.println("Invalid Date");
        }
    }
}
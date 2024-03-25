/*Design a class for Bank. Bank Class should support following operations;
a. Deposit a certain amount into an account
b. Withdraw a certain amount from an account
c. Return a Balance value specifying the amount with details
*/

class Bank
{
    String AccHolder;
    double Balance;

    Bank(String AccHolder, double Balance)
    {
        this.AccHolder = AccHolder;
        this.Balance = Balance;
    }

    public void deposit(double amount)
    {
        if(amount>0)
        {
            Balance += amount;
            System.out.println("Deposited $"+amount);
        }
        else
        {
            System.out.println("invalid deposit amount");
        }
    } 

    public void withdraw(double amount)
    {
        if(amount>0 && amount<=Balance)
        {
            Balance-=amount;
            System.out.println("Withdraw $"+amount);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    public void CheckBalance()
    {
        System.out.println();
        System.out.println("Account Holder:"+AccHolder);
        System.out.println("Current Balance:"+Balance);
    }

    public static void main(String args[])
    {
        Bank bobj = new Bank("Sakshi",2000.0);
        bobj.CheckBalance();
        bobj.deposit(500.0);
        bobj.withdraw(200.0);
        bobj.CheckBalance();
    }
}
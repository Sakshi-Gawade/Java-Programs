import java.util.Scanner;

class Customer {
    String name;
    String phoneNumber;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

class Depositor extends Customer {
    int accNo;
    double balance;

    public Depositor(String name, String phoneNumber, int accNo, double balance) {
        super(name, phoneNumber);
        this.accNo = accNo;
        this.balance = balance;
    }
}

class Borrower extends Depositor {
    int loanNo;
    double loanAmount;

    public Borrower(String name, String phoneNumber, int accNo, double balance, int loanNo, double loanAmount) {
        super(name, phoneNumber, accNo, balance);
        this.loanNo = loanNo;
        this.loanAmount = loanAmount;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
        System.out.println("Loan Number: " + loanNo);
        System.out.println("Loan Amount: " + loanAmount);
    }
}

class Cdemo
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int n = scanner.nextInt();

        Borrower[] customers = new Borrower[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for customer " + (i + 1) + ":");
            scanner.nextLine();  // Consume newline character

            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Account Number: ");
            int accNo = scanner.nextInt();
            System.out.print("Balance: ");
            double balance = scanner.nextDouble();
            System.out.print("Loan Number: ");
            int loanNo = scanner.nextInt();
            System.out.print("Loan Amount: ");
            double loanAmount = scanner.nextDouble();

            customers[i] = new Borrower(name, phoneNumber, accNo, balance, loanNo, loanAmount);
        }

        System.out.println("Customer Details:");
        for(int i=0;i<n;i++) 
		{
			
            customers[i].displayDetails();
            System.out.println();
        }
        scanner.close();
    }
}

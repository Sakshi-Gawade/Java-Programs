import java.util.Scanner;

abstract class Staff 
{
    private String name;
    private String address;

    public Staff(String name, String address) 
    {
        this.name = name;
        this.address = address;
    }

    public abstract void display();
}

class FullTimeStaff extends Staff 
{
    private String department;
    private double salary;

    public FullTimeStaff(String name, String address, String department, double salary) 
    {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void display() 
    {
        System.out.println("Full-Time Staff Details:");
        System.out.println("Name: " + super.name);
        System.out.println("Address: " + super.address);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

class PartTimeStaff extends Staff 
{
    private int numberOfHours;
    private double ratePerHour;

    public PartTimeStaff(String name, String address, int numberOfHours, double ratePerHour) 
    {
        super(name, address);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public void display() 
    {
        System.out.println("Part-Time Staff Details:");
        System.out.println("Name: " + super.name);
        System.out.println("Address: " + super.address);
        System.out.println("Number of Hours: " + numberOfHours);
        System.out.println("Rate per Hour: $" + ratePerHour);
    }
}

public class p57 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of staff members: ");
        int n = scanner.nextInt();

        Staff[] staffMembers = new Staff[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter staff type (1 for Full-Time, 2 for Part-Time): ");
            int staffType = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter address: ");
            String address = scanner.nextLine();

            if (staffType == 1) 
            {
                System.out.print("Enter department: ");
                String department = scanner.nextLine();
                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();
                staffMembers[i] = new FullTimeStaff(name, address, department, salary);
            } else if (staffType == 2) 
            {
                System.out.print("Enter number of hours: ");
                int numberOfHours = scanner.nextInt();
                System.out.print("Enter rate per hour: ");
                double ratePerHour = scanner.nextDouble();
                staffMembers[i] = new PartTimeStaff(name, address, numberOfHours, ratePerHour);
            } else 
            {
                System.out.println("Invalid staff type. Please enter 1 for Full-Time or 2 for Part-Time.");
                i--; // Decrement i to repeat the input for this iteration
            }
        }

        System.out.println("\nStaff Information:");
        for (Staff staff : staffMembers) 
        {
            System.out.println("\n====================");
            staff.display();
        }

        scanner.close();
    }
}

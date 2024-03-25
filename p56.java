import java.util.Scanner;

class Vehicle {
    private String company;
    private double price;

    public Vehicle(String company, double price) 
    {
        this.company = company;
        this.price = price;
    }

    public void display() 
    {
        System.out.println("Company: " + company);
        System.out.println("Price: $" + price);
    }
}

class LightMotorVehicle extends Vehicle 
{
    private double mileage;

    public LightMotorVehicle(String company, double price, double mileage) 
    {
        super(company, price);
        this.mileage = mileage;
    }

    @Override
    public void display() 
    {
        super.display();
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

class HeavyMotorVehicle extends Vehicle 
{
    private double capacityInTons;

    public HeavyMotorVehicle(String company, double price, double capacityInTons) 
    {
        super(company, price);
        this.capacityInTons = capacityInTons;
    }

    @Override
    public void display() 
    {
        super.display();
        System.out.println("Capacity: " + capacityInTons + " tons");
    }
}

public class p56 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vehicles: ");
        int n = scanner.nextInt();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the type of vehicle (1 for Light, 2 for Heavy): ");
            int  type = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Enter the company: ");
            String company = scanner.nextLine();
            System.out.print("Enter the price: ");
            double price = scanner.nextDouble();

            if (type == 1) 
            {
                System.out.print("Enter mileage: ");
                double mileage = scanner.nextDouble();
                vehicles[i] = new LightMotorVehicle(company, price, mileage);
            } else if (type == 2) {
                System.out.print("Enter capacity in tons: ");
                double capacityInTons = scanner.nextDouble();
                vehicles[i] = new HeavyMotorVehicle(company, price, capacityInTons);
            } else {
                System.out.println("Invalid vehicle type. Please enter 1 for Light or 2 for Heavy.");
                i--; // Decrement i to repeat the input for this iteration
            }
        }

        System.out.println("\nVehicle Information:");
        for (Vehicle vehicle : vehicles) 
        {
            System.out.println("\n====================");
            vehicle.display();
        }

        scanner.close();
    }
}






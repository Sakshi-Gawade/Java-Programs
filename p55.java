import java.util.ArrayList;
import java.util.Scanner;

class Customer {
    private String custno;
    private String custname;
    private String contactnumber;
    private String custaddr;

    public Customer(String custno, String custname, String contactnumber, String custaddr) {
        this.custno = custno;
        this.custname = custname;
        this.contactnumber = contactnumber;
        this.custaddr = custaddr;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer Number: " + custno);
        System.out.println("Customer Name: " + custname);
        System.out.println("Contact Number: " + contactnumber);
        System.out.println("Customer Address: " + custaddr);
    }

    public String getContactnumber() {
        return contactnumber;
    }
}

public class p55 {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Customer Number (press Enter to exit): ");
            String custno = scanner.nextLine();
            if (custno.isEmpty()) {
                break;
            }

            System.out.print("Enter Customer Name: ");
            String custname = scanner.nextLine();

            System.out.print("Enter Contact Number: ");
            String contactnumber = scanner.nextLine();

            System.out.print("Enter Customer Address: ");
            String custaddr = scanner.nextLine();

            Customer customer = new Customer(custno, custname, contactnumber, custaddr);
            customers.add(customer);
        }

        System.out.print("Enter the Contact Number to search for a customer: ");
        String searchContact = scanner.nextLine();
        boolean found = false;

        for (Customer customer : customers) {
            if (customer.getContactnumber().equals(searchContact)) {
                customer.displayCustomerDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Customer not found with the given contact number.");
        }

        scanner.close();
    }
}






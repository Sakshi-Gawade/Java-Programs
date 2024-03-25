import java.util.*;

class Employee {
    private int empId;
    private String empName;
    private String empDesignation;
    private int empSal;

    // Constructor
    public Employee(int empId, String empName, String empDesignation, int empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSal = empSal;
    }

    // Override the toString() method to provide a customized representation
    @Override
    public String toString() {
        return "Employee ID: " + empId + "\n" +
               "Employee Name: " + empName + "\n" +
               "Employee Designation: " + empDesignation + "\n" +
               "Employee Salary: " + empSal;
    }
}

public class p54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id:");
        int empId = sc.nextInt();
        System.out.println("Enter the employee name:");
        String empname = sc.next();
        System.out.println("Enter the employee designation:");
        String empDesignation = sc.next();
        System.out.println("Enter the Employee salary:");
        int empsalary = sc.nextInt();
        Employee employee = new Employee(empId,empname,empDesignation,empsalary);

        // Display Employee information using toString()
        System.out.println(employee.toString());

    }
}

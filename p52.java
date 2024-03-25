/*Write program to define class Person with data member as Personname,Aadharno, Panno. Accept 
information for 5 objects and display appropriate information (use this keyword).*/

import java.util.Scanner;

class Person 
{
    private String Personname;
    private String Aadharno;
    private String Panno;

    Person(String Personname, String Aadharno, String Panno) {
        this.Personname = Personname;
        this.Aadharno = Aadharno;
        this.Panno = Panno;
    }

    public void displayInfo() {
        System.out.println("Person Name: " + this.Personname);
        System.out.println("Aadhar Number: " + this.Aadharno);
        System.out.println("PAN Number: " + this.Panno);
    }
}

class p52
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Aadhar Number: ");
            String aadhar = scanner.nextLine();
            System.out.print("PAN Number: ");
            String pan = scanner.nextLine();

            people[i] = new Person(name, aadhar, pan);
        }

        System.out.println("\nInformation for all 5 people:");
        for (int i=0;i<5;i++) {
            people[i].displayInfo();
            System.out.println();
        }
    }
}






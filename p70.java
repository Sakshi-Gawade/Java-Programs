/*Write a program to display the Employee(Empid, Empname, Empdesignation, Empsal)
information using toString().*/

class Employee
{
    int Empid;
    String Empname;
    String Empdesignation;
    float Empsal;

    Employee(int Empid, String Empname, String Empdesignation, float Empsal)
    {
        this.Empid = Empid;
        this.Empname = Empname;
        this.Empdesignation = Empdesignation;
        this.Empsal = Empsal;
    }

    public String toString()
    {
        return"["+Empid+" "+Empname+" "+Empdesignation+" "+Empsal+"]";
    }

    public static void main(String args[])
    {
        Employee E1 = new Employee(1,"Sakshi","Sotware Engineer",20000);

        System.out.println(E1);
    }
}
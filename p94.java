/*Create an employee class(id,name,deptname,salary). Define a default and parameterized
constructor. Use this keyword to initialize instance variables. Keep a count of objects
created. Create objects using parameterized constructor and display the object count after
each object is created. (Use static member and method). Also display the contents of each
object. */


class employee
{
    static int count =0;
    int id;
    String name;
    String deptname;
    float salary;
    
    employee()
    {
        id=0;
        name=null;
        deptname=null;
        salary = 0.0f;
    }
    employee(int id, String name, String deptname, float salary)
    {
        this.id=id;
        this.name=name;
        this.deptname=deptname;
        this.salary = salary;
    }
    void display()
    {
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("department name:"+deptname);
        System.out.println("salary:"+salary);
        
    }
    static void objcount()
    {
        count++;
        System.out.println("The count of object:"+count);
        System.out.println();
    }
    
    public static void main(String args[])
    {
        employee emp = new employee(101,"sakshi","abc",200000.0f);
        employee emp1 = new employee(101,"sakshi","abc",200000.0f);
        emp.display();
        employee.objcount();
        emp1.display();
        employee.objcount();
        
    }
}
/*Define an abstract class Staff with protected members id and name. Define a parameterized
constructor. Define one subclass OfficeStaff with member department. Create n objects of
OfficeStaff and display all details */

import java.lang.*;
import java.util.*;

abstract class Staff
{
    protected int id;
    protected String name;

    Staff(int id, String name)
    {
        this.id = id;
        this.name = name;
    } 
    abstract void display();
}

class OfficeStaff extends Staff
{
    String dept;
    OfficeStaff(int id, String name, String dept)
    {
        super(id,name);
        this.dept = dept;
    }

    void display()
    {
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Department:"+dept);
    }
}

class p63
{
    public static void main(String args[])
    {    
        OfficeStaff obj1 = new OfficeStaff(1,"sakshi","Computer");
        OfficeStaff obj2 = new OfficeStaff(2,"Tushar","IT");
        obj1.display();
        obj2.display();

    }
}
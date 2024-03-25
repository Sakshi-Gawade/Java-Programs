/*Create an abstract class "order" having members id, description. Create two subclasses
"PurchaseOrder" and "Sales Order" having members customer name and Vendor name
respectively. Definemethods accept and display in all cases. Create 3 objects each of Purchase
Order and Sales Order and accept and display details*/

import java.util.*;

abstract class order
{
    int id;
    String description;
    order()
    {
        id = 0;
        description = null;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id:");
        id = sc.nextInt();
        System.out.println("Enter Description:");
        description = sc.next();
    }
    abstract void display();
}

class PurchaseOrder extends order
{
    String c_name;
    PurchaseOrder()
    {
        c_name = null;
    }

    void accept()
    {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer name:");
        c_name = sc.next();
        System.out.println();
    }

    void display()
    {
        System.out.println(id+" "+description+" "+c_name);
    }
}

class SalesOrder extends order
{
    String v_name;
    SalesOrder()
    {
        v_name = null;
    }
    void accept()
    {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vendor name:");
        v_name = sc.next();
        System.out.println();
    }

    void display()
    {
        System.out.println(id+" "+description+" "+v_name);
    }
}

class p71
{
    public static void main(String args[])
    {
        PurchaseOrder p1 = new PurchaseOrder();
        p1.accept();
        PurchaseOrder p2 = new PurchaseOrder();
        p2.accept();
        SalesOrder s1 = new SalesOrder();
        s1.accept();
        SalesOrder s2 = new SalesOrder();
        s2.accept();
        p1.display();
        p2.display();
        s1.display();
        s2.display();
    }
}


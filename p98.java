
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
    OfficeStaff(int id,String name, String dept)
    {
        super(id,name);
        this.dept = dept;
    }

    void display()
    {
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Department:"+dept);
        System.out.println();
    }
}

class p98
{
    public static void main(String args[])
    {
        OfficeStaff obj = new OfficeStaff(1,"Sakshi","BCS");
        obj.display();
        OfficeStaff obj1 = new OfficeStaff(2,"Saku","BCA");
        obj1.display();

    }
}
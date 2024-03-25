//Create a class student(rollno, name, class, per) to read student information from the console and display them(using buffered class)

import java.io.*;

class p44
{
    private String rollno;
    private String name;
    private String studentClass;
    private double percentage;

    public p44(String rollno, String name, String studentClass, double percentage) 
    {
        this.rollno = rollno;
        this.name = name;
        this.studentClass = studentClass;
        this.percentage = percentage;
    }

    public void display() 
    {
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Class: " + studentClass);
        System.out.println("Percentage: " + percentage + "%");
    }

    public static void main(String args[])throws IOException
    {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        System.out.println("Enter your Roll No. :");
        String no = br.readLine();

        System.out.println("Enter your name:");
        String name = br.readLine();

        System.out.println("Enter your class:");
        String Class = br.readLine();

        System.out.println("Enter your Percentage");
        double per = Double.parseDouble(br.readLine());

        p44 obj = new p44(no,name,Class,per);
        obj.display();

    }
}
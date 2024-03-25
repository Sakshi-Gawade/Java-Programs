/*Write a program to create a package name student. Define class StudentInfo with method to
display information about student such as rollno, class, and percentage. Create another class
StudentPer with method to find percentage of the student. Accept student details like
rollno, name, class and marks of 6 subject from user*/

import java.util.*;

class student95
{
    Scanner sc = new Scanner(System.in);
    String name;
    String rollno;
    float per;

    void accept()
    {
        System.out.println("Enter student name:");
        name = sc.nextLine();
        System.out.println("Enter student roll no.:");
        rollno = sc.next();
        System.out.println("Enter student percentage:");
        per = sc.nextFloat();
    }
    static void sort(student95 s[], int n)
    {
        student95 temp = new student95();
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(s[i].per>s[j].per)
                {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
    }

    public String toString()
    {
        return name+" "+rollno+" "+per;
    }

    public static void main(String args[])
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter how many students:");
        int n = sc1.nextInt();

        student95 obj[] = new student95[n];
        for(int i=0; i<n; i++)
        {
            obj[i] = new student95();
            obj[i].accept();
        }
        student95.sort(obj,n);
        for(int i=0; i<n; i++)
        {
            System.out.println(obj[i]);
        }
    }


}
/*Define a class patient (patient_name, patient_age, patient_oxy_level,patient_HRCT_report).
Create an object of patient. Handle appropriate exception while patient oxygen level less than
95% and HRCT scan report greater than 10, then throw user defined Exception "Patient is Covid
Positive(+) and Need to Hospitalized" otherwise display its information.*/

import java.util.*;

class LessOxygen extends Exception
{
    public String toString()
    {
        return "Patient is covid positive";
    }
}

class MoreHRCT extends Exception
{
    public String toString()
    {
        return "Need to Hospitalized";
    }
}

class Patient
{
    String patient_name;
    int patient_age;
    int patient_oxy_level;
    int patient_HRCT_report;

    void accept()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter patient name:");
            patient_name = sc.next();

            System.out.println("Enter patient age:");
            patient_age = sc.nextInt();

            System.out.println("Enter patient oxygen level:");
            patient_oxy_level = sc.nextInt();
            if(patient_oxy_level<95)
            {
                throw new LessOxygen();
            }

            System.out.println("Enter patient HRCT:");
            patient_HRCT_report = sc.nextInt();
            if(patient_HRCT_report>10)
            {
                throw new MoreHRCT();
            }
        }
        catch(LessOxygen lo)
        {
            System.out.println(lo);
        }
        catch(MoreHRCT mh)
        {
            System.out.println(mh);
        }
    }
    void display()
    {
        System.out.println("Patient Information:");
        System.out.println("Patient name:"+patient_name);
        System.out.println("Patient age:"+patient_age);
        System.out.println("Patient oxygen level:"+patient_oxy_level);
        System.out.println("Patient HRCT:"+patient_HRCT_report);
    }
}

public class p83
{
    public static void main(String args[])
    {
        Patient obj = new Patient();
        obj.accept();
        obj.display();
    }
}
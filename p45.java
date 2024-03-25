// Write a program to read the first name and last name of a person, his weigth and height using command line arguments. Calculate the BMI index which is defined as the indivisuals body mass divided by the square their height. 
import java.lang.*;

class p45
{
    public static void main(String args[])
    {
        String First_name = args[0];
        String Last_name = args[1];
        int weight = Integer.parseInt(args[2]);
        float height = Float.parseFloat(args[3]);

        System.out.println("Name:"+args[0]+" "+args[1]);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
        float BMI = weight/(height*height);
        System.out.println("Body mass index is:"+BMI);
    }
}
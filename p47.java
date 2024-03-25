// Create a class Sphere to calculate the volume and surface area of sphere.
import java.util.*;

class Sphere
{
    //double pie = 3.14;
    public void CalculateSphere(float r)
    {
        double Area = 4*Math.PI*(r*r);
        System.out.println("Area is:"+Area);

        double Volume = (4/3)*Math.PI*(r*r*r);
        System.out.println("Volume is:"+Volume);
    }
}

class p47
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        float rad = sc.nextFloat();

        Sphere obj = new Sphere();
        obj.CalculateSphere(rad);
    }
}
/* Write a program to read the First Name and Last Name of a person, his weight and height using
command line arguments. Calculate the BMI Index which is defined as the individual's body mass
divided by the square of their height.
(Hint : BMI = Wts. In kgs / (ht)2
) */

class p64
{
    public static void main(String args[])
    {
        String First_Name = args[0];
        String Last_Name = args[1];
        int weight = Integer.parseInt(args[2]);
        int height = Integer.parseInt(args[3]);

        System.out.println("Name:"+args[0]+" "+args[1]);
        System.out.println("Weight:"+weight+"kg");
        System.out.println("Height:"+height+"m");

        float BMI = weight/(height*height);
        System.out.println("Body mass index is:"+BMI);
    }
}
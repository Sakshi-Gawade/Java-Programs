import java.lang.*;
import java.util.*;

class AL
{
    public static void main(String args[])
    {
        ArrayList<String> obj = new ArrayList<String>();

        obj.add("January");
        obj.add("February");
        obj.add("March");
        obj.add("Marvellous");
        obj.add("April");
        obj.add(2,"New");
        obj.add("May");
        obj.add("Marvellous");
        obj.add("Marvellous");
        obj.add("Marvellous");

        System.out.println("Arraylist contains:"+obj);
        System.out.println("Size is:"+obj.size());
    }
}
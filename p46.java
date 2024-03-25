import java.util.*;
class p46
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many cities:");
        int Size = sc.nextInt();

        String arr[] = new String[Size];
        System.out.println("Enter the city names:");
        Scanner sc1=new Scanner(System.in);    
        for(int i=0; i<Size; i++)
        {
            arr[i] = sc1.nextLine();
        }

        Arrays.sort(arr);

        System.out.println();
        for(int i=0; i<Size; i++)
        {
            System.out.println(arr[i]);
        } 
    }  
}  
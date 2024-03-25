/*Write  menu driven program to perform the following operations on multidimentinal array i.e matrices
*Addtion  *Multiplication  *Exit
*/
import java.util.*;

class p49
{
    public static void main(String args[])
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many rows:");
        int row = sc.nextInt();
        System.out.println("Enter the how many columns:");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        int brr[][] = new int[row][col];

        System.out.println("Enter the elements for first array:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements for second array:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                brr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements for first array:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }

        System.out.println("Elements for second array:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(brr[i][j]+"   ");
            }
            System.out.println();
        }

        do
        {
            System.out.println("1: Addition of two matrices");
            System.out.println("2: Multiplication of two matrices");
            System.out.println("3: Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    int Sum[][]=new int[row][col];
                    for(int i=0; i<row; i++)
                    {
                        for(int j=0; j<col; j++)
                        {
                            Sum[i][j] = arr[i][j] + brr[i][j];
                        }
                    }
                    for(int i=0; i<row; i++)
                    {
                        for(int j=0; j<col; j++)
                        {
                            System.out.print(Sum[i][j]+"  ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    int Mult[][]=new int[row][col];
                    for(int i=0; i<row; i++)
                    {
                        for(int j=0; j<col; j++)
                        {
                            Mult[i][j] = arr[i][j] * brr[j][i];
                        }
                    }
                    for(int i=0; i<row; i++)
                    {
                        for(int j=0; j<col; j++)
                        {
                            System.out.print(Mult[i][j]+"  ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.exit(0);
                    break;
                    
            }

        }while(choice!=3);
    }
}
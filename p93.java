/* Write a menu driven program to perform the following operations on multidimensional array
ie matrices :
1. Addition
2. Multiplication
3. Exit */

import java.util.*;

class Matrix
{
    public static void main(String args[])
    {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many rows:");
        int rows = sc.nextInt();

        System.out.println("Enter the how many columns:");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];
        int brr[][] = new int[rows][cols];

        System.out.println("Enter first matrix");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("first matrix");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter second matrix");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                brr[i][j] = sc.nextInt();
            }
        }

        System.out.println("second matrix");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }

        do
        {
            System.out.println("1.Addition");
            System.out.println("2.Multiplication");
            System.out.println("3.Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    int Sum[][] = new int[rows][cols];
                    for(int i=0; i<rows; i++)
                    {
                        for(int j=0; j<cols; j++)
                        {
                            Sum[i][j] = arr[i][j]+brr[i][j];
                        }
                        System.out.println();
                    }

                    System.out.println("Addition of matrices:");
                    for(int i=0; i<rows; i++)
                    {
                        for(int j=0; j<cols; j++)
                        {
                            System.out.print(Sum[i][j]+" ");
                        }
                        System.out.println();
                    }
                    break;
                
                case 2:
                    int Mult[][] = new int[rows][cols];
                    for(int i=0; i<rows; i++)
                    {
                        for(int j=0; j<cols; j++)
                        {
                            Mult[i][j] = arr[i][j]*brr[j][i];
                        }
                        System.out.println();
                    }

                    System.out.println("Multiplication of matrices:");
                    for(int i=0; i<rows; i++)
                    {
                        for(int j=0; j<cols; j++)
                        {
                            System.out.print(Mult[i][j]+" ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.exit(0);

                default:
                    System.out.println("Exit the program");
                    break;       
            }
        }while(choice!=3);
    }
}
/*Write a program to print an array after changing the rows and columns of a given
two-dimensional array. */

import java.util.*;

class p67
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter the no. of columns:");
        int cols = sc.nextInt();

        int a[][] = new int[rows][cols];
        System.out.println("Enter the array elements:");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original array elements:");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Swapped array:");
        for(int j=0; j<rows; j++)
        {
            for(int i=0; i<cols; i++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }



    }
}
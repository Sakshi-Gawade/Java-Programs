/*Write java program which accept number of rows and number of columns from user and display below pattern.

Input:  iRow = 3    iCol = 4

Output: *   #   *   #
        *   #   *   #
        *   #   *   #
        *   #   *   #
*/

import java.lang.*;
import java.util.*;

class Display
{
    public void Pattern(int iRow, int iCol)
    {
        for(int i=0; i<iRow; i++)
        {
            for(int j=0; j<iCol; j++)
            {
                if(j%2==0)
                {
                    System.out.print("*"+"    ");
                }
                else
                {
                    System.out.print("#"+"    ");
                }
            }
            System.out.println();
        }
    }
}

class P32
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();

        Display obj = new Display();
        obj.Pattern(row, col);
    }
}

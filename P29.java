/*Write java program which accept number of rows and number of columns from user and display below pattern.

Input:  iRow = 4    iCol = 4

Output:  A   A   A   A
         B   B   B   B
         C   C   C   C
         D   D   D   D
*/

import java.lang.*;
import java.util.*;

class Pattern
{
    public void DisplayPattern(int row, int col)
    {
        char ch = 'A';
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(ch+"     ");
            }
            System.out.println();
            ch++;
        }
    }
}

class P29
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();

        Pattern obj = new Pattern();
        obj.DisplayPattern(row, col);
    }
}


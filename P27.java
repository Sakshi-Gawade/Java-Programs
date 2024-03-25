/*Write java program which accept number of rows and number of columns from user and display below pattern.

Input:  iRow = 4    iCol = 4

Output:  A   B   C   D
         A   B   C   D
         A   B   C   D
         A   B   C   D
*/

import java.lang.*;
import java.util.*;

class Pattern
{
    public void Pattern(int iRow, int iCol)
    {
        for(int i=0; i<iRow; i++)
        {
            char Ch = 'A'; 
            for(int j=0; j<iCol; j++)
            {
                System.out.print(Ch+"     ");
                Ch++;
            }
            System.out.println();
        }
    }
}


class P27
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many rows:");
        int row = sc.nextInt();
        System.out.println("Enter the how many columns:");
        int col = sc.nextInt();

        Pattern obj = new Pattern();
        obj.Pattern(row,col);
    }
}
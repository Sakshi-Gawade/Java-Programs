/*Write java program which accept number of rows and number of columns from user and display below pattern.

Input:  iRow = 3    iCol = 4

Output: 1   2   3   4   
        5   6   7   8
        9   10  11  12

*/

import java.lang.*;
import java.util.*;

class Pattern
{
    public void DisplayPattern(int row, int col)
    {
        int no = 0;
        while(no!=row*col)
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                no++;
                System.out.print(no+"     ");
            }
            System.out.println();
        }
    }
}

class P31
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


/*Write java program which accept number of rows and number of columns from user and display below pattern.

Input:  iRow = 4    iCol = 4

Output:  4  4   4   4
         3  3   3   3   
         2  2   2   2
         1  1   1   1
*/

import java.lang.*;
import java.util.*;

class Pattern
{
    public void DisplayPattern(int row, int col)
    {
        
        for(int i=row; i>0; i--)
        {
            for(int j=col; j>0; j--)
            {
                System.out.print(i+"     ");
            }
            System.out.println();
        }
    }
}

class P30
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


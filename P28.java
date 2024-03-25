/*Write java program which accept number of rows and number of columns from user and display below pattern.

Input:  iRow = 4    iCol = 4

Output:  A   B   C   D
         a   b   c   d
         A   B   C   D
         a   b   c   d
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
                if(i%2==0)
                {
                    System.out.println(Character.toLowerCase(ch));
                }
                else
                {
                    System.out.println(ch+"     ");
                }
            }
        }
    }
}

class P28
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


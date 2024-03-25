import java.util.*;

class p53
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows:");
        int row = sc.nextInt();
        System.out.println("Enter the how many columns:");
        int col = sc.nextInt();

        int OriginalArr[][] = new int[row][col];
        int SwappedArr[][] = new int[row][col];

        System.out.println("Enter the array elements:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                OriginalArr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                SwappedArr[j][i]=OriginalArr[i][j];
            }
        }

        System.out.println("Elements of original array:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(OriginalArr[i][j]+"   ");
            }
            System.out.println();
        }

        System.out.println("Swapped array is:");
        for(int i=0; i<col; i++)
        {
            for(int j=0; j<row; j++)
            {
                System.out.print(SwappedArr[i][j] + "  ");
            }
            System.out.println();
        }
       
    }
}
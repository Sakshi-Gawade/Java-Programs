import java.util.*;

class CricketPlayer
{
    Scanner sc = new Scanner(System.in);
    String name;;
    int noi;
    int noto;
    int totalruns;
    
    public void accept()
    {
        System.out.println("Enter name:");
        name = sc.next();
        System.out.println("Enter number of innings:");
        noi = sc.nextInt();
        System.out.println("Enter number of not out");
        noto = sc.nextInt();
        System.out.println("Enter total runs:");
        totalruns = sc.nextInt();
    }
    
    public float avg()
    {
        float batavg = (totalruns/(noi-noto));
        return batavg;
    }

    
    static void sort(CricketPlayer c[], int n)
    {
        CricketPlayer temp = new CricketPlayer();
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(c[i].avg()>c[j].avg())
                {
                    temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
    }
    
    public String toString()
    {
        return name+" "+noi+" "+noto+" "+avg();
    }
}

class p97
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many players");
        int n = sc.nextInt();
        
        CricketPlayer obj[] = new CricketPlayer[n];
        for(int i=0;i<n;i++)
        {
            obj[i] = new CricketPlayer();
            obj[i].accept();
        }
        
        CricketPlayer.sort(obj,n);
        
        for(int i=0;i<n;i++)
        {
            System.out.println(obj[i]);
        }
        
        
    }
}
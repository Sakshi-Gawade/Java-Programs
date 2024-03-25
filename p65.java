/* Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg).
Create an array of n player objects .Calculate the batting average for each player using static
method avg(). Define a static sort method which sorts the array on the basis of average. Display
the player details in sorted order. */

import java.io.*;

class CricketPlayer
{
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int totalruns;
    float bat_avg;

    CricketPlayer(String name,int no_of_innings, int no_of_times_notout, int totatruns)
    {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.totalruns = totalruns;
    }

    public float avg()
    {
        if(no_of_innings==0)
        {
            return 0.0;
        }
        else
        {
            bat_avg=(totalruns/(no_of_innings - no_of_times_notout));
        }
    }

    float getavg()
    {
        return bat_avg;
    }

    public void sort(CricketPlayer c[], int n)
    {
        for(int i=n-1; i>=0; i--)
        {
            for(int j=0; j<i; j++)
            {
                if(c[j].getavg()>c[j+1].getavg())
                {
                    CricketPlayer t = c[j];
                    c[j] = c[j+1];
                    c[j+1] = t;
                }
            }
        }
        for(int i=0; i<n; i++)
        {
            c[i].display();
        }
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Total Innings: " + no_of_innings);
        System.out.println("Total Runs: " + totalruns);
        System.out.println("Batting Average: " + bat_avg);
        System.out.println();
    }
}

class p65
{
    public static void main(String args[])throws IOException 
    {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        System.out.println("Enter the number of players:");
        int n = Integer.parseInt(br.readLine());

        CricketPlayer obj[] = new CricketPlayer[n];

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter Name:");
            String name = br.readLine();

            System.out.println("Enter the number of innings:");
            int in = Integer.parseInt(br.readLine());

            System.out.println("Enter the number of times not out:");
            int ot = Integer.parseInt(br.readLine());

            System.out.println("Enter the number of runs:");
            int runs = Integer.parseInt(br.readLine());

            obj[i] = new CricketPlayer(name,in,ot,runs);
            obj[i].avg();

        }
        for(int i=0; i<n; i++)
        {
            obj[i].display();
        }
        CricketPlayer.sort(obj,n);
    }
}
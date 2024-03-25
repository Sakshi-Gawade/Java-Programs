/*Write a program for multilevel inheritance such that Country is inherited from Continent.
State is inherited from Country. Display the place, State, Country and Continent.*/

class Continent
{
    String C_name;
    Continent(String C_name)
    {
        this.C_name = C_name;
    }
}

class Country extends Continent
{
    String Con_name;
    Country(String C_name, String Con_name)
    {
        super(C_name);
        this.Con_name = Con_name;
    }
}

class State extends Country
{
    String S_name;
    State(String C_name, String Con_name, String S_name)
    {
        super(C_name, Con_name);
        this.S_name = S_name;
    }
}

class Place extends State
{
    String P_name;
    Place(String C_name, String Con_name, String S_name, String P_name)
    {
        super(C_name, Con_name, S_name);
        this.P_name = P_name;
    }

    void display()
    {
        System.out.println("Continent Name:"+ C_name);
        System.out.println("Country Name:"+ Con_name);
        System.out.println("State Name:"+ S_name);
        System.out.println("Place:"+ P_name);
    }
}

class p68
{
    public static void main(String args[])
    {
        Place obj = new Place("Asia","India","Maharashtra","Baramati");
        obj.display();
    }
}
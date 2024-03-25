import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class InvalidPasswordException extends Exception
{
    InvalidPasswordException()
    {
        System.out.println("Username and password are not same");
    }
}

public class p90 extends JFrame implements ActionListener
{
    Label uname, pname;
    TextField nametext,passtext, msg;
    Button login, clear;
    Panel p;

    int attempt=0;
    char c = '*';

    public void login()
    {
        p = new Panel();
        uname = new Label("Username:",Label.CENTER);
        pname = new Label("Password:",Label.RIGHT);

        nametext = new TextField(20);
        passtext = new TextField(20);
        passtext.setEchoChar(c);
        msg = new TextField(20);
        msg.setEditable(false);

        login = new Button("Login");
        clear = new Button("Clear");
        login.addActionListener(this);
        clear.addActionListener(this);

        p.add(uname);
        p.add(nametext);
        p.add(pname);
        p.add(passtext);
        p.add(login);
        p.add(clear);
        p.add(msg);
        add(p);

        setTitle("Login");
        setSize(290,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public void actionPerformed(ActionEvent ae)
    {
        Button btn = (Button)(ae.getSource());
        if(attempt<3)
        {
            if((btn.getLabel())=="Clear")
            {
                nametext.setText(" ");
                passtext.setText(" ");
            }
            if((btn.getLabel()).equals("Login"))
            {
                try
                {
                    String user = nametext.getText();
                    String pass = passtext.getText();

                    if(user.compareTo(pass)==0)
                    {
                        msg.setText("valid");
                        System.out.println("Username is valid");
                    }
                    else
                    {
                        throw new InvalidPasswordException();
                    }
                }
                catch(Exception e)
                {
                    msg.setText("Error");
                }
                attempt++;
            }
        }
        else
        {
            System.out.println("You are using 3 attempts");
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        p90 pd = new p90();
        pd.login();
    }
}
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

class p82 extends KeyAdapter
{
    JFrame f;
    JTextField t1,t2;
    JLabel l1,l2;

    p82()
    {
        f = new JFrame("Temperature Converter");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        l1 = new JLabel("Celsius");
        l2 = new JLabel("Fahreheit");

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);

        f.setSize(300,300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        t1.addKeyListener(this);
        f.setDefaultCloseOperation(3);

    }

    public void keyReleased(KeyEvent ke)
    {
        try
        {
            Double cels = Double.parseDouble(t1.getText());
            Double S = (cels*1.8)+32;
            Formatter fob = new Formatter();
            fob.format("%2f",S);
            t2.setText(""+S);
        }
        catch(Exception e)
        {
            System.out.println("Enter value in box");
        }
        
    }
    public static void main(String args[])
    {
        p82 obj = new p82();
        Scanner sc = new Scanner(System.in);
    }

}
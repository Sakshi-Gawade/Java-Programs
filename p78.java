import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUI4 implements MouseListener, MouseMotionListener
{
    JFrame f;
    JTextField tt;

    GUI4()
    {
        f = new JFrame();
        tt = new JTextField();
        f.setSize(600,700);
        f.setLayout(null);
        f.setLocation(50,50);
        f.setTitle("Mouse Events");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tt.setBounds(5,50,500,50);
        f.add(tt);
        f.addMouseListener(this);
        f.addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent e)
    {
        if(e.getSource()==f)
        {
            tt.setText("Mouse clicked at x="+e.getX()+" y="+e.getY());
        }
    }
    public void mousePressed(MouseEvent e)
    {

    }
    public void mouseReleased(MouseEvent e)
    {

    }
    public void mouseEntered(MouseEvent e)
    {

    }
    public void mouseExited(MouseEvent e)
    {

    }
    public void mouseMoved(MouseEvent e)
    {
         if(e.getSource()==f)
        {
            tt.setText("Mouse clicked at x="+e.getX()+" y="+e.getY());
        }
    }
    public void mouseDragged(MouseEvent e)
    {

    }
    public static void main(String args[])
    {
        new GUI4();
    }
} 
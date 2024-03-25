import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUI3 implements MouseListener, MouseMotionListener
{
    JFrame f;
    JTextField tt;
    GUI3()
    {
        f = new JFrame();
        tt = new JTextField(50);
        f.setLocation(50,50);
        f.setSize(700,600);
        f.setLayout(null);
        f.setTitle("Mouse Events");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tt.setBounds(100,50,500,50);
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
            tt.setText("Mouse moved at x="+e.getX()+" y="+e.getY());
        }
    }
    public void mouseDragged(MouseEvent e)
    {

    }
    public static void main(String args[])
    {
        new GUI3();
    }
}

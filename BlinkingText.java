import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BlinkingText implements Runnable
{
    private JLabel label;
    private boolean isBlinking;

    public BlinkingText()
    {
        JFrame frame = new JFrame("Blinking Text");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Blinking Text");
        label.setFont(new Font("Arial", Font.PLAIN, 24));
        frame.add(label, BorderLayout.CENTER);

        JButton startButton = new JButton("start");
        startButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                startBlinking();
            }
        });
        frame.add(startButton, BorderLayout.SOUTH);

        frame.setSize(300,200);
        frame.setVisible(true);
    }
    public void startBlinking()
    {
        isBlinking = true;
        Thread thread = new Thread(this);
        thread.start();
    }
    public void stopBlinking()
    {
        isBlinking = false;
    }

    @Override
    public void run()
    {
        try
        {
            while(isBlinking)
            {
                label.setVisible(!label.isVisible());
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new BlinkingText();
            }
        });
    }
}
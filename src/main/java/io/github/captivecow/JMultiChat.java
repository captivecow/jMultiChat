package io.github.captivecow;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class JMultiChat
{
    public static void main( String[] args )
    {
        JFrame frame = new JFrame("jMultiChat");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setPreferredSize(new Dimension(800, 600));

        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);

    }
}

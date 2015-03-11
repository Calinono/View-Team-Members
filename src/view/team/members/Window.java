package view.team.members;


import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame
{
    JPanel p;
    JScrollPane sp;
    //Style mainStyle = new Style();
    Style mainStyle = new Style();
    
    JButton t1 = new JButton("Team 1");
    JButton t2 = new JButton("Team 2");
    JButton t3 = new JButton("Team 3");
    JButton t4 = new JButton("Team 4");
    
    public Window()
    {
        this.setTitle("View Team Members"); //sets name of window
        this.setSize(400,500); //sets size of window
        this.setLocationRelativeTo(null); //sets position of window
        this.setResizable(true); //defines whether window is resizable
        this.setAlwaysOnTop(true); //sets window always on top
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes program on exit
        this.setVisible(true); //sets window visible
        
        //Button Team 1 Modifiers
        t1.setForeground(Color.WHITE);
        t1.setBackground(Color.RED);
        t1.setContentAreaFilled(false);
        t1.setOpaque(true);
        
        //Button Team 2 Modifiers
        t2.setForeground(Color.WHITE);
        t2.setBackground(Color.RED);
        //t2.setFont(buttonFont); DOESNT WORK
        t2.setContentAreaFilled(false);
        t2.setOpaque(true);
        
        //Button Team 3 Modifiers
        t3.setForeground(Color.WHITE);
        t3.setBackground(Color.RED);
        t3.setContentAreaFilled(false);
        t3.setOpaque(true);
        
        //Button Team 4 Modifiers
        t4.setForeground(Color.WHITE);
        t4.setBackground(Color.RED);
        t4.setContentAreaFilled(false);
        t4.setOpaque(true);
        
        
        //Initialization of Jpanel
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        sp = new JScrollPane(p);
        //sp.setBorder(mainStyle.borderScroll);
        //mainStyle.smoothScroll(sp);
        
        GridLayout gl = new GridLayout(4,1);
        gl.setVgap(30);
        
        JPanel buttonPanel = new JPanel(gl)
        {
            @Override
            public Dimension getPreferredSize()
            {
               return new Dimension (500, 350); 
            }
        };
        
        buttonPanel.add(t1);
        buttonPanel.add(t2);
        buttonPanel.add(t3);
        buttonPanel.add(t4);
        buttonPanel.setVisible(true);
        
        JPanel center = new JPanel(new GridBagLayout())
        {
            @Override
            public Dimension getPreferredSize()
            {
                return new Dimension (500, 500);
            }
        };
        
        GridBagConstraints gbc = new GridBagConstraints();
        //gbc.anchor = GridBagConstraints.NORTH;
        gbc.weighty = 1;
        center.add(buttonPanel, gbc);
        center.setVisible(true);
        
        JPanel west = new JPanel()
        {
            @Override
            public Dimension getPreferredSize()
            {
                return new Dimension(200,200);
            }
        };
        JPanel east = new JPanel()
        {
            @Override
            public Dimension getPreferredSize()
            {
                return new Dimension(200,200);
            }
        };
        
        JPanel north = new JPanel()
        {
            @Override
            public Dimension getPreferredSize()
            {
                return new Dimension(200,200);
            }
        };
        
        JPanel south = new JPanel()
        {
            @Override
            public Dimension getPreferredSize()
            {
                return new Dimension(200,200);
            }
        };
        
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(center, BorderLayout.CENTER);
        this.add(north, BorderLayout.NORTH);
        this.add(south, BorderLayout.SOUTH);
        
        this.pack();
        this.setVisible(true);
        
        center.setBorder(BorderFactory.createEmptyBorder());
    }
}

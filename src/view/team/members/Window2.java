package view.team.members;

import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    
public class Window2 extends JFrame {
    JPanel p;
    JScrollPane sp;
    //Style mainStyle = new Style();
    Style mainStyle = new Style();
    
    JButton t1 = new JButton("Team 1");
    JButton t2 = new JButton("Team 2");
    JButton t3 = new JButton("Team 3");
    JButton t4 = new JButton("Team 4");
    
    public Window2()
    {
        this.setTitle("View Team Members"); //sets name of window
        this.setSize(1500,750); //sets size of window
        this.setLocationRelativeTo(null); //sets position of window
        this.setResizable(true); //defines whether window is resizable
        this.setAlwaysOnTop(true); //sets window always on top
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes program on exit
        this.setVisible(true); //sets window visible
        
        JPanel p1 = new JPanel();
        p1.setPreferredSize(new Dimension(120, 60));        
        p1.add(t1);
        
        JPanel p2 = new JPanel();
        p2.setPreferredSize(new Dimension(120, 60));
        p2.add(t2);
        
        JPanel p3 = new JPanel();
        p3.setPreferredSize(new Dimension(120, 60));
        p3.add(t3);
        
        JPanel p4 = new JPanel();
        p4.setPreferredSize(new Dimension(120, 60));
        p4.add(t4);
        
        //Main Panel
        JPanel content = new JPanel();
        content.setPreferredSize(new Dimension(1000, 375));
        content.setBackground(Color.WHITE);
        //Definition of Layout Manager
        content.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        //Position of first cell
        gbc.gridx = 0;
        gbc.gridy = 0;
        //Size of cell
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        
        //First Button Layout
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        content.add(t1, gbc);
        //
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        
        this.setContentPane(content);
        this.setVisible(true);
        
        
        
    } 
}

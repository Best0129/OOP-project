/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecttest;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.URL;
import java.net.URL;
import java.awt.Dimension;
/**
 *
 * @author 66831
 */

public class home {
    private JFrame fr;
    private JTextField text;
    private JButton creator, visitor;
    private JPanel button, but1, but2,textarea,b1,b2,b3;
    private JLabel label1,text1, text2, text3;
    private ImageIcon icon, logo, reicon;
    
    public home(){
       fr = new JFrame();  
       fr.getContentPane().setBackground(Color.green);
       
       text1 = new JLabel("You wanna meet us?");
       text1.setHorizontalAlignment(JTextField.CENTER);
       text1.setVerticalAlignment(JTextField.CENTER);
       text1.setForeground(Color.RED);
       
       text2 = new JLabel("let's find out");
       text2.setHorizontalAlignment(JTextField.CENTER);
       text2.setForeground(Color.RED);
       
       text3 = new JLabel("choose you choice");
       text3.setHorizontalAlignment(JTextField.CENTER);
       text3.setForeground(Color.RED);
       
       //b1 = new JPanel();
       //b2 = new JPanel();
       //b3 = new JPanel();
       
       //b1.setBackground(Color.blue);
       //b2.setBackground(Color.yellow);
       //b3.setBackground(Color.gray);
       
       //b1.add(text1);
       //b2.add(text2);
       //b3.add(text3);
       
       logo = new ImageIcon("logotest.jpg");
       textarea = new JPanel();
       
       textarea.setLayout(new GridLayout(3,1));
       
       textarea.add(text1);
       textarea.add(text2);
       textarea.add(text3);
       
       label1 = new JLabel("Meeting Room", logo, JLabel.CENTER);
       label1.setVerticalTextPosition(JLabel.BOTTOM);
       label1.setHorizontalTextPosition(JLabel.CENTER);
       
       icon = new ImageIcon("user.png");
       reicon = new ImageIcon(icon.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
       creator = new JButton("creator",reicon);
       visitor = new JButton("visistor",reicon);
       button = new JPanel();
       but1 = new JPanel();
       but2 = new JPanel();
       
       
       fr.setLayout(new GridLayout(3,1));
       fr.add(textarea);
       fr.add(label1);
       
       but1.add(creator);
       but2.add(visitor);
       button.setLayout(new FlowLayout());
       button.add(but1);
       button.add(but2);

       fr.add(button);
       
       fr.setSize(600, 700);
       fr.setVisible(true);
       fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

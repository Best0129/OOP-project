/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_no1;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Start {
    private JFrame fr;
    private JLabel start, text1, text2, text3, head, pic;
    private ImageIcon icon, resizeicon, logo, resizelogo;
    private JPanel blank, textarea;
    
    public Start(){
        fr = new JFrame();
        Font fhead = new Font("TH SarabunPSK", Font.BOLD, 30);
        Font ftext = new Font("TH SarabunPSK", Font.BOLD, 14);
        blank = new JPanel();
        textarea = new JPanel();
        logo = new ImageIcon("logo.png");
        resizelogo = new ImageIcon(logo.getImage().getScaledInstance(220, 135, java.awt.Image.SCALE_SMOOTH));
        icon = new ImageIcon("btn.png");
        resizeicon = new ImageIcon(icon.getImage().getScaledInstance(145, 105, java.awt.Image.SCALE_SMOOTH));
        start = new JLabel(resizeicon);
        pic = new JLabel(resizelogo);
        
        blank.setBackground(Color.LIGHT_GRAY);
        
        text1 = new JLabel("You wanna meet us?");
        text1.setHorizontalAlignment(JTextField.CENTER);
        text1.setVerticalAlignment(JTextField.CENTER);
        text1.setFont(ftext);
        text1.setForeground(Color.MAGENTA);
        
        text2 = new JLabel("let's find out");
        text2.setHorizontalAlignment(JTextField.CENTER);
        text2.setVerticalAlignment(JTextField.CENTER);
        text2.setFont(ftext);
        text2.setForeground(Color.MAGENTA);
        
        text3 = new JLabel("choose you choice");
        text3.setHorizontalAlignment(JTextField.CENTER);
        text3.setVerticalAlignment(JTextField.CENTER);
        text3.setFont(ftext);
        text3.setForeground(Color.MAGENTA);
       
        head = new JLabel("Meeting room");
        head.setHorizontalAlignment(JTextField.CENTER);
        head.setVerticalAlignment(JTextField.CENTER);
        head.setFont(fhead);
        head.setForeground(Color.CYAN);
        
        fr.setLayout(new GridLayout(4,1));
        fr.add(head);
        fr.add(pic);
        fr.getContentPane().setBackground(Color.LIGHT_GRAY);
       
        textarea.setLayout(new GridLayout(4,1));
        textarea.add(blank);
        textarea.add(text1);
        textarea.add(text2);
        textarea.add(text3);
        textarea.setBackground(Color.LIGHT_GRAY);
        
        fr.add(textarea);
        fr.add(start);
        
        fr.setSize(400, 570);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setMinimumSize(new Dimension(400, 570));
    }
}

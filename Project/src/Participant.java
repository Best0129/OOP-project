/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Peeradech
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.ImageIcon;

public class Participant implements ActionListener{
    private JFrame frame, frame_image;
    private JPanel pn1, pn2, pn3, pn4, sub_l1, sub_l2, sub_l3, pn_seat, pn_ok, pn_image, pn_cb, pn_subseat;
    private JButton ok, image;
    private JLabel participant, place_label, remaining_label, price_label, seat, open, choose_seat;
    private JTextField place_text, remaining_text, price_text;
    private JComboBox seat_cb;
    private ImageIcon icon;
    
    
    public Participant(){
        frame = new JFrame();
        frame_image = new JFrame();
        frame_image.setVisible(false);
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();
        sub_l1 = new JPanel();
        sub_l2 = new JPanel();
        sub_l3 = new JPanel();
        pn_seat = new JPanel();
        pn_ok = new JPanel();
        pn_image = new JPanel();
        pn_cb = new JPanel();
        pn_subseat = new JPanel();
        choose_seat = new JLabel("Choose your seat   ");
        
        open = new JLabel();
        open.setVerticalTextPosition(JLabel.BOTTOM);
        open.setHorizontalAlignment(JLabel.CENTER);
        
        frame.setLocation(500, 150); // set_Frame
        frame_image.setLocation(500, 200);
        icon = new ImageIcon("test_photo.jpeg"); // add Diagram Image
        open.setIcon(icon);
        frame_image.add(open);
        frame_image.pack();
        
        seat_cb = new JComboBox();
        seat_cb.setPreferredSize(new Dimension(200, 25));
        //seat_cb.setSelectedItem("Choose your seat");
        seat_cb.addItem("10");
        seat_cb.addItem("20");
        seat_cb.addItem("30");
        seat_cb.addItem("40");
        
        
        ok = new JButton("OK");
        image = new JButton("Diagram Image");
        participant = new JLabel("Participant");
        place_label = new JLabel("Meeting Place       :  ");
        remaining_label = new JLabel("Remaining seats   :  ");
        price_label = new JLabel("Price Per Seat       :  ");
        seat = new JLabel("Seat");
        place_text = new JTextField(30);
        place_text.setEditable(false);
        remaining_text = new JTextField(30);
        remaining_text.setEditable(false);
        price_text = new JTextField(30);
        price_text.setEditable(false);
        Font f = new Font("TH SarabunPSK", Font.BOLD, 80);
        Font f_label = new Font("TH SarabunPSK", Font.BOLD, 18);
        
        Font f_bigfont  = new Font("TH SarabunPSK", Font.BOLD, 25);
        
        participant.setFont(f);
        participant.setForeground(new Color(154, 84, 255));
        
        place_label.setFont(f_bigfont);
        remaining_label.setFont(f_bigfont);
        price_label.setFont(f_bigfont);
        
        place_label.setForeground(new Color(154, 84, 255));
        remaining_label.setForeground(new Color(154, 84, 255));
        price_label.setForeground(new Color(154, 84, 255));
        
        
        frame.setLayout(new GridLayout(4, 1));
        pn1.add(participant); //1
        frame.add(pn1, BorderLayout.NORTH);
        
        pn2.setLayout(new GridLayout(3, 2));
        
        sub_l1.add(place_label); //2
        sub_l1.add(place_text);
        pn2.add(sub_l1);
        sub_l2.add(remaining_label);
        sub_l2.add(remaining_text);
        pn2.add(sub_l2);
        sub_l3.add(price_label);
        sub_l3.add(price_text);
        pn2.add(sub_l3);
        frame.add(pn2);
        
        pn_seat.setLayout(new GridLayout(3, 1)); //3
        seat.setFont(f_bigfont);
        seat.setHorizontalAlignment(JLabel.RIGHT);
        pn_subseat.add(seat);
        pn_seat.add(pn_subseat);
        
        choose_seat.setFont(f_label);
        pn_cb.add(choose_seat);
        pn_cb.add(seat_cb);
        pn_image.add(image);
        
        pn_seat.add(pn_subseat);
        pn_seat.add(pn_cb);
        pn_seat.add(pn_image);
        frame.add(pn_seat);
        
        
        ok.setBackground(new Color(184, 134, 255)); //4
        ok.setForeground(new Color(255,  255, 255));
        ok.setPreferredSize(new Dimension(200, 50));
        ok.setFont(f_bigfont);
        //ok.setBorderPainted(false);
        pn_ok.add(ok);
        frame.add(pn_ok);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        
        ok.addActionListener(this);
        image.addActionListener(this);
        
    }
    
    @Override
        public void actionPerformed(ActionEvent ev){
            if (ev.getSource().equals(ok)){
            
            
            }
            else if (ev.getSource().equals(image)){
                frame_image.setVisible(true); // open Diagram Image
            
            }
        
        }
    
    
        
    public static void main(String arge[]){
        new Participant();
    
    }
    
    
    
}

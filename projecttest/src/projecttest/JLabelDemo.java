/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecttest;

/**
 *
 * @author 66831
 */
import java.awt.*;
import java.net.URL;
import javax.swing.*;
public class JLabelDemo {
private JFrame fr;
private JLabel label1, label2, label3;
public JLabelDemo() {
ImageIcon icon = null;
fr = new JFrame("JLabel Sample");
fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
URL imageURL = JLabelDemo.class.getResource("logotest.jpg");
if (imageURL != null) {
icon = new ImageIcon(imageURL);
}
fr.setLayout(new GridLayout(3, 1));
//Create the first label.
label1 = new JLabel("Image and Text", icon, JLabel.CENTER);
//Set the position of its text, relative to its icon:
label1.setVerticalTextPosition(JLabel.BOTTOM);
label1.setHorizontalTextPosition(JLabel.CENTER);
//Create the other labels.
label2 = new JLabel("Text-Only Label");
label3 = new JLabel(icon);
//Create tool tips, for the heck of it.
label1.setToolTipText("A label containing both image and text");
label2.setToolTipText("A label containing only text");
label3.setToolTipText("A label containing only an image");
//Add the labels.
fr.add(label1);
fr.add(label2);
fr.add(label3);
fr.pack();
fr.setVisible(true);

}
public static void main(String args[]) {
    JLabelDemo jLabelDemo = new JLabelDemo();
}}

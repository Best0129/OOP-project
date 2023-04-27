import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class HomePage {
    private JInternalFrame fr;
    private JTextField text;
    private JButton creator, visitor;
    private JPanel button, but1, but2, blank, blank2, textarea, b1, b2, b3, pic;
    private JLabel label1,text1, text2, text3;
    private ImageIcon icon, logo, reicon;

    public boolean isCreater(ActionEvent e) {
        return e.getSource().equals(creator);
    }

    public boolean isVisitor(ActionEvent e) {
        return  e.getSource().equals(visitor);
    }

    public JInternalFrame getFr() {
        return fr;
    }

    public JButton getVisitor() {
        return visitor;
    }

    public JButton getCreator() {
        return creator;
    }

    public HomePage(){
        fr = new JInternalFrame();
        //fr.getContentPane().setBackground(Color.green);
        Font f = new Font("TH SarabunPSK", Font.BOLD, 20);
        text1 = new JLabel("You wanna meet us?");
        text1.setHorizontalAlignment(JTextField.CENTER);
        text1.setVerticalAlignment(JTextField.CENTER);
        text1.setForeground(Color.RED);
        text1.setFont(f);

        text2 = new JLabel("let's find out");
        text2.setHorizontalAlignment(JTextField.CENTER);
        text2.setForeground(Color.RED);
        text2.setFont(f);

        text3 = new JLabel("choose you choice");
        text3.setHorizontalAlignment(JTextField.CENTER);
        text3.setForeground(Color.RED);
        text3.setFont(f);

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

        textarea.setLayout(new GridLayout(5,1));

        blank = new JPanel();
        blank2 = new JPanel();

        textarea.add(blank);
        textarea.add(text1);
        textarea.add(text2);
        textarea.add(text3);
        textarea.add(blank2);

        label1 = new JLabel("Meeting Room", logo, JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        pic = new JPanel();
        pic.add(label1);

        icon = new ImageIcon("user.png");
        reicon = new ImageIcon(icon.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
        creator = new JButton("creator",reicon);
        visitor = new JButton("visistor",reicon);
        button = new JPanel();
        but1 = new JPanel();
        but2 = new JPanel();


        //fr.setLayout(new GridLayout(3,1));
        fr.setLayout(new BorderLayout());
        fr.add(textarea, BorderLayout.NORTH);
        fr.add(pic);

        but1.add(creator);
        but2.add(visitor);
        button.setLayout(new FlowLayout());
        button.add(but1);
        button.add(but2);

        fr.add(button, BorderLayout.SOUTH);

        fr.setSize(606, 740);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fr.setMinimumSize(new Dimension(400, 700));
    }
}
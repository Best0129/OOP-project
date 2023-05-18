import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class StartPage {

    private JInternalFrame fr;
    private JLabel text1, text2, text3, head, pic;
    private ImageIcon icon, resizeicon, logo, resizelogo;
    private JPanel blank, textarea;

    public JButton getStart() {
        return start;
    }

    public boolean isStart(ActionEvent e) {
        return e.getSource().equals(start);
    }

    public JInternalFrame getFr() {
        return fr;
    }

    private JButton start;

    public StartPage(){
        fr = new JInternalFrame();
        Font fhead = new Font("TH SarabunPSK", Font.BOLD, 30);
        Font ftext = new Font("TH SarabunPSK", Font.BOLD, 14);
        blank = new JPanel();
        textarea = new JPanel();
        logo = new ImageIcon("logo.png");
        resizelogo = new ImageIcon(logo.getImage().getScaledInstance(320, 200, java.awt.Image.SCALE_SMOOTH));
        icon = new ImageIcon("btn.png");
        resizeicon = new ImageIcon(icon.getImage().getScaledInstance(145, 105, java.awt.Image.SCALE_SMOOTH));
        start = new JButton(resizeicon);
        pic = new JLabel(resizelogo);
        Font f = new Font("TH SarabunPSK", Font.BOLD, 50);

        text1 = new JLabel("");
        text1.setHorizontalAlignment(JTextField.CENTER);
        text1.setVerticalAlignment(JTextField.CENTER);
        text1.setFont(ftext);
        text1.setForeground(Color.BLACK);

        text2 = new JLabel("");
        text2.setHorizontalAlignment(JTextField.CENTER);
        text2.setVerticalAlignment(JTextField.CENTER);
        text2.setFont(ftext);
        text2.setForeground(Color.MAGENTA);

        text3 = new JLabel("");
        text3.setHorizontalAlignment(JTextField.CENTER);
        text3.setVerticalAlignment(JTextField.CENTER);
        text3.setFont(ftext);
        text3.setForeground(Color.MAGENTA);

        head = new JLabel("Meeting room");
        head.setHorizontalAlignment(JTextField.CENTER);
        head.setVerticalAlignment(JTextField.CENTER);
        head.setFont(f);
        head.setForeground(Color.BLACK);

        fr.setLayout(new GridLayout(4,1));
        fr.add(head);
        fr.add(pic);

        textarea.setLayout(new GridLayout(4,1));
        textarea.add(blank);
        textarea.add(text1);
        textarea.add(text2);
        textarea.add(text3);
        start.setOpaque(false);
        start.setContentAreaFilled(false);
        start.setBorderPainted(false);

        fr.add(textarea);
        fr.add(start);
        //fr.setBackground(new Color(255, 255, 255));

        fr.setSize(400, 570);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setMinimumSize(new Dimension(400, 570));
    }
}
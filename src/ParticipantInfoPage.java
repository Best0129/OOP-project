import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class ParticipantInfoPage {
    private JInternalFrame frame;
    private JPanel panel1, panel2, panel2_1, panel2_2, panel3, panel3_1, panel3_2, panel4, panel5, panel6, panel7, panel8;
    private JLabel main_lb, id_lb, place_lb;
    public static JTextField id_tf;
    public static JComboBox comboBox;
    private JButton bn, back_bn, check_bn;

    public JInternalFrame getFrame() {
        return frame;
    }

    public JButton getBack_bn() {
        return back_bn;
    }

    public JButton getBn() {
        return bn;
    }

    public JButton getCheck_bn() {
        return check_bn;
    }

    public ParticipantInfoPage() {
        frame = new JInternalFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel2_1 = new JPanel();
        panel2_2 = new JPanel();
        panel3 = new JPanel();
        panel3_1 = new JPanel();
        panel3_2 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();
        main_lb = new JLabel("Participant");
        id_lb = new JLabel("Citizen ID");
        place_lb = new JLabel("Meeting Name ");
        id_tf = new JTextField(20);
        comboBox = new JComboBox();
        bn = new JButton("Next");
        back_bn = new JButton("back");
        check_bn = new JButton("Pay");
        Font f = new Font("TH SarabunPSK", Font.BOLD, 80);

        frame.setLayout(new GridLayout(4, 1));
        main_lb.setFont(f);
        panel1.add(main_lb);
        main_lb.setForeground(new Color(154, 84, 255));
        ;
        frame.add(panel1);
        panel2_1.add(id_lb);
        panel2_1.add(id_tf);
        panel2_2.add(place_lb);
        panel2_2.add(comboBox);
        panel2.setLayout(new GridLayout(2, 1));
        panel2.add(panel2_1);
        panel2.add(panel2_2);
        frame.add(panel2);
        panel5.setLayout(new GridLayout(3, 1));
        panel8.add(bn);
        panel5.add(panel8);
        panel6.add(back_bn);
        panel7.add(check_bn);
        panel5.add(panel7);
        panel5.add(panel6);
        panel4.add(panel5);
        frame.add(panel4);
        bn.setBackground(new Color(184, 134, 255));
        bn.setForeground(new Color(255, 255, 255));
        bn.setPreferredSize(new Dimension(200, 50));
        check_bn.setBackground(new Color(184, 134, 255));
        check_bn.setForeground(new Color(255, 255, 255));
        check_bn.setPreferredSize(new Dimension(200, 50));

        comboBox.setPreferredSize(new Dimension(250, 35));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setVisible(false);
    }
    public boolean isNext(ActionEvent e) {
        return e.getSource().equals(bn);
    }
    public boolean isBack(ActionEvent e) {
        return e.getSource().equals(back_bn);
    }
    public boolean isCheck(ActionEvent e) {
        return e.getSource().equals(check_bn);
    }
}

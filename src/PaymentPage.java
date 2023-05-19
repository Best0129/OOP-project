import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PaymentPage extends Total{
    private JInternalFrame frame;
    private JPanel panel1, panel2, panel3;
    private JLabel label1, label2, label3;
    private JButton back_bn;
    private ImageIcon imageIcon;

    public JLabel getLabel3() {
        return label3;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public PaymentPage() {
        frame = new JInternalFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        panel3 = new JPanel();
        Font f_bigfont  = new Font("TH SarabunPSK", Font.BOLD, 25);
        imageIcon = new ImageIcon("nothing_here.png");
        Image image = imageIcon.getImage();
        Image newing = image.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newing);
        label1 = new JLabel(imageIcon);
        back_bn = new JButton("back");

        frame.setLayout(new BorderLayout());
        panel1.setLayout(new CardLayout(20, 20));
        panel1.add(label1);
        frame.add(panel1, BorderLayout.CENTER);
        panel2.setLayout(new GridLayout(3, 1));
        panel2.add(label2);
        panel2.add(label3);
        panel3.add(back_bn);
        panel2.add(panel3);
//        label2.setText("            Your total price in " + ParticipantInfoPage.comboBox.getSelectedItem().toString() + " is " + price + " baht.");
//        label3.setText("            Your total seat is " + seat);
        frame.add(panel2, BorderLayout.SOUTH);
        label2.setFont(f_bigfont);
        label3.setFont(f_bigfont);
        back_bn.setPreferredSize(new Dimension(150, 30));

        BasicInternalFrameUI bi = (BasicInternalFrameUI)frame.getUI();
        bi.setNorthPane(null);
        frame.setBorder(null);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setVisible(false);
    }

    @Override
    public void sum_price() {
        price = 0;
        seat = 0;
        String id = ParticipantInfoPage.id_tf.getText();
        for (int i = 0; i<=ParticipantModal.arrlist.toArray().length - 1;i++) {
            if (ParticipantModal.arrlist.get(i).getId().equals(id) & ParticipantInfoPage.comboBox.getSelectedItem().toString().equals(ParticipantModal.arrlist.get(i).getMeeting_name())) {
                seat++;
                price += Double.parseDouble(ParticipantModal.arrlist.get(i).getPrice());
            }
        }
    }

    public JButton getBack_bn() {
        return back_bn;
    }

    public JInternalFrame getFrame() {
        return frame;
    }

    public boolean isBack(ActionEvent e) {
        return e.getSource().equals(back_bn);
    }
}

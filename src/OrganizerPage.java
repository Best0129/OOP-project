import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class OrganizerPage implements  ActionListener {
    private JInternalFrame frame;
    private JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8;
    private JLabel organize_label, meeting_name, meeting_place, numberofseat, priceperseat;
    private JTextField meeting_txt, place_txt, numberofseat_txt, price_txt;
    private JButton ok, back, oo_config;

    public boolean isOk(ActionEvent e) {
        return e.getSource().equals(ok);
    }
    public boolean isBack(ActionEvent e) {
        return  e.getSource().equals(back);
    }

    public JInternalFrame getFrame() {
        return  frame;
    }

    public JTextField getMeeting_txt() {
        return meeting_txt;
    }

    public JTextField getPlace_txt() {
        return place_txt;
    }

    public JTextField getNumberofseat_txt() {
        return numberofseat_txt;
    }

    public JTextField getPrice_txt() {
        return price_txt;
    }


    public JButton getOk() {
        return ok;
    }
    public JButton getBack() {
        return back;
    }

    public OrganizerPage() {
        frame = new JInternalFrame("Meeting Room");
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();
        organize_label = new JLabel("Organizer");
        meeting_name = new JLabel("Meeting Name   :  ");
        meeting_place = new JLabel("Meeting Place    :  ");
        numberofseat = new JLabel("Number Of Seat  :  ");
        priceperseat = new JLabel("Price per Seat      :  ");
        meeting_txt = new JTextField(45);
        place_txt = new JTextField(45);
        numberofseat_txt = new JTextField(45);
        price_txt = new JTextField(45);
        ok = new JButton("Add Meeting");
        back = new JButton("back");
        oo_config = new JButton("Organizer Management");
        Font f = new Font("TH SarabunPSK", Font.BOLD, 80);
        Font f_btn = new Font("TH SarabunPSK", Font.BOLD, 22);
        Font f_bigfont  = new Font("TH SarabunPSK", Font.BOLD, 25);

        frame.setLayout(new GridLayout(8, 1));
        organize_label.setFont(f);
        organize_label.setForeground(new Color(154, 84, 255));
        panel1.add(organize_label);
        frame.add(panel1);
        panel2.add(meeting_name);
        meeting_name.setFont(f_bigfont);
        panel2.add(meeting_txt);
        frame.add(panel2);
        panel3.add(meeting_place);
        meeting_place.setFont(f_bigfont);
        panel3.add(place_txt);
        frame.add(panel3);
        panel4.add(numberofseat);
        numberofseat.setFont(f_bigfont);
        panel4.add(numberofseat_txt);
        frame.add(panel4);
        panel5.add(priceperseat);
        priceperseat.setFont(f_bigfont);
        panel5.add(price_txt);
        frame.add(panel5);
        panel6.add(oo_config);
        oo_config.setPreferredSize(new Dimension(250, 40));
        frame.add(panel6);
        panel7.add(ok);
        frame.add(panel7);
        panel8.add(back);
        frame.add(panel8);
        ok.setFont(f_btn);
        ok.setBackground(new Color(184, 134, 255));
        ok.setForeground(new Color(255,  255, 255));
        ok.setPreferredSize(new Dimension(200, 50));
        ok.addActionListener(this);
        oo_config.addActionListener(this);
        meeting_txt.setFont(f_bigfont);
        meeting_txt.setColumns(25);
        place_txt.setFont(f_bigfont);
        place_txt.setColumns(25);
        numberofseat_txt.setFont(f_bigfont);
        numberofseat_txt.setColumns(25);
        price_txt.setFont(f_bigfont);
        price_txt.setColumns(25);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setVisible(false);


    }

    public void actionPerformed(ActionEvent e) {
        String name, place;
        int totalseats;
        double price;
        ArrayList<String> seat_left = new ArrayList<String>();
        if (e.getSource().equals(ok)) {
            if (meeting_txt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please insert meeting name", "alert", JOptionPane.ERROR_MESSAGE);
            } else if (place_txt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please insert meeting place", "alert", JOptionPane.ERROR_MESSAGE);
            } else if (numberofseat_txt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please insert number of seat", "alert", JOptionPane.ERROR_MESSAGE);
            } else if (ErrorChecker.isDigit(numberofseat_txt.getText())) {
                JOptionPane.showMessageDialog(null, "Please insert integer only in number of seat field", "alert", JOptionPane.ERROR_MESSAGE);
            } else if (price_txt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please insert price", "alert", JOptionPane.ERROR_MESSAGE);
            } else if (ErrorChecker.isDigit(price_txt.getText())) {
                JOptionPane.showMessageDialog(null, "Please insert price only in price field", "alert", JOptionPane.ERROR_MESSAGE);
            } else {
                PageControl.op.getFrame().setVisible(false);
                name = meeting_txt.getText();
                place = place_txt.getText();
                totalseats = Integer.parseInt(numberofseat_txt.getText());
                price = Double.parseDouble(price_txt.getText());
                for (int i = 1; i<=totalseats; i++) {
                    String i2 = String.valueOf(i);
                    seat_left.add(i2);
                }
//                System.out.println(seat_left);
                OrganizerModal.arrlist.add(new OrganizerData(name, place, totalseats, price));
                OrganizerModal.seatleft_arrlist.add(seat_left);
                meeting_txt.setText("");
                place_txt.setText("");
                numberofseat_txt.setText("");
                price_txt.setText("");

                ParticipantInfoPage.comboBox.addItem(OrganizerModal.arrlist.get(OrganizerModal.arrlist.toArray().length - 1).getMeeting_name());
                OrganizerTableInfo.comboBox.addItem(OrganizerModal.arrlist.get(OrganizerModal.arrlist.toArray().length - 1).getMeeting_name());

                JOptionPane.showMessageDialog(null, "Done!", "t", JOptionPane.PLAIN_MESSAGE);
            }
        } else if (e.getSource().equals(oo_config)) {
            OrganizerTableInfo.frame.setVisible(true);
        }
    }

}
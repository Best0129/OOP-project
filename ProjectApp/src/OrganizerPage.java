import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class OrganizerPage implements  ActionListener {
    private JInternalFrame frame;
    private JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8;
    private JLabel organize_label, meeting_name, meeting_place, numberofseat, priceperseat, diagram_image;
    private JTextField meeting_txt, place_txt, numberofseat_txt, price_txt, diagram_txt;
    private JButton ok, back;

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

    public JTextField getDiagram_txt() {
        return diagram_txt;
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
        diagram_image = new JLabel("Diagram Image Link :  ");
        meeting_txt = new JTextField(45);
        place_txt = new JTextField(45);
        numberofseat_txt = new JTextField(45);
        price_txt = new JTextField(45);
        diagram_txt = new JTextField(45);
        ok = new JButton("Submit");
        back = new JButton("back");
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
        panel6.add(diagram_image);
        diagram_image.setFont(f_bigfont);
        panel6.add(diagram_txt);
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
        meeting_txt.setFont(f_bigfont);
        meeting_txt.setColumns(25);
        place_txt.setFont(f_bigfont);
        place_txt.setColumns(25);
        numberofseat_txt.setFont(f_bigfont);
        numberofseat_txt.setColumns(25);
        price_txt.setFont(f_bigfont);
        price_txt.setColumns(25);
        diagram_txt.setFont(f_bigfont);
        diagram_txt.setColumns(25);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setVisible(false);


    }

    public void actionPerformed(ActionEvent e) {
        String name, place, diagram;
        int totalseats;
        double price;
        if (e.getSource().equals(ok)) {
            name = meeting_txt.getText();
//            place = place_txt.getText();
//            totalseats = Integer.parseInt(numberofseat_txt.getText());
//            price = Double.parseDouble(price_txt.getText());
//            diagram = diagram_txt.getText();
//            Method
            System.out.println(name);
        }
    }

}

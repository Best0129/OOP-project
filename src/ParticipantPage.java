import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ParticipantPage {
    private JInternalFrame frame;
    private JFrame frame_image;
    private JPanel pn1, pn2, pn3, pn4, sub_l1, sub_l2, sub_l3, pn_seat, pn_ok, pn_image, pn_cb, pn_subseat, pn_back, date_panel, time_panel;
    private JButton ok, back;
    private JLabel participant, place_label, remaining_label, price_label, seat, open, choose_seat, date_lb, time_lb;
    public static JTextField place_text, remaining_text, price_text, date_txt, time_txt;
    public static JComboBox seat_cb;
    public boolean isOk(ActionEvent e) {
        return e.getSource().equals(ok);
    }

    public boolean isBack(ActionEvent e) {
        return e.getSource().equals(back);
    }

    public JInternalFrame getFrame() {
        return frame;
    }

    public JTextField getPlace_text() {
        return  place_text;
    }

    public JTextField getRemaining_text() {
        return remaining_text;
    }

    public JTextField getPrice_text() {
        return price_text;
    }

    public JButton getOk() {
        return ok;
    }

    public JButton getBack() {
        return back;
    }

    public JTextField getTime_txt() {
        return time_txt;
    }

    public JTextField getDate_txt() {
        return date_txt;
    }

    public ParticipantPage() {
        frame = new JInternalFrame();
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
        pn_back = new JPanel();
        date_panel = new JPanel();
        time_panel = new JPanel();
        choose_seat = new JLabel("Choose your seat   ");

        open = new JLabel();
        open.setVerticalTextPosition(JLabel.BOTTOM);
        open.setHorizontalAlignment(JLabel.CENTER);

        frame.setLocation(500, 150); // set_Frame

        seat_cb = new JComboBox();
        seat_cb.setPreferredSize(new Dimension(200, 25));

        ok = new JButton("reserve");
        back = new JButton("back");
        participant = new JLabel("Participant");
        place_label = new JLabel("Meeting Place      :");
        remaining_label = new JLabel("Remaining seats   :");
        price_label = new JLabel("Price Per Seat      :");
        seat = new JLabel("Seat");
        place_text = new JTextField(30);
        place_text.setEditable(false);
        remaining_text = new JTextField(30);
        remaining_text.setEditable(false);
        price_text = new JTextField(30);
        date_lb = new JLabel("Date                   :");
        time_lb = new JLabel("Time                  :");
        date_lb.setForeground(new Color(154, 84, 255));
        time_lb.setForeground(new Color(154, 84, 255));
        date_txt = new JTextField(30);
        time_txt = new JTextField(30);
        date_txt.setEditable(false);
        time_txt.setEditable(false);
        price_text.setEditable(false);
        Font f = new Font("TH SarabunPSK", Font.BOLD, 80);
        Font f_label = new Font("TH SarabunPSK", Font.BOLD, 18);

        Font f_bigfont = new Font("TH SarabunPSK", Font.BOLD, 25);

        date_lb.setFont(f_bigfont);
        time_lb.setFont(f_bigfont);
        participant.setFont(f);
        participant.setForeground(new Color(154, 84, 255));

        place_label.setFont(f_bigfont);
        remaining_label.setFont(f_bigfont);
        price_label.setFont(f_bigfont);

        place_label.setForeground(new Color(154, 84, 255));
        remaining_label.setForeground(new Color(154, 84, 255));
        price_label.setForeground(new Color(154, 84, 255));


        frame.setLayout(new GridLayout(5, 1));
        pn1.add(participant); //1
        frame.add(pn1, BorderLayout.NORTH);

        pn2.setLayout(new GridLayout(5, 2));

        sub_l1.add(place_label); //2
        sub_l1.add(place_text);
        pn2.add(sub_l1);
        sub_l2.add(remaining_label);
        sub_l2.add(remaining_text);
        pn2.add(sub_l2);
        date_panel.add(date_lb);
        date_panel.add(date_txt);
        time_panel.add(time_lb);
        time_panel.add(time_txt);
        sub_l3.add(price_label);
        sub_l3.add(price_text);
        pn2.add(sub_l3);
        pn2.add(date_panel);
        pn2.add(time_panel);

        frame.add(pn2);

        pn_seat.setLayout(new GridLayout(3, 1)); //3
        seat.setFont(f_bigfont);
        seat.setHorizontalAlignment(JLabel.RIGHT);
        pn_subseat.add(seat);
        pn_seat.add(pn_subseat);

        choose_seat.setFont(f_label);
        pn_cb.add(choose_seat);
        pn_cb.add(seat_cb);

        pn_seat.add(pn_subseat);
        pn_seat.add(pn_cb);
        pn_seat.add(pn_image);
        frame.add(pn_seat);

        ok.setBackground(new Color(184, 134, 255)); //4
        ok.setForeground(new Color(255, 255, 255));
        ok.setPreferredSize(new Dimension(200, 50));
        ok.setFont(f_bigfont);
        pn_ok.add(ok);
        frame.add(pn_ok);

        pn_back.add(back);
        frame.add(pn_back);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setVisible(false);
    }
}
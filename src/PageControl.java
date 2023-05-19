import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PageControl implements ActionListener, WindowListener {
    public static OrganizerPage op;
    private ParticipantPage pp;
    private ParticipantInfoPage ppinfo;
    private HomePage hp;
    private JFrame main_frame;
    private StartPage stp;
    private JDesktopPane dp;
    private OrganizerTableInfo organizerTableInfo;
    private OrganizerTable organizerTable;
    private  PaymentPage pmp;

    public PageControl() {
        op = new OrganizerPage();
        pp = new ParticipantPage();
        hp = new HomePage();
        ppinfo = new ParticipantInfoPage();
        stp = new StartPage();
        main_frame = new JFrame();
        dp = new JDesktopPane();
        organizerTableInfo = new OrganizerTableInfo();
        organizerTable = new OrganizerTable();
        pmp = new PaymentPage();

        op.getOk().addActionListener(this);
        op.getBack().addActionListener(this);
        pp.getOk().addActionListener(this);
        pp.getBack().addActionListener(this);
        hp.getOrganizer_btn().addActionListener(this);
        hp.getParticipant_btn().addActionListener(this);
        main_frame.addWindowListener(this);
        ppinfo.getBn().addActionListener(this);
        ppinfo.getBack_bn().addActionListener(this);
        ppinfo.getCheck_bn().addActionListener(this);
        stp.getStart().addActionListener(this);
        pmp.getBack_bn().addActionListener(this);

        dp.setLayout(new CardLayout(250, 120));
        dp.add(stp.getFr());
        dp.add(hp.getFrame());
        dp.add(op.getFrame());
        dp.add(pp.getFrame());
        dp.add(ppinfo.getFrame());
        dp.add(pmp.getFrame());
        main_frame.add(dp);

        dp.setBackground(new Color(239, 239, 239));

        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.setVisible(true);
        main_frame.setSize(1920, 1080);
    }

    public void actionPerformed(ActionEvent e) {
         if (pp.isOk(e)) {
             String date = "", time = "";
            String place = ParticipantPage.place_text.getText();
            String name = ParticipantInfoPage.comboBox.getSelectedItem().toString();
            String selected_seat = "";
            String id = ParticipantInfoPage.id_tf.getText();
            String price = ParticipantPage.price_text.getText();
            for (int i = 0; i<=OrganizerModal.arrlist.toArray().length - 1; i++) {
                if (OrganizerModal.arrlist.get(i).getMeeting_name().equals(name)) {
                    if (OrganizerModal.seatleft_arrlist.get(i).isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No seat left!!", "", JOptionPane.ERROR_MESSAGE);
                        break;
                    } else {
                        selected_seat = ParticipantPage.seat_cb.getSelectedItem().toString();
                        OrganizerModal.seatleft_arrlist.get(i).remove(OrganizerModal.seatleft_arrlist.get(i).indexOf(ParticipantPage.seat_cb.getSelectedItem().toString()));
                        ParticipantPage.seat_cb.removeAllItems();
                        ParticipantPage.seat_cb.setModel(new DefaultComboBoxModel<String>(OrganizerModal.seatleft_arrlist.get(i).toArray(new String[0])));
                        date = OrganizerModal.arrlist.get(i).getDate();
                        time = OrganizerModal.arrlist.get(i).getTime();
                        JOptionPane.showMessageDialog(null, "Reserve Done!", "", JOptionPane.PLAIN_MESSAGE);
                        ParticipantModal.arrlist.add(new ParticipantData(id, name, place, selected_seat, price, date, time));
                        ParticipantInfoPage.id_tf.setText("");
                        ppinfo.getFrame().setVisible(true);
                        pp.getFrame().setVisible(false);
                        break;
                    }
                }
            }
        } else if (hp.isOrganizer_btn(e)) {
                hp.getFrame().setVisible(false);
                pp.getFrame().setVisible(false);
                op.getFrame().setVisible(true);
        } else if (hp.isParticipant_btn(e)) {
            hp.getFrame().setVisible(false);
            ppinfo.getFrame().setVisible(true);
            pp.getFrame().setVisible(false);
            op.getFrame().setVisible(false);
        } else if (pp.isBack(e)) {
            ppinfo.getFrame().setVisible(true);
            hp.getFrame().setVisible(false);
            pp.getFrame().setVisible(false);
            op.getFrame().setVisible(false);
        } else if (op.isBack(e)) {
            hp.getFrame().setVisible(true);
            pp.getFrame().setVisible(false);
            op.getFrame().setVisible(false);
        } else if (ppinfo.isNext(e)) {
            if (ParticipantInfoPage.id_tf.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please insert your citizen ID", "alert", JOptionPane.ERROR_MESSAGE);
            } else if (ErrorChecker.isDigit(ParticipantInfoPage.id_tf.getText())){
                JOptionPane.showMessageDialog(null, "Please insert your citizen ID not text", "alert", JOptionPane.ERROR_MESSAGE);
            } else {
                int loca = 0;
                for (int i = 0; i <= OrganizerModal.arrlist.toArray().length - 1; i++) {
                    if (OrganizerModal.arrlist.get(i).getMeeting_name().equals(ParticipantInfoPage.comboBox.getSelectedItem().toString())) {
                        ParticipantPage.seat_cb.setModel(new DefaultComboBoxModel<String>(OrganizerModal.seatleft_arrlist.get(i).toArray(new String[0])));
                        loca = i;
                        break;
                    }
                }
                pp.getPlace_text().setText(OrganizerModal.arrlist.get(loca).getMeeting_place());
                pp.getRemaining_text().setText(String.valueOf(OrganizerModal.seatleft_arrlist.get(loca).toArray().length));
                pp.getPrice_text().setText(String.valueOf(OrganizerModal.arrlist.get(loca).getPriceperseat()));
                pp.getDate_txt().setText(OrganizerModal.arrlist.get(loca).getDate());
                pp.getTime_txt().setText(OrganizerModal.arrlist.get(loca).getTime());
                pp.getFrame().setVisible(true);
                op.getFrame().setVisible(false);
                hp.getFrame().setVisible(false);
                ppinfo.getFrame().setVisible(false);
            }
        } else if (ppinfo.isBack(e)) {
            hp.getFrame().setVisible(true);
            ppinfo.getFrame().setVisible(false);
            op.getFrame().setVisible(false);
            pp.getFrame().setVisible(false);
        } else if (ppinfo.isCheck(e)) {
             pmp.sum_price();
             if (PaymentPage.seat == 0) {
                JOptionPane.showMessageDialog(null, "ID not found!!!", "alert", JOptionPane.ERROR_MESSAGE);
             } else {
                 pmp.getLabel2().setText("            Your total price in " + ParticipantInfoPage.comboBox.getSelectedItem().toString() + " is " + pmp.price + " baht.");
                 pmp.getLabel3().setText("            Your total seat is " + pmp.seat);
                 pmp.getFrame().setVisible(true);
                 ppinfo.getFrame().setVisible(false);
             }
         } else if (stp.isStart(e)) {
             stp.getFr().setVisible(false);
             hp.getFrame().setVisible(true);
         } else if (pmp.isBack(e)) {
             pmp.getFrame().setVisible(false);
             ppinfo.getFrame().setVisible(true);
         }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        OrganizerModal.load();
        ParticipantModal.load();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        OrganizerModal.save();
        ParticipantModal.save();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
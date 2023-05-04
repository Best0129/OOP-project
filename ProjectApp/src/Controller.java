import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Controller implements ActionListener  {
    private OrganizerPage op;
    private Participant pp;
    private HomePage hp;
    private JFrame main_frame;
    private JDesktopPane dp;

    public Controller() {
        op = new OrganizerPage();
        pp = new Participant();
        hp = new HomePage();
        main_frame = new JFrame();
        dp = new JDesktopPane();

        op.getOk().addActionListener(this);
        op.getBack().addActionListener(this);
        pp.getOk().addActionListener(this);
        pp.getImage().addActionListener(this);
        pp.getBack().addActionListener(this);
        hp.getOrganizer_btn().addActionListener(this);
        hp.getParticipant_btn().addActionListener(this);

        main_frame.add(hp.getFrame());
        main_frame.add(op.getFrame());
        main_frame.add(pp.getFrame());

        main_frame.setLayout(new CardLayout(30, 30));
//        main_frame.add(dp);
        main_frame.setBackground(new Color(255, 255, 255));

        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.setVisible(true);
//        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
//        GraphicsDevice gd = graphics.getDefaultScreenDevice();
//        gd.setFullScreenWindow(main_frame);
        main_frame.setSize(1920, 1080);
    }

    public void actionPerformed(ActionEvent e) {
        if (op.isOk(e)) {
            String meeting_name = op.getMeeting_txt().getText();
            String meeting_place = op.getPlace_txt().getText();
            int number_of_seat = Integer.parseInt(op.getNumberofseat_txt().getText());
            double price = Double.parseDouble(op.getPrice_txt().getText());
            String diagram_link = op.getDiagram_txt().getText();
        } else if (pp.isOk(e)) {
            String selected_seat = pp.getSeat_cb().getSelectedItem().toString();
            System.out.println("Get " + selected_seat);
        } else if (pp.isImage(e)) {
            pp.getFrame_image().setVisible(true);
        } else if (hp.isOrganizer_btn(e)) {
            hp.getFrame().setVisible(false);
            pp.getFrame().setVisible(false);
            op.getFrame().setVisible(true);

        } else if (hp.isParticipant_btn(e)) {
            hp.getFrame().setVisible(false);
            op.getFrame().setVisible(false);
            pp.getFrame().setVisible(true);
        } else if (pp.isBack(e)) {
            hp.getFrame().setVisible(true);
            pp.getFrame().setVisible(false);
            op.getFrame().setVisible(false);
        } else if (op.isBack(e)) {
            hp.getFrame().setVisible(true);
            pp.getFrame().setVisible(false);
            op.getFrame().setVisible(false);
        }
    }
}

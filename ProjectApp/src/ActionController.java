import java.awt.event.*;
import javax.swing.*;

public class ActionController implements ActionListener  {
    private OrganizerPage op;
    private Participant pp;
    private HomePage hp;
    private JFrame main_frame;

    public ActionController() {
        op = new OrganizerPage();
        pp = new Participant();
        hp = new HomePage();
        main_frame = new JFrame();

        op.getOk().addActionListener(this);
        pp.getOk().addActionListener(this);
        pp.getImage().addActionListener(this);
        hp.getCreator().addActionListener(this);
        hp.getVisitor().addActionListener(this);

        main_frame.add(hp.getFr());
        main_frame.add(op.getFrame());
        main_frame.add(pp.getFrame());

        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.setSize(610, 750);
        main_frame.setVisible(true);
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
        } else if (hp.isCreater(e)) {
            hp.getFr().setVisible(false);
            pp.getFrame().setVisible(false);
            op.getFrame().setVisible(true);

        } else if (hp.isVisitor(e)) {
            hp.getFr().setVisible(false);
            op.getFrame().setVisible(false);
            pp.getFrame().setVisible(true);
        }
    }
}

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class HomePage {

    private JInternalFrame frame;
    private JPanel main_panel, panel1, panel2;
    private JButton organizer_btn, participant_btn;
    //    private JLabel or;
    private ImageIcon organizer_image, participant_image;

    public JButton getParticipant_btn() {
        return participant_btn;
    }

    public JButton getOrganizer_btn() {
        return organizer_btn;
    }

    public JInternalFrame getFrame() {
        return frame;
    }


    public boolean isOrganizer_btn(ActionEvent e) {
        return e.getSource().equals(organizer_btn);
    }

    public boolean isParticipant_btn(ActionEvent e) {
        return  e.getSource().equals(participant_btn);
    }

    public HomePage() {
        organizer_image = new ImageIcon("IMG_8055.png");
        Image image = organizer_image.getImage(); // transform it
        Image newimg = image.getScaledInstance(500, 450,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        organizer_image = new ImageIcon(newimg);  // transform it back
        participant_image = new ImageIcon("IMG_8057.png");
        Image image1 = participant_image.getImage(); // transform it
        Image newimg1 = image1.getScaledInstance(500, 450,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        participant_image = new ImageIcon(newimg1);  // transform it back
        frame = new JInternalFrame("", false, false, false, false);
        main_panel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        organizer_btn = new JButton(organizer_image);
        participant_btn = new JButton(participant_image);
        Font f = new Font("TH SarabunPSK", Font.BOLD, 30);

        frame.setLayout(new CardLayout(100, 140));
        main_panel.setLayout(new GridLayout(1, 2));

        panel1.add(participant_btn);
        panel2.add(organizer_btn);
        main_panel.add(panel1);
        main_panel.add(panel2);
        frame.add(main_panel);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(false);

    }
}
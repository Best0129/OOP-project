import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class HomePage {

    private JInternalFrame frame;
    private JPanel main_panel, panel1, panel2, upper_panel;
    private JButton organizer_btn, participant_btn, back_btn;
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
        Image newimg = image.getScaledInstance(720, 950,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        organizer_image = new ImageIcon(newimg);  // transform it back
        participant_image = new ImageIcon("IMG_8057.png");
        Image image1 = participant_image.getImage(); // transform it
        Image newimg1 = image1.getScaledInstance(720, 850,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        participant_image = new ImageIcon(newimg1);  // transform it back
        frame = new JInternalFrame("", false, false, false, false);
        main_panel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        upper_panel = new JPanel();
        organizer_btn = new JButton(organizer_image);
        participant_btn = new JButton(participant_image);
        back_btn = new JButton("Back");
//        or = new JLabel("OR");
        Font f = new Font("TH SarabunPSK", Font.BOLD, 30);

        frame.setBackground(Color.RED);
        frame.setLayout(new BorderLayout());
        BasicInternalFrameUI ui = (BasicInternalFrameUI)frame.getUI();
        Component northPane = ui.getNorthPane();
        northPane.setBackground(new Color(245, 13, 13));
        main_panel.setLayout(new GridLayout(1, 2));
        panel1.setLayout(new CardLayout(30, 30));
        panel2.setLayout(new CardLayout(30, 30));

//        or.setFont(f);
        panel1.add(participant_btn);
        panel2.add(organizer_btn);
        main_panel.add(panel1);
//        main_panel.add(or);
        main_panel.add(panel2);
        upper_panel.add(back_btn);
        frame.add(upper_panel, BorderLayout.NORTH);
        frame.add(main_panel, BorderLayout.CENTER);

        panel1.setBackground(Color.WHITE);
        panel2.setBackground(Color.WHITE);
        main_panel.setBackground(Color.WHITE);
        upper_panel.setBackground(Color.WHITE);

        back_btn.setBackground(new Color(243, 198, 198));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}

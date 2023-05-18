import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class OrganizerTableInfo implements ActionListener {
    public static JFrame frame;
    private JPanel panel1, panel2;
    public static JComboBox comboBox;
    private JButton ok_bn;
    public static String name_choice;

    public OrganizerTableInfo() {
        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        comboBox = new JComboBox();
        ok_bn = new JButton("ok");
        ok_bn.addActionListener(this);

        frame.setLayout(new BorderLayout());
        panel1.add(comboBox);
        frame.add(comboBox, BorderLayout.CENTER);
        panel2.add(ok_bn);
        frame.add(panel2, BorderLayout.SOUTH);
        comboBox.setPreferredSize(new Dimension(100, 40));

        frame.setSize(200, 110);
        frame.setLocationRelativeTo(null); //set JFrame to Center
        frame.setVisible(false);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ok_bn)) {
            OrganizerTable.dataTable.setRowCount(0);
            frame.setVisible(false);
            OrganizerTable.frame.setVisible(true);
            int num_row = 0, num_colum = 0;
            for (int i = 0; i <= ParticipantModal.arrlist.toArray().length - 1; i++) {
                if (ParticipantModal.arrlist.get(i).getMeeting_name().equals(comboBox.getSelectedItem().toString())) {
                    OrganizerTable.dataTable.addRow(new Object[0]);
                    OrganizerTable.dataTable.setValueAt(ParticipantModal.arrlist.get(i).getId(), num_row, num_colum++);
                    OrganizerTable.dataTable.setValueAt(ParticipantModal.arrlist.get(i).getMeeting_name(), num_row, num_colum++);
                    OrganizerTable.dataTable.setValueAt(ParticipantModal.arrlist.get(i).getPlace(), num_row, num_colum++);
                    OrganizerTable.dataTable.setValueAt(ParticipantModal.arrlist.get(i).getPrice(), num_row, num_colum++);
                    OrganizerTable.dataTable.setValueAt(ParticipantModal.arrlist.get(i).getSeat(), num_row, num_colum);
                    num_colum = 0;
                    num_row++;
                }
            }
        }
    }
}

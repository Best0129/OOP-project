import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class OrganizerTable implements ActionListener {
    public static JFrame frame;
    public static JTable table;
    private JPanel pn;
    public static DefaultTableModel dataTable;
    private JButton cancel;
    private int ind;

    public OrganizerTable() {
        frame = new JFrame();
        pn = new JPanel();
        cancel = new JButton("Cancel Meeting");
        cancel.addActionListener(this);
        cancel.setPreferredSize(new Dimension(125, 20));
        String[] columnNames = {"Citizen ID", "Meeting name", "Place", "Price", "Seat", "Date", "Time"};
        table = new JTable();
        dataTable = (DefaultTableModel)table.getModel();
        dataTable.addColumn(columnNames[0]);
        dataTable.addColumn(columnNames[1]);
        dataTable.addColumn(columnNames[2]);
        dataTable.addColumn(columnNames[3]);
        dataTable.addColumn(columnNames[4]);
        dataTable.addColumn(columnNames[5]);
        dataTable.addColumn(columnNames[6]);
        pn.add(cancel);
        frame.add(pn, BorderLayout.SOUTH);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null); //set JFrame to Center
        frame.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
                    if (e.getSource().equals(cancel)) {
                        for (int i = 0; i <= OrganizerModal.arrlist.toArray().length - 1; i++) {
                            if (OrganizerTableInfo.comboBox.getSelectedItem().toString().equals(OrganizerModal.arrlist.get(i).getMeeting_name())) {
                                for (int j = 0; i<=ParticipantModal.arrlist.toArray().length - 1; j++) {
                                    if (ParticipantModal.arrlist.get(j).getMeeting_name().equals(OrganizerModal.arrlist.get(i).getMeeting_name())) {
                                        ParticipantModal.arrlist.remove(ParticipantModal.arrlist.get(i));
                                    }                                }
                                OrganizerTableInfo.comboBox.removeItem(OrganizerModal.arrlist.get(i).getMeeting_name());
                                ParticipantInfoPage.comboBox.removeItem(OrganizerModal.arrlist.get(i).getMeeting_name());
                                JOptionPane.showMessageDialog(null, OrganizerModal.arrlist.get(i).getMeeting_name() + " is CANCEL!!!", "alert", JOptionPane.ERROR_MESSAGE);
                                OrganizerModal.arrlist.remove(OrganizerModal.arrlist.get(i));
                                OrganizerModal.seatleft_arrlist.remove(OrganizerModal.seatleft_arrlist.get(i));
                                break;
                            }
            }
            frame.setVisible(false);
        }
    }
}
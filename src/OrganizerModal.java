import java.util.ArrayList;
import java.io.*;

public class OrganizerModal {
    public static ArrayList<OrganizerData> arrlist = new ArrayList<OrganizerData>();
    public static ArrayList<ArrayList<String>> seatleft_arrlist = new ArrayList<ArrayList<String>>();

    public static void save() {
        try {
            System.out.println("Organizer Saving...");
            FileOutputStream ops = new FileOutputStream("OrganizerData.ser");
            ObjectOutputStream oos = new ObjectOutputStream(ops);

            oos.writeObject(arrlist);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileOutputStream ops = new FileOutputStream("Seat.ser");
            ObjectOutputStream oos = new ObjectOutputStream(ops);

            oos.writeObject(seatleft_arrlist);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Organizer Saved");
    }

    public static void load() {
        try {
            System.out.println("Organizer Loading...");
            FileInputStream fis = new FileInputStream("Organizerdata.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            arrlist = (ArrayList<OrganizerData>) ois.readObject();
            ois.close();
            for (int i = 0; i <= arrlist.toArray().length - 1; i++) {
                ParticipantInfoPage.comboBox.addItem(OrganizerModal.arrlist.get(i).getMeeting_name());
                OrganizerTableInfo.comboBox.addItem(OrganizerModal.arrlist.get(i).getMeeting_name());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("Seat.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            seatleft_arrlist = (ArrayList<ArrayList<String>>) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
            System.out.println("Organizer Loaded");
        }

}

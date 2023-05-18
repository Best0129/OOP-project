import java.io.*;
import java.util.ArrayList;

public class ParticipantModal {

    public static ArrayList<ParticipantData> arrlist = new ArrayList<ParticipantData>();

    public static void save() {
        try {
            System.out.println("Participant Saving...");
            FileOutputStream ops = new FileOutputStream("ParticipantData.ser");
            ObjectOutputStream oos = new ObjectOutputStream(ops);

            oos.writeObject(arrlist);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Participant Saved");
    }

    public static void load() {
        try {
            System.out.println("Participant Loading...");
            FileInputStream fis = new FileInputStream("ParticipantData.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            arrlist = (ArrayList<ParticipantData>) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Participant Loaded");
    }
}


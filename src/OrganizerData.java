import java.io.Serializable;

public class OrganizerData implements Serializable {
        public String meeting_name, meeting_place, diagram_image;
        public int numberofseat;
        public double priceperseat;

        public OrganizerData() {
            this("", "", 0, 0);
        }

        public OrganizerData(String meeting_name, String meeting_place, int numberofseat, double priceperseat) {
            this.meeting_name = meeting_name;
            this.meeting_place = meeting_place;
            this.numberofseat = numberofseat;
            this.priceperseat = priceperseat;
        }

    public String getMeeting_name() {
        return meeting_name;
    }

    public void setPriceperseat(int priceperseat) {
        this.priceperseat = priceperseat;
    }

    public void setNumberofseat(int numberofseat) {
        this.numberofseat = numberofseat;
    }

    public void setDiagram_image(String diagram_image) {
        this.diagram_image = diagram_image;
    }

    public void setMeeting_place(String meeting_place) {
        this.meeting_place = meeting_place;
    }

    public void setMeeting_name(String meeting_name) {
        this.meeting_name = meeting_name;
    }

    public double getPriceperseat() {
        return priceperseat;
    }

    public int getNumberofseat() {
        return numberofseat;
    }

    public String getDiagram_image() {
        return diagram_image;
    }

    public String getMeeting_place() {
        return meeting_place;
    }
}

import java.io.Serializable;

public class OrganizerData implements Serializable {
        public String meeting_name, meeting_place, date, time;
        public int numberofseat;
        public double priceperseat;

        public OrganizerData() {
            this("", "", 0, 0, "", "");
        }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public OrganizerData(String meeting_name, String meeting_place, int numberofseat, double priceperseat, String date, String time) {
            this.meeting_name = meeting_name;
            this.meeting_place = meeting_place;
            this.numberofseat = numberofseat;
            this.priceperseat = priceperseat;
            this.date = date;
            this.time = time;
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

    public String getMeeting_place() {
        return meeting_place;
    }
}

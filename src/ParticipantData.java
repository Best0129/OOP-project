import java.io.Serializable;

public class ParticipantData implements Serializable {

    public String id, meeting_name, place, seat, price, date, time;

    public ParticipantData() {
        this("", "", "", "", "", "", "");
    }

    public String getPrice() {
        return price;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public ParticipantData(String id, String meeting_name, String place, String seat, String price, String date, String time) {
        this.id = id;
        this.place = place;
        this.seat = seat;
        this.meeting_name = meeting_name;
        this.price = price;
        this.date = date;
        this.time = time;
    }

    public String getSeat() {
        return seat;
    }

    public String getMeeting_name() {
        return meeting_name;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public String getId() {
        return id;
    }
}

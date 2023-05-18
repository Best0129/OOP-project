import java.io.Serializable;

public class ParticipantData implements Serializable {

    public String id, meeting_name, place, seat, price;

    public ParticipantData() {
        this("", "", "", "", "");
    }

    public String getPrice() {
        return price;
    }

    public ParticipantData(String id, String meeting_name, String place, String seat, String price) {
        this.id = id;
        this.place = place;
        this.seat = seat;
        this.meeting_name = meeting_name;
        this.price = price;
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

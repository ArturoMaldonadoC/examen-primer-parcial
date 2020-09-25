package uaslp.enginering.exam.model;

public class Reservation {
    private String guest;
    private String arrivalDate;
    private String nights;
    private String roomNumber;

    public void setGuest (){
        this.guest=guest;
    }

    public String getGuest(String guest) {
        return guest;
    }


    public void setArrivalDate (){
        this.arrivalDate=arrivalDate;
    }

    public String getArrivalDate(String arrivalDate) {
        return arrivalDate;
    }

    public void setNights (){
        this.nights=nights;
    }

    public String getNights(String nights) {
        return nights;
    }

    public void setRoomNumber (){
        this.roomNumber=roomNumber;
    }

    public String getRoomNumber(String roomNumber) {
        return roomNumber;
    }
}

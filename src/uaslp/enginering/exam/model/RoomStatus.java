package uaslp.enginering.exam.model;

public enum RoomStatus {
    ;

    private String number;

    private String status;

    private String size;

    private String rooms;

    public void setNumber(String number){
           this.number=number;
    }

    public String getNumber() {
        return number;
    }

    public void setStatus(String status){
        this.status=status;
    }

    public String getStatus(){
        return status;
    }

    public void setSize(String size){
        this.size=size;
    }

    public String getSize(){
        return size;
    }

    public void setRooms(String rooms){
        this.rooms=rooms;
    }

    public String getRooms(){
        return rooms;
    }


}

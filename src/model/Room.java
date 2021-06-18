package model;

public class Room implements IRoom {


    private String roomNumber;
    public Double price;
    RoomType roomType;
    boolean isFree;

    public Room(String roomNumber, Double price, RoomType roomType ){

        super();
        this.roomNumber = roomNumber;
        this.price = price;
        this.roomType = roomType;

    }

   /* @Override
    public String getroomNumber() {

        return roomNumber;
    }

    @Override
    public Double getprice() {

        return price;
    }

    @Override

    public RoomType getroomType() {

        return roomType;
    }*/

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return price;
    }

    @Override
    public RoomType getRoomType() {
        return roomType;
    }

    @Override

    public boolean isFree() {
        return false;
    }

    @Override

    public String toString(){

        return "Room" + roomNumber + "Price" + price + "Room Type" + roomType;
     //return "Room {" + roomNumber = "\" + roomNumber + "\'' + ", price = " + price +", enumeration=" + roomType +'}';


    }
}

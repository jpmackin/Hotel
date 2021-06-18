package model;

public class FreeRoom extends Room {

    public FreeRoom(String roomNumber, Double price, RoomType roomType) {
        super(roomNumber, 0.00, roomType);
    }


    @Override

    public Double getRoomPrice() {
        return price;
    }


    @Override
    public boolean isFree() {
        return true;
    }

    @Override

    public String toString() {

        return "FreeRoom{" + " +roomType=" + roomType + ", isFree=" + isFree + '}';

    }



}

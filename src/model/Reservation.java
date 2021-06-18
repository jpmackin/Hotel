package model;

import java.util.Date;

public class Reservation {

    private java.util.Date Date;
    private Customer customer;
    private IRoom room;
    private Date checkInDate;
    private Date checkOutDate;

    public Reservation(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {

        this.Date = checkInDate;
        this.Date = checkOutDate;
    }

    public Date getcheckInDate() {

        return checkInDate;
    }

    public void setcheckInDate() {
        this.Date = checkInDate;
    }

    public Date getcheckOutDate() {
        return checkOutDate;
    }

    public void setcheckOutDate() {
        this.Date = checkOutDate;
    }

    @Override

    public String toString(){

        return "The customer" + customer +  ", is in" + room.getRoomNumber() + ", they checked in at" + checkInDate
                + " and check out at" + checkOutDate;


    }
}

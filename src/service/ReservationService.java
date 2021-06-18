package service;

import model.IRoom;
import model.Reservation;
import model.Room;
import model.RoomType;
import model.Customer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class ReservationService {
    private static ReservationService reservationService;
    public Collection<Reservation> reservations = new HashSet<>();
    public Collection<IRoom> rooms = new HashSet<>();


    private ReservationService(){}

    public static ReservationService getInstance(){
        if(reservationService == null){
            reservationService = new ReservationService();
        }
        return reservationService;
    }

    public void addRoom(IRoom room){
        rooms.add(room);
    }

    public IRoom getARoom(String roomNumber) {
        for (IRoom room : rooms) {
            if (roomNumber.equals(room.getRoomNumber())) {
                return room;
            }
        }
        return null;
    }

    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        Reservation reservedRooms = new Reservation(customer,room,checkInDate, checkOutDate);
        reservations.add(reservedRooms);
        return reservedRooms;
    }

    public Collection<IRoom> findARoom(Date checkInDate, Date checkOutDate) {
        for (IRoom room : rooms) {
            if (checkInDate.after(checkInDate) && checkOutDate.before(checkOutDate)) {
                Iterator<IRoom> iRoomIterator = rooms.iterator();
                while (iRoomIterator.hasNext()) {
                    System.out.println(iRoomIterator.next());
                }
                return rooms;
            }
        }
        return null;
    }

    public Collection<Reservation> getCustomerReservation(Customer customer){
        CustomerService.getInstance().getCustomer(customer.getEmail());
        return reservations;
    }
    public void printAllReseverations(){
        for (Reservation reservation : reservations){
            System.out.println(reservations);
        }
    }

    /*static List<IRoom> roomList = new ArrayList<>();
    static List<Reservation> reservationList = new ArrayList<>();
    static Collection<IRoom> availableRooms = new ArrayList<>();

    public static void addRoom(String roomNumber, Double price, RoomType roomType){

        Room room = new Room(roomNumber, price, roomType);

        if (roomList.contains(getARoom(roomNumber))) {
            System.out.println("This room number already exists. The room cannot be created");
        }
        else {
            room = new Room(room.getRoomNumber(), room.getRoomPrice(), room.getRoomType());

            roomList.add(room);
            System.out.println("The room was successfully added to our room list");
        }

        public static boolean isReservationDateValid(String date, String date_format) {
            try {
                DateFormat df = new SimpleDateFormat(date format);
                df.setLenient(false);
                df.parse(date);
                return true;
            } catch (ParseException e) {
                return false;
            }
        }

        public static IRoom getARoom(String roomId){
            for (IRoom room : roomList) {
                if ((roomId).equals(room.getRoomNumber())) {
                    return room;
                }
            }

            return null;

        }

        public static Reservation reserveARoom(String Customer customer, IRoom room, Date checkInDate, Date checkOutDate){

            Reservation reservation = new Reservation(customer, room, checkInDate, checkOutDate);

            reservationList.add(reservation);
            return reservation;
        }

        public static Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate){

            Collection<IRoom> availableRooms = new LinkedHashSet<>();

            System.out.println("Available room at start of method" + availableRooms);

            if (reservationList.size() == 0) {
                availableRooms = roomList;
            } else {
                for (IRoom room : roomList) {
                    for (Reservation reservation : reservationList) {

                        if ((room.getRoomNumber().equals(reservation.getRoom().getRoomNumber())) &&
                                (((checkInDate.before(reservation.getCheckInDate())) && (checkOutDate.before(reservation.getCheckInDate()))) ||
                                        ((checkInDate.after(reservation.getCheckOutDate())) && ((checkOutDate.after(reservation.getCheckOutDate())))))) {
                            availableRooms.add(room);
                        } else {

                            if (room.getRoomNumber().equals(reservation.getRoom().getRoomNumber())) {
                                availableRooms.remove(room);
                            }
                        }
                    }
                }

            }

            System.out.println(availableRooms);
            return availableRooms;
        }

        public static List<Reservation> getCustomersReservation(String customerMail){
            List<Reservation> customerReservations = new ArrayList<>();

            for (Reservation reservation : reservationList) {
                if (reservation.getCustomer() != null &&
                        (CustomerService.getCustomer(customerMail)) != null) {
                    if ((reservation.getCustomer().toString()).equals(CustomerService.getCustomer(customerMail).toString())) {
                        customerReservations.add(reservation);
                    }
                }
            }
            return customerReservations;
        }

        public static Collection<Reservation> getAllReservations() {
            return reservationList;
        }

        public static Collection<IRoom> allRooms(){
            return roomList;


    }*/

}

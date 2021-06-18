package api;

import model.Customer;
import model.IRoom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AdminResource {

    Collection<Customer> customer = new ArrayList<>();

        private static AdminResource adminResource = null;

        private AdminResource() {
        }

        public static AdminResource getInstance() {
            if (null == adminResource) {
                adminResource = new AdminResource();
            }
            return adminResource;
        }

        public Customer getCustomer(String email) {

            return null;
    }

        public void addRoom(List<IRoom> room)
        {}
        public Collection<IRoom> getAllCustomer() {
            return null;
        }

        //public Collection<Customer> getAllCustomer(){
            //return null;

        //}

        public void displayAllReservation()
        {}
}

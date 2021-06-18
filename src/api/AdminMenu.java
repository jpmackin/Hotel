package api;

import model.Customer;

import java.util.Collection;
import java.util.Scanner;



public class AdminMenu {
    public void start() {
    boolean keepRunning = true;

    try (Scanner scanner = new Scanner(System.in)) {

        while (keepRunning) {
            try {

                System.out.println("1. See all Customers");
                System.out.println("2. See all Rooms");
                System.out.println("3. See all Reservations");
                System.out.println("4. Add a Room");
                System.out.println("5. Back to Main Menu");
                int selection = Integer.parseInt(scanner.next());


                if (selection == 1) {
                    System.out.println("See all Customers");
                    //Collection<Customer> customers = adminResource.getAllCustomers();

                    //keepRunning = false;
                } else if (selection == 2) {
                    System.out.println("See all Rooms");
                    keepRunning = false;
                } else if (selection == 3) {
                    System.out.println("See all Reservations");
                   // AdminResource.displayAllReservations();
                    //keepRunning = false;
                } else if (selection == 4) {
                    System.out.println("Add a Room");
                    keepRunning = false;
                } else if (selection == 5) {
                    System.out.println("Going back to the Main Menu");
                    MainMenu mainMenu = new MainMenu();
                    mainMenu.start();
                } else {
                    System.out.println("Please select a number between 1 and 5");
                }
            } catch (Exception ex) {
                System.out.println("\nError - Invalid Input\n");
            }
        }
    }

}
}

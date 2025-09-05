package main;


import java.util.*;
import model.Booking;
import daoimp.Bookingdaoimp;
import serviceImp.BookingServiceImp;
import daoimp.Userdaoimp;
import daoimp.Productdaoimp;

public class BookingMenu implements Menu {
    private Scanner sc = new Scanner(System.in);
    private BookingServiceImp bookingService = new BookingServiceImp();

    @Override
    public void showMenu() {
        while (true) {
            System.out.println("\n==== Booking Menu ====");
            System.out.println("1. Create Booking");
            System.out.println("2. View All Bookings");
            System.out.println("3. Find Booking by ID");
            System.out.println("4. Cancel Booking");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt(); sc.nextLine();
            handleChoice(choice);
            if (choice == 5) break;
        }
    }

    @Override
    public void handleChoice(int choice) {
        switch (choice) {
            case 1 -> createBooking();
            case 2 -> viewBookings();
            case 3 -> viewBookingById();
            case 4 -> cancelBooking();
            case 5 -> System.out.println("Returning to Main Menu...");
            default -> System.out.println("Invalid choice. Try again.");
        }
    }

    private void createBooking() {
    	Userdaoimp userdao = new Userdaoimp();
    	Productdaoimp productdao = new Productdaoimp();
		System.out.println("All users: " + userdao .FindAllUser());
    	System.out.println("All products: " + productdao.findAll());
        System.out.print("Enter User ID: "); int userId = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Product ID: "); int productId = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Booking Amount: "); int amount = sc.nextInt(); sc.nextLine();

        bookingService.createBooking(userId, productId, amount);
    }
    
    private void cancelBooking() {
    	System.out.print("Enter Booking ID: "); int BookId = sc.nextInt(); sc.nextLine();
    	bookingService.cancelBooking(BookId);
    	System.out.println("Your Booking Cancelled Successfully !!");
    }
    

    private void viewBookings() {
        bookingService.getAllBooking().forEach(System.out::println);
    }
    
    private void viewBookingById() {
    	System.out.print("Enter Booking ID: "); int BookId = sc.nextInt(); sc.nextLine();
    	bookingService.getBookingId(BookId);
    }
}


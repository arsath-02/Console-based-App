package main;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UserMenu userMenu = new UserMenu();
        ProductMenu productMenu = new ProductMenu();
        BookingMenu bookingMenu = new BookingMenu();

        while (true) {
            System.out.println("\n==== Main Menu ====");
            System.out.println("1. User Management");
            System.out.println("2. Product Management");
            System.out.println("3. Booking Management");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1 -> userMenu.showMenu();
                case 2 -> productMenu.showMenu();
                case 3 -> bookingMenu.showMenu();
                case 4 -> {
                    System.out.println("Exiting application...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

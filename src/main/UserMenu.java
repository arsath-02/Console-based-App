package main;

import java.util.*;
import model.User;
import daoimp.Userdaoimp;
import serviceImp.UserServiceImp;
public class UserMenu implements Menu{
	
	Scanner sc = new Scanner(System.in);
	UserServiceImp userservice = new UserServiceImp();
	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		 while (true) {
	            System.out.println("\n==== User Menu ====");
	            System.out.println("1. Register User");
	            System.out.println("2. View All Users");
	            System.out.println("3. Find User by ID");
	            System.out.println("4. Delete User");
	            System.out.println("5. Back to Main Menu");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt(); sc.nextLine();
	            handleChoice(choice);
	            if (choice == 5) break;
	        }
		
	}

	@Override
	public void handleChoice(int choice) {
		// TODO Auto-generated method stub
		switch (choice) {
        case 1 -> registerUser();
        case 2 -> viewUsers();
        case 3 -> findUser();
        case 4 -> deleteUser();
        case 5 -> System.out.println("Returning to Main Menu...");
        default -> System.out.println("Invalid choice. Try again.");
    }
		
	}
	
	private void registerUser() {
		System.out.println("Enter the UserName: ");
		String name = sc.nextLine();
		System.out.println("Enter the Password: ");
		String password =sc.nextLine();
		System.out.println("Enter the PhoneNumber: ");
		int phone =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Address: ");
		String address = sc.nextLine();
		
		userservice.registerUser(name,password,phone,address);
	}
	
	private  void viewUsers() {
		userservice.getAllUsers().forEach(System.out::println);
	}
	
	private void findUser() {
		System.out.println("Enter the User Id :");
		int id = sc.nextInt(); sc.nextLine();
		User user = userservice.getById(id);
		if(user != null) {
			System.out.println(user);
		}else {
			System.out.println("User Not Found !!");
		}
		
	}
	
	private void deleteUser() {
		System.out.println("Enter the User Id to Delete: ");
		int id = sc.nextInt(); sc.nextLine();
		userservice.deleteUser(id);
		
	}
	

}

package main;

import java.util.*;
import model.Product;
import daoimp.Productdaoimp;
import serviceImp.ProductServiceImp;
public class ProductMenu implements Menu {
	Scanner sc = new Scanner(System.in);
	private ProductServiceImp productService = new ProductServiceImp();

	    @Override
	    public void showMenu() {
	        while (true) {
	            System.out.println("\n==== Product Menu ====");
	            System.out.println("1. Add Product");
	            System.out.println("2. View All Products");
	            System.out.println("3. Find Product by ID");
	            System.out.println("4. Delete Product");
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
	            case 1 -> addProduct();
	            case 2 -> viewProducts();
	            case 3 -> findProduct();
	            case 4 -> deleteProduct();
	            case 5 -> System.out.println("Returning to Main Menu...");
	            default -> System.out.println("Invalid choice. Try again.");
	        }
	    }

	    private void addProduct() {
	        System.out.print("Enter product name: "); String name = sc.nextLine();
	        System.out.print("Enter price: "); int price = sc.nextInt(); sc.nextLine();
	        productService.registerProduct(name, price);
	        System.out.println("Product added successfully!");
	    }

	    private void viewProducts() {
	        productService.findAll().forEach(System.out::println);
	    }

	    private void findProduct() {
	        System.out.print("Enter Product ID: "); int id = sc.nextInt(); sc.nextLine();
	        Product product = productService.findById(id);
	        if (product != null) System.out.println(product);
	        else System.out.println("Product not found.");
	    }

	    private void deleteProduct() {
	        System.out.print("Enter Product ID to delete: "); int id = sc.nextInt(); sc.nextLine();
	        productService.deleteProduct(id);
	        System.out.println("Product deleted successfully (if existed).");
	    }
	}



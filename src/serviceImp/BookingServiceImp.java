package serviceImp;

import java.util.*;
import model.Booking;
import model.User;
import model.Product;
import daoimp.Bookingdaoimp;
import daoimp.Userdaoimp;
import daoimp.Productdaoimp;
import serviceint.BookingServiceInt;



public class BookingServiceImp  implements BookingServiceInt{
	Productdaoimp productdao = new Productdaoimp();
	Bookingdaoimp bookingdao = new Bookingdaoimp();
	Userdaoimp userdao = new Userdaoimp();
	
	
	@Override
	public void createBooking(int user_id, int product_id, int amount) {
		// TODO Auto-generated method stub
		User user = userdao.findById(user_id);
		Product product = productdao.findById(product_id);
		
		if (user == null || product == null) {
	        System.out.println("Cannot create booking: Invalid user or product ID.");
	        return;
	    }
		Booking booking = new Booking(user,product,amount);
		bookingdao.save(booking);
		
		System.out.println("Booking Created sucessfully !!");
		
	}

	@Override
	public void cancelBooking(int booking_id) {
		// TODO Auto-generated method stub
		bookingdao.delete(booking_id);
		System.out.println("Booking cancelled successfully ");
		
	}

	@Override
	public List<Booking> getAllBooking() {
		// TODO Auto-generated method stub
		System.out.println("All Bookings fetched successfully " );
		return bookingdao.findAll();
	}

	@Override
	public Booking getBookingId(int booking_id) {
		// TODO Auto-generated method stub
		System.out.println("Booking are fetched successfully ");
		return bookingdao.findById(booking_id);
	}

	

}

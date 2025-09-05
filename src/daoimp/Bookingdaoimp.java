package daoimp;

import model.Booking;
import daoInt.Bookingdaoint;
import java.util.*;
public class Bookingdaoimp implements Bookingdaoint{
	private static List<Booking> books = new ArrayList<>();
	@Override
	public void save(Booking book) {
		// TODO Auto-generated method stub
		books.add(book);
	}

	@Override
	public void delete(int book_id) {
		// TODO Auto-generated method stub
		for(Booking b:books) {
			if(b.getBooking_id() == book_id) {
				books.remove(b);
				break;
			}
		}
	}

	@Override
	public Booking findById(int book_id) {
		// TODO Auto-generated method stub
		for(Booking b:books) {
			if(b.getBooking_id() == book_id) {
				return b;
			}
		}
		return null;
	}

	@Override
	public List<Booking> findAll() {
		// TODO Auto-generated method stub
		
		return books;
	}

}

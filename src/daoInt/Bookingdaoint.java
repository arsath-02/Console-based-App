package daoInt;

import java.util.*;
import model.Booking;

public interface Bookingdaoint {
	public void save(Booking book);
	public void delete(int book_id);
	public Booking findById(int book_id);
	public List<Booking> findAll();
}

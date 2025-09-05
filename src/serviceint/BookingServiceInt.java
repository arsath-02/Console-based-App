package serviceint;

import java.util.*;
import model.Booking;

public interface BookingServiceInt {
		public void createBooking(int user_id ,int product_id ,int amount);
		public void cancelBooking(int booking_id);
		public List<Booking> getAllBooking();
		public Booking getBookingId(int booking_id);
}

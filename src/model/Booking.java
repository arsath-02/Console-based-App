package model;

public class Booking {
	private static int  bookcounter =0;
	private int booking_id;
	private User user;
	private Product product;
	private int booking_amount;
	
	 public Booking(User user, Product product,int booking_amount){
		this.booking_id = ++bookcounter;
		this.user = user;
		this.product = product;
		this.booking_amount = booking_amount;
	}


	 public int getBooking_id() {
		 return booking_id;
	 }

	 public User getUser_id() {
		 return user;
	 }

	 public Product getProduct_id() {
		 return product;
	 }

	 public int getBooking_amount() {
		 return booking_amount;
	 }

	 public void setBooking_id(int booking_id) {
		 this.booking_id = booking_id;
	 }

	 public void setUser_id(User user_id) {
		 this.user = user_id;
	 }

	 public void setProduct_id(Product product_id) {
		 this.product = product_id;
	 }

	 public void setBooking_amount(int booking_amount) {
		 this.booking_amount = booking_amount;
	 }

	 @Override
	public String toString() {
		return "Booking [booking_id=" + booking_id + ", user_id=" + user.getUser_name()  + ", product_id=" + product.getProduct_name() 
				+ ", booking_amount=" + booking_amount + "]";
	}
	 
	 
}

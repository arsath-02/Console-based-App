package model;

public class User {
	private static int Idcounter=0;
	private int user_id;
	private String password;
	private String user_name;
	private int phoneno;
	private String address;
	
	public User(String user_name,String password,int phoneno,String address){
		this.user_id= ++Idcounter;
		this.password = password;
		this.user_name = user_name;
		this.phoneno = phoneno;
		this.address = address;
	}

	public int getUser_id() {
		return user_id;
	}
	public String getPassword() {
		return password;
	}
	public String getUser_name() {
		return user_name;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public String getAddress() {
		return address;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", phoneno=" + phoneno + ", address=" + address
				+ "]";
	}
	
	
}

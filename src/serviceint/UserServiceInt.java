package serviceint;

import java.util.*;
import model.User;


public interface UserServiceInt {
	public void registerUser(String name, String password, int phoneno, String address);
		public void deleteUser(int id);
		public List<User>getAllUsers();
		public User getById(int user_id);
		public User login(String username,String password);
		
}

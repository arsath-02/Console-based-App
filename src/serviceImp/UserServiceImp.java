package serviceImp;

import java.util.*;

import daoimp.Userdaoimp;
import model.User;
import serviceint.UserServiceInt;
public class UserServiceImp implements UserServiceInt{
	Userdaoimp Userdao = new Userdaoimp();
	
	@Override
	public void registerUser(String name, String password, int phoneno, String address) {
		// TODO Auto-generated method stub
		User user = new User(name, password, phoneno,address);
		Userdao.save_user(user);
		System.out.println("User registered successfully: " + user);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		Userdao.delete_user(id);
		System.out.println("User deleted successfully: " + id);
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		System.out.println("All Users fetched successfully: ");
		return Userdao.FindAllUser();
	}

	@Override
	public User getById(int user_id) {
		// TODO Auto-generated method stub
		System.out.println("User fetched successfully: ");
		return Userdao.findById(user_id);
	}

	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return Userdao.login(username, password);
	}
	
	


}

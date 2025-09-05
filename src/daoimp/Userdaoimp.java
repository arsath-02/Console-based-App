package daoimp;
import java.util.*;

import daoInt.Userdaoint;
import model.User;

public class Userdaoimp implements Userdaoint{

	private static List<User> users = new ArrayList<>();
	@Override
	public void save_user(User user) {
		// TODO Auto-generated method stub
		users.add(user);
		
	}

	@Override
	public void delete_user(int user_id) {
		// TODO Auto-generated method stub
		for(User u : users) {
			if(u.getUser_id() == user_id) {
				users.remove(u);
				break;
			}
		}
		
	}

	@Override
	public User findById(int user_id) {
		// TODO Auto-generated method stub
		for(User u:users) {
			if(u.getUser_id() == user_id) {
				return u;	
			}
		}
		return null;
	}

	@Override
	public List<User> FindAllUser() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public User login(String userName, String password) {
		// TODO Auto-generated method stub
		for(User u:users) {
			if(u.getUser_name().equals(userName) && u.getPassword().equals(password)) {
				return u;	
			}
		}
		return null;
	}



	
}

package daoInt;
import java.util.*;

import model.User;

public interface Userdaoint {
	public void save_user(User user);
	public  User login(String userName,String password);
	public void delete_user(int user_id);
	public User findById(int user_id);
	public List<User> FindAllUser();
}

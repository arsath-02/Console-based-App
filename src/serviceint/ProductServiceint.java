package serviceint;


import java.util.*;
import model.Product;
public interface ProductServiceint {
	public void registerProduct(String name,int price);
	public void deleteProduct(int id);
	public List<Product> findAll();
	public  Product findById(int id);
	 
}

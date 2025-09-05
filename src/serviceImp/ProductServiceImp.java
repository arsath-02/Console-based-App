package serviceImp;

import java.util.*;
import model.Product;
import daoimp.Productdaoimp;
import serviceint.ProductServiceint;

public class ProductServiceImp implements ProductServiceint{
	Productdaoimp Productdao = new Productdaoimp();
	@Override
	public void registerProduct(String name, int price) {
		// TODO Auto-generated method stub
		Product product = new Product(name,price);
		Productdao.save(product);
		System.out.println("Product registered successfully: " + product);
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		Productdao.delete(id);
		System.out.println("Product deleted successfully: " + id);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		System.out.println("Product fetched successfully: ");
		return Productdao.findAll();
		
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		System.out.println("Product fetched successfully: " );
		return Productdao.findById(id);
	}

}

package daoimp;
import java.util.*;

import daoInt.Productdaoint;
import model.Product;

public class Productdaoimp  implements Productdaoint{
	private static List<Product> products = new ArrayList<>();
	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		products.add(product);
	}

	@Override
	public void delete(int product_id) {
		// TODO Auto-generated method stub
		for(Product p:products) {
			if(p.getProduct_id() == product_id) {
				products.remove(p);
				break;
			}
		}
	}

	@Override
	public Product findById(int product_id) {
		// TODO Auto-generated method stub
		for(Product p : products) {
			if(p.getProduct_id() == product_id) {
				return p;
			}
		}
		return null;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return products;
	}
	
}

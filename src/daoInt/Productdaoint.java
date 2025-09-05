package daoInt;

import model.Product;
import java.util.*;


public interface Productdaoint {
		public void save(Product product);
		public void delete(int product_id);
		public Product findById(int product_id);
		public List<Product> findAll();
}

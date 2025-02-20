package inventory_tracker;
import java.util.*;
public class TestMain {
	public static void main(String[] args) {
		Map<Integer, List<Product>> stocklevel=new HashMap<>();
		
		List<Product> product1 = new ArrayList<>();
		product1.add(new Product("Apple",10));
		product1.add(new Product("Samsung",7));
		
		List<Product> product2 = new ArrayList<>();
		product2.add(new Product("Redmi",0));
		product2.add(new Product("Realme",4));
		
		List<Product> product3 = new ArrayList<>();
		product3.add(new Product("Vivo",3));
		product3.add(new Product("Oppo",8));
		
		stocklevel.put(001, product1);
		stocklevel.put(002, product2);
		stocklevel.put(003, product3);
		
		Iterator<Map.Entry<Integer, List<Product>>> iterator=stocklevel.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, List<Product>> entry = iterator.next();
            List<Product> productList = entry.getValue();
            Iterator<Product> productIterator = productList.iterator();
            while (productIterator.hasNext()) {
                Product product = productIterator.next();
                if (product.getStock() == 0) {
                    productIterator.remove();
                }
            }
            if (productList.isEmpty()) {
                iterator.remove();
            }
		}
		printStock(stocklevel);	
	}
	public static void printStock(Map<Integer, List<Product>> stocklevel) {
        for (Map.Entry<Integer, List<Product>> entry : stocklevel.entrySet()) {
            System.out.println("Product ID: " + entry.getKey());
            for (Product product : entry.getValue()) {
                System.out.println("  " + product);
            }
        }
    }
}

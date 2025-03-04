package productTask;

import java.util.*;

import employee_test.Employee;

public class ProductList {
	Map<String, List<Product>> productMap = new HashMap<>();

	public void addProduct(Product product) {
		String categories = product.getCategory();
		if (!productMap.containsKey(categories)) {
			productMap.put(categories, new ArrayList<>());
		}
		List<Product> productList = productMap.get(categories);
		productList.add(product);

		productList.sort(Comparator.comparing(Product::getPrice));
		System.out.println(product);
	}

	public void getProduct(String category) {
		List<Product> productList = productMap.get(category);
		if (productList != null) {
			productList.sort((product1, product2) -> product2.getPrice().compareTo(product1.getPrice()));
			for (Product produ : productList) {
				System.out.println(produ);
			}
		}
	}
}

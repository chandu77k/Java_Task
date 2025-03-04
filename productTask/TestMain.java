package productTask;

import java.util.*;

import employee.Department;

public class TestMain {

	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter Product : ");
//		
//		Product product =new Product(101, "samsung", 9999.00,"mobile");
//		
//		DiscountedProduct discountedProduct = new DiscountedProduct(102, "realme", 7777.00,"mobile");
//		
//		String prodName = scanner.next();
//		if(prodName.equalsIgnoreCase("samsung")) {
//			product.getProductId();
//			product.getProductName();
//			product.getCategory();
//			product.extraDetails();
//		}
//		if(prodName.equalsIgnoreCase("realme")) {
//			discountedProduct.getProductId();
//			discountedProduct.getProductName();
//			discountedProduct.getCategory();
//			discountedProduct.extraDetails();
//		}
		try {
			Product prod1 = new Product(101, "samsung", 9999.76, "mobile");
			Product prod2 = new Product(102, "realme", 7777.23, "mobile");

			System.out.println("Added Products : ");
			ProductList productlist = new ProductList();
			productlist.addProduct(prod1);
			productlist.addProduct(prod2);

			System.out.println("Get products using Categories");
			productlist.getProduct("mobile");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

package productTask;

public class DiscountedProduct extends Product {
	public Integer discount;

	public DiscountedProduct(Integer productId, String productName, Double price, String category) {
		super(productId, productName, price, category);
		// TODO Auto-generated constructor stub
	}

	public void extraDetails() {
		System.out.println("Extra Details on Discount");
	}
}

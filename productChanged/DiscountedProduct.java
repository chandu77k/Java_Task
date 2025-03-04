package productChanged;

/**
 * DiscountedProduct extends the product class and inherits product class properties
 */
public class DiscountedProduct extends Product {
	public Integer discountPercentage;
	/**
	 * 
	 * @param productId takes id from product class
	 * @param productName takes name from product class
	 * @param price takes price from product class
	 * @param category takes category from product class
	 * @param discountPercentage discount on product
	 */
	public DiscountedProduct(Integer productId, String productName, Double price, String category, Integer discountPercentage) {
		super(productId, productName, price, category);
		this.discountPercentage = discountPercentage;
	}
	
	public Integer getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Integer discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	public String toString() {
		return super.toString()+" Discount Percentage : "+discountPercentage;
	}

	public void extraDetails() {
		System.out.println("Extra Details on Discount.....");
	}

}

package productTask;

public class Product {
	private Integer productId;
	private String productName;
	private Double price;
	private String category;

	public Product(Integer productId, String productName, Double price, String category) {
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void extraDetails() {
		System.out.println("Extra Details");
	}

	public String toString() {
		return "Product Id : " + productId + " Product name : " + productName + " Category : " + category + " Price : "
				+ price;
	}
}

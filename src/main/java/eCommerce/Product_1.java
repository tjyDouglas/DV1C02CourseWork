package eCommerce;

public class Product_1 {
	
	protected String productName;
	protected String description;
	protected String location;
	protected String sellerName;
	public Product_1(String productName, String description, String location, String sellerName) {
		super();
		this.productName = productName;
		this.description = description;
		this.location = location;
		this.sellerName = sellerName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

}

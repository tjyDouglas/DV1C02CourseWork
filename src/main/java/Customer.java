
public class Customer {
	
	protected String customerName;
	protected String description;
	protected String location;
	protected String sellerName;
	public Product(String customerName, String description, String location, String sellerName) {
		super();
		this.customerName = customerName;
		this.description = description;
		this.location = location;
		this.sellerName = sellerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setProductName(String customerName) {
		this.customerName = customerName;
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

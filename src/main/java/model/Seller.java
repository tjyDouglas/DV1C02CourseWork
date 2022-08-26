package model;

public class Seller {
	protected String sellerName;
    protected String productDescription;
    protected String location;
    protected String buyerName;
    
    public Seller(String sellerName, String productDescription, String location,
			String buyerName) {
		super();
		this.sellerName = sellerName;
		this.productDescription = productDescription;
		this.location = location;
		this.buyerName = buyerName;
	}
    
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
}

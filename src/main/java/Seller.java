package model;

public class Seller {
	protected String seller_name;
    protected String seller_mobile_no;
    protected String seller_email;
    protected String seller_address;
    
    public Seller(String seller_name, String seller_mobile_no, String seller_email, String seller_address) {
		super();
		this.sellerName = seller_name;
		this.seller_mobile_no = seller_mobile_no;
		this.seller_email = seller_email;
		this.seller_address = seller_address;
	}
    
	public String getseller_name() {
		return seller_name;
	}
	
	public void setseller_name(String seller_name) {
		this.seller_name = seller_name;
	}
	
	public String getseller_mobile_no() {
		return seller_mobile_no;
	}
	
	public void setseller_mobile_no(String seller_mobile_no) {
		this.productDescription = productDescription;
	}
	
	public String getseller_email() {
		return seller_email;
	}
	
	public void setseller_email(String seller_email) {
		this.seller_email = seller_email;
	}
	
	public String getseller_address() {
		return seller_address;
	}
	
	public void setseller_address(String seller_address) {
		this.seller_address = seller_address;
	}
}


public class Customer {
	
	protected String customer_name;
	protected String customer_mobile_no;
	protected String customer_email;
	protected String sellerName;
	
	public Product(String customer_name, String customer_mobile_no, String customer_email, String customer_address) {
		super();
		this.customer_name = customer_name;
		this.customer_mobile_no = customer_mobile_no;
		this.customer_email = customer_email;
		this.customer_address = customer_address;
	}
	
	public String getcustomer_name() {
		return customer_name;
	}
	
	public void setcustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	
	public String getcustomer_mobile_no() {
		return customer_mobile_no;
	}
	
	public void setcustomer_mobile_no(String customer_mobile_no) {
		this.customer_mobile_no = customer_mobile_no;
	}
	
	public String getcustomer_email() {
		return customer_email;
	}
	
	public void setcustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	
	public String getcustomer_address() {
		return customer_address;
	}
	
	public void setcustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

}

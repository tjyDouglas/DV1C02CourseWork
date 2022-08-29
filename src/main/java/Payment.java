public class Payment {
    
	    protected String payment_amount;
	    protected String payment_currency;
	    protected String payment_method;
	    protected String payment_date;

	    
	    public Payment(String payment_amount, String payment_currency, String payment_method, String payment_date) {
	        super();
	        this.payment_amount = payment_amount;
	        this.payment_currency = payment_currency;
	        this.payment_method = payment_method;
	        this.payment_date = payment_date;
	    }
	    
	    public String getpayment_amount() {
	        return payment_amount;
	    }
	    
	    public void setpayment_amount(String payment_amount) {
	        this.payment_amount = payment_amount;
	    }
	    
	    public String getpayment_currency() {
	        return payment_currency;
	    }
	    
	    public void setpayment_currency(String payment_currency) {
	        this.payment_currency = payment_currency;
	    }
	    
	    public String getpayment_method() {
	        return payment_method;
	    }
	    
	    public void setpayment_method(String payment_method) {
	        this.payment_method = payment_method;
	    }
	    
	    public String getpayment_date() {
	        return payment_date;
	    }
	    
	    public void setpayment_date(String payment_date) {
	        this.payment_date = payment_date;
	    }
}

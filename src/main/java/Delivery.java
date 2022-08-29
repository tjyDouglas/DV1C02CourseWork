public class Delivery {
    
    protected String delivery_name;
    protected String delivery_type;
    protected String delivery_date;
    protected String delivery_address;

    
    public Delivery(String delivery_name, String delivery_type, String delivery_date, String delivery_address) {
        super();
        this.delivery_name = delivery_name;
        this.delivery_type = delivery_type;
        this.delivery_date = delivery_date;
        this.delivery_address = delivery_address;
    }
    
    public String getdelivery_name() {
        return delivery_name;
    }
    
    public void setdelivery_name(String delivery_name) {
        this.delivery_name = delivery_name;
    }
    
    public String getdelivery_type() {
        return delivery_type;
    }
    
    public void setdelivery_type(String delivery_type) {
        this.delivery_type = delivery_type;
    }
    
    public String getdelivery_date() {
        return delivery_date;
    }
    
    public void setdelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }
    
    public String getdelivery_address() {
        return delivery_address;
    }
    
    public void setdelivery_address(String delivery_address) {
        this.delivery_address = delivery_address;
    }
   
}


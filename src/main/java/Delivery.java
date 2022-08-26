public class Delivery {
    
    protected String deliveryName;
    protected String description;
    protected String location;
    protected String sellerName;
    public Delivery(String deliveryName, String description, String location, String sellerName, String buyerName) {
        super();
        this.deliveryName = deliveryName;
        this.description = description;
        this.location = location;
        this.sellerName = sellerName;
	this.buyerName = buyerName;

    }
    public String getDeliveryName() {
        return deliverName;
    }
    public void setDeliveryName(String deliverName) {
        this.deliverName = deliverName;
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
   public String getBuyerName() {
        return buyerName;
    }
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }


}

